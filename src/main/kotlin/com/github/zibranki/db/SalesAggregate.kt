package com.github.zibranki.db

import java.math.BigDecimal
import java.time.LocalDateTime

interface SalesAggregate {
    fun getDateTime(): LocalDateTime
    fun getSales(): BigDecimal
    fun getPoints(): BigDecimal
}
