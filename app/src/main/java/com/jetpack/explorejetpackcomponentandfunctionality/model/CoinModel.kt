package com.jetpack.explorejetpackcomponentandfunctionality.model

data class CoinModel(
    val name : String,
    val label : String,
    val marketCap : Double,
    val track : List<IntradayInfo>
)
