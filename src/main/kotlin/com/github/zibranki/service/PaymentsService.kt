package com.github.zibranki.service

import com.github.zibranki.db.PaymentEntity
import com.github.zibranki.db.PaymentsRepository
import com.github.zibranki.model.PaymentMethod
import com.github.zibranki.model.PaymentRequest
import com.github.zibranki.model.PaymentResponse
import com.github.zibranki.model.PaymentsServiceGrpc.PaymentsServiceImplBase
import com.github.zibranki.model.SalesRequest
import com.github.zibranki.model.SalesResponse
import com.github.zibranki.model.SalesStats
import com.github.zibranki.model.ValidatedPaymentRequest
import com.github.zibranki.model.ValidatedSalesRequest
import io.grpc.Status
import io.grpc.stub.StreamObserver
import mu.KotlinLogging
import net.devh.boot.grpc.server.service.GrpcService
import java.math.BigDecimal
import java.math.RoundingMode
import java.time.LocalDateTime
import java.time.ZoneOffset.UTC
import java.time.format.DateTimeFormatter

@GrpcService
class PaymentsService(
    private val paymentsRepository: PaymentsRepository,
) : PaymentsServiceImplBase() {

    companion object {
        private val dateTimeFormatter = DateTimeFormatter.ISO_ZONED_DATE_TIME
        private val log = KotlinLogging.logger {}
    }

    /**
     * Calculate and return resulting price and points, save payment to the database for analytics
     */
    override fun processPayment(request: PaymentRequest, responseObserver: StreamObserver<PaymentResponse>) {
        val (validatedRequest, validationError) = validateAndConvertPaymentRequest(request)
        if (validationError != null) {
            log.error { "Got invalid payment request: $validationError" }
            responseObserver.onError(Status.INVALID_ARGUMENT.withDescription(validationError).asRuntimeException())
            return
        }
        validatedRequest!!

        val resultingPrice = validatedRequest.price.multiply(validatedRequest.priceModifier)
        val points = validatedRequest.price.multiply(BigDecimal(validatedRequest.paymentMethod.pointsRatio))
        val entity = PaymentEntity(
            price = validatedRequest.price,
            priceModifier = validatedRequest.priceModifier,
            resultingPrice = resultingPrice,
            paymentMethod = validatedRequest.paymentMethod,
            dateTime = validatedRequest.dateTime,
            points = points,
        )
        paymentsRepository.save(entity)

        log.info { "Saved payment: $entity" }

        val response = PaymentResponse.newBuilder()
            .setFinalPrice(resultingPrice.setScale(2, RoundingMode.HALF_UP).toPlainString())
            .setPoints(points.setScale(0, RoundingMode.HALF_UP).toInt())
            .build()
        responseObserver.onNext(response)
        responseObserver.onCompleted()
    }

    /**
     * Return analytics of sales and points for the specified period, broken down by hours range
     * Points have to be (according to grand design) an integer, they will be rounded up
     */
    override fun getSalesStats(request: SalesRequest, responseObserver: StreamObserver<SalesResponse>) {
        val (validatedRequest, validationError) = validateAndConvertSalesRequest(request)
        if (validationError != null) {
            log.error { "Got invalid sales request: $validationError" }
            responseObserver.onError(Status.INVALID_ARGUMENT.withDescription(validationError).asRuntimeException())
            return
        }
        validatedRequest!!

        val salesBuilder = SalesResponse.newBuilder()
        paymentsRepository.getSalesStats(validatedRequest.start, validatedRequest.end).forEach { aggregate ->
            val salesStats = SalesStats.newBuilder()
                .setDatetime(aggregate.getDateTime().atZone(UTC).format(dateTimeFormatter))
                .setSales(aggregate.getSales().setScale(2, RoundingMode.CEILING).toPlainString())
                .setPoints(aggregate.getPoints().setScale(0, RoundingMode.HALF_UP).toInt())
                .build()
            salesBuilder.addSales(salesStats)
        }
        responseObserver.onNext(salesBuilder.build())
        responseObserver.onCompleted()
    }

    private fun validateAndConvertPaymentRequest(request: PaymentRequest): Pair<ValidatedPaymentRequest?, String?> {
        val price = parseBigDecimal(request.price)
            ?: return null to "Price ${request.price} have unsupported number format"

        val priceModifier = BigDecimal(request.priceModifier).setScale(2, RoundingMode.HALF_UP)

        if (request.paymentMethod == null) return null to "Payment Method is not specified"
        val paymentMethod = PaymentMethod.parse(request.paymentMethod.lowercase())
            ?: return null to "Payment Method ${request.paymentMethod} is not supported"

        val lowestPriceModifier = BigDecimal(paymentMethod.lowestPriceModifier)
        if (priceModifier < lowestPriceModifier) {
            return null to "Price Modifier of ${request.priceModifier} is lower than minimum allowed modifier of $lowestPriceModifier"
        }

        val highestPriceModifier = BigDecimal(paymentMethod.highestPriceModifier)
        if (priceModifier > highestPriceModifier) {
            return null to "Price Modifier of $priceModifier is higher than maximum allowed modifier of $highestPriceModifier"
        }

        val dateTime = parseDateTime(request.datetime)
            ?: return null to "Date Time ${request.datetime} have unsupported format"

        return ValidatedPaymentRequest(
            price = price,
            priceModifier = priceModifier,
            paymentMethod = paymentMethod,
            dateTime = dateTime,
        ) to null
    }


    private fun validateAndConvertSalesRequest(request: SalesRequest): Pair<ValidatedSalesRequest?, String?> {
        val start = parseDateTime(request.startDateTime)
            ?: return null to "Start Date Time ${request.endDateTime} have unsupported format"

        val end = parseDateTime(request.endDateTime)
            ?: return null to "End Date Time ${request.endDateTime} have unsupported format"

        if (start >= end) {
            return null to "End Date ${request.endDateTime} must be later than Start Date ${request.startDateTime}"
        }
        return ValidatedSalesRequest(
            start = start,
            end = end,
        ) to null
    }

    /**
     * Seems that protobuf is not yet ready to enter The Enterprise world as it does not have native arbitrary precision numbers support
     * https://github.com/protocolbuffers/protobuf/issues/4406
     */
    private fun parseBigDecimal(value: String): BigDecimal? {
        return try {
            BigDecimal(value)
        } catch (ignored: Exception) {
            null
        }
    }

    /**
     * Would be completely unnecessary had everyone used protobuf
     * But without knowing who is our clients we can't guarantee that they know the format for a timestamp
     * These errors are much better than protobuf ones
     *
     * Also seems to be easier to use with postman
     */
    private fun parseDateTime(value: String): LocalDateTime? {
        return try {
            LocalDateTime.from(dateTimeFormatter.parse(value))
        } catch (ignored: Exception) {
            null
        }
    }
}
