package com.github.zibranki

import com.github.zibranki.model.PaymentMethod
import com.github.zibranki.model.PaymentMethod.CASH_ON_DELIVERY
import com.github.zibranki.model.PaymentMethod.JCB
import com.github.zibranki.model.PaymentMethod.VISA
import com.github.zibranki.model.PaymentRequest
import com.github.zibranki.model.PaymentResponse
import com.github.zibranki.model.SalesRequest
import com.github.zibranki.model.SalesResponse
import com.github.zibranki.model.SalesStats
import com.github.zibranki.service.PaymentsService
import io.grpc.Status
import io.grpc.StatusRuntimeException
import io.grpc.internal.testing.StreamRecorder
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import java.util.concurrent.TimeUnit

@SpringBootTest
class BaseTest {

    @Autowired
    lateinit var paymentsService: PaymentsService

    @Test
    fun `should calculate points correctly and return resulting price`() {
        val paymentRequest = PaymentRequest.newBuilder()
            .setPrice("100.00")
            .setPriceModifier(0.95)
            .setPaymentMethod("MASTERCARD")
            .setDatetime("2000-01-01T00:00:00Z")
            .build()

        val responseObserver: StreamRecorder<PaymentResponse> = StreamRecorder.create()
        paymentsService.processPayment(paymentRequest, responseObserver)
        responseObserver.awaitCompletion(5, TimeUnit.SECONDS)

        assertThat(responseObserver.error).isNull()
        assertThat(responseObserver.values).hasSize(1)

        val paymentResponse = responseObserver.values.first()
        assertThat(paymentResponse.finalPrice).isEqualTo("95.00")
        assertThat(paymentResponse.points).isEqualTo(3) // for MASTERCARD points ratio is 0.03 => 100 * 0.03 = 3
    }

    @Test
    fun `should return error if price modifier is out of allowed range`() {
        val paymentRequest = PaymentRequest.newBuilder()
            .setPrice("100.00")
            .setPriceModifier(0.5)
            .setPaymentMethod("CASH")
            .setDatetime("2000-01-01T00:00:00Z")
            .build()

        val responseObserver: StreamRecorder<PaymentResponse> = StreamRecorder.create()
        paymentsService.processPayment(paymentRequest, responseObserver)
        responseObserver.awaitCompletion(5, TimeUnit.SECONDS)

        assertThat(responseObserver.values).isEmpty()
        assertThat(responseObserver.error).isExactlyInstanceOf(StatusRuntimeException::class.java)

        val error = responseObserver.error as StatusRuntimeException
        assertThat(error.status.code).isEqualTo(Status.INVALID_ARGUMENT.code)
        assertThat(error.status.description).isEqualTo("Price Modifier of 0.5 is lower than minimum allowed modifier of 0.9")
    }

    @Test
    fun `should return aggregated sales stats`() {
        simulatePayment("73.50", 1.0, VISA, "2000-01-01T12:30:00Z")
        simulatePayment("15.34", 1.02, CASH_ON_DELIVERY, "2000-01-01T12:41:19Z")
        simulatePayment("499.99", 0.95, JCB, "2000-01-01T19:00:00Z")

        val salesRequest = SalesRequest.newBuilder()
            .setStartDateTime("2000-01-01T00:00:00Z")
            .setEndDateTime("2000-01-02T00:00:00Z")
            .build()

        val responseObserver: StreamRecorder<SalesResponse> = StreamRecorder.create()
        paymentsService.getSalesStats(salesRequest, responseObserver)
        responseObserver.awaitCompletion(5, TimeUnit.SECONDS)

        assertThat(responseObserver.error).isNull()
        assertThat(responseObserver.values).hasSize(1)

        val expectedResponse = SalesResponse.newBuilder()
        expectedResponse.addSales(
            SalesStats.newBuilder().setSales("89.15").setPoints(3).setDatetime("2000-01-01T12:00:00Z")
        )
        expectedResponse.addSales(
            SalesStats.newBuilder().setSales("474.99").setPoints(25).setDatetime("2000-01-01T19:00:00Z")
        )

        assertThat(responseObserver.values.first()).isEqualTo(expectedResponse.build())
    }

    private fun simulatePayment(price: String, modifier: Double, method: PaymentMethod, dateTime: String) {
        val paymentRequest = PaymentRequest.newBuilder()
            .setPrice(price)
            .setPriceModifier(modifier)
            .setPaymentMethod(method.name)
            .setDatetime(dateTime)
            .build()

        val responseObserver: StreamRecorder<PaymentResponse> = StreamRecorder.create()
        paymentsService.processPayment(paymentRequest, responseObserver)
        responseObserver.awaitCompletion(5, TimeUnit.SECONDS)
    }
}
