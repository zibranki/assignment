package com.github.zibranki.db

import com.github.zibranki.model.PaymentMethod
import java.math.BigDecimal
import java.time.LocalDateTime
import javax.persistence.Entity
import javax.persistence.EnumType
import javax.persistence.Enumerated
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id
import javax.persistence.Table

@Entity
@Table(name = "payment")
data class PaymentEntity(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long = 0,
    val price: BigDecimal,
    val priceModifier: BigDecimal,
    val resultingPrice: BigDecimal,
    @Enumerated(EnumType.STRING)
    val paymentMethod: PaymentMethod,
    val dateTime: LocalDateTime,
    val points: BigDecimal,
)
