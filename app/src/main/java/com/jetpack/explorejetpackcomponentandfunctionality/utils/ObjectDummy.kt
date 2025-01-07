package com.jetpack.explorejetpackcomponentandfunctionality.utils

import android.annotation.SuppressLint
import com.jetpack.explorejetpackcomponentandfunctionality.model.IntradayInfo
import java.time.LocalDateTime

object ObjectDummy {

    @SuppressLint("NewApi")
    fun getListOfIntradayInfo(): List<IntradayInfo> {
        return listOf(
            IntradayInfo(close = 150.5, date = LocalDateTime.of(2024, 1, 5, 9, 0)),
            IntradayInfo(close = 152.0, date = LocalDateTime.of(2024, 1, 5, 10, 0)),
            IntradayInfo(close = 149.8, date = LocalDateTime.of(2024, 1, 5, 11, 0)),
            IntradayInfo(close = 153.3, date = LocalDateTime.of(2024, 1, 5, 12, 0)),
            IntradayInfo(close = 151.7, date = LocalDateTime.of(2024, 1, 5, 13, 0)),
            IntradayInfo(close = 154.2, date = LocalDateTime.of(2024, 1, 5, 14, 0)),
            IntradayInfo(close = 153.0, date = LocalDateTime.of(2024, 1, 5, 15, 0))
        )
    }

}