package com.jetpack.explorejetpackcomponentandfunctionality.model

import androidx.compose.runtime.Immutable
import java.time.LocalDateTime

@Immutable
data class IntradayInfo (
    val close : Double,
    val date: LocalDateTime
)