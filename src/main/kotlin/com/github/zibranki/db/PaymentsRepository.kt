package com.github.zibranki.db

import org.springframework.data.jpa.repository.Query
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository
import java.time.LocalDateTime

@Repository
interface PaymentsRepository : CrudRepository<PaymentEntity, Long> {


    @Query(
        value = """
            SELECT
                date_trunc('hour', date_time) AS dateTime,
                sum(resulting_price) AS sales,
                sum(points) AS points
            FROM payment
            WHERE date_time >= :start AND date_time <= :end
            GROUP BY date_trunc('hour', date_time)
            ORDER BY date_trunc('hour', date_time)
        """,
        nativeQuery = true,
    )
    fun getSalesStats(start: LocalDateTime, end: LocalDateTime): List<SalesAggregate>
}
