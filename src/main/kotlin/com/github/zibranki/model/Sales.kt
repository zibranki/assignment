package com.github.zibranki.model

import java.time.LocalDateTime

/**
 * Sales request, but converted to strict data types and validated
 */
data class ValidatedSalesRequest(
    val start: LocalDateTime,
    val end: LocalDateTime,
)
