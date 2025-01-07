package com.jetpack.explorejetpackcomponentandfunctionality.presentation.home_screen.tab_page

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.jetpack.explorejetpackcomponentandfunctionality.presentation.home_screen.component.CardCoinInfoHorizontal
import com.jetpack.explorejetpackcomponentandfunctionality.utils.ObjectDummy

@Composable
fun MostPopularTab(modifier: Modifier = Modifier) {
    LazyColumn (
        verticalArrangement = Arrangement.spacedBy(10.dp),
        contentPadding = PaddingValues(20.dp),
        modifier = modifier
            .fillMaxHeight(),
    ) {
        items(5) {
            CardCoinInfoHorizontal(
                infos = ObjectDummy.getListOfIntradayInfo()
            ) { }
        }
    }
}