package com.github.zibranki.model

import java.math.BigDecimal
import java.time.LocalDateTime

/**
 * Payment request, but converted to strict data types and validated
 */
data class ValidatedPaymentRequest(
    val price: BigDecimal,
    val priceModifier: BigDecimal,
    val paymentMethod: PaymentMethod,
    val dateTime: LocalDateTime,
)

enum class PaymentMethod(
    val lowestPriceModifier: String,
    val highestPriceModifier: String,
    val pointsRatio: String,
) {
    CASH("0.9", "1", "0.05"),
    CASH_ON_DELIVERY("1", "1.02", "0.05"),
    VISA("0.95", "1", "0.03"),
    MASTERCARD("0.95", "1", "0.03"),
    AMEX("0.98", "1.01", "0.02"),
    JCB("0.95", "1", "0.05"),
    ;

    companion object {
        private val parseMap = values().associateBy { it.name.lowercase() }

        fun parse(value: String): PaymentMethod? = parseMap[value]
    }
}
