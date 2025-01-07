package com.jetpack.explorejetpackcomponentandfunctionality.presentation.home_screen

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Tab
import androidx.compose.material3.TabRow
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import com.jetpack.explorejetpackcomponentandfunctionality.presentation.home_screen.tab_page.BiggestMovementTab
import com.jetpack.explorejetpackcomponentandfunctionality.presentation.home_screen.tab_page.MostPopularTab
import com.jetpack.explorejetpackcomponentandfunctionality.presentation.home_screen.tab_page.RecommendationTab

@Composable
fun TabScreen(modifier: Modifier = Modifier) {
    var tsIndex by remember {
        mutableIntStateOf(0)
    }

    val listOfTab = listOf("Most Popular", "Biggest Movement", "Recommendation")

    Column(
        modifier = modifier.fillMaxWidth()
    ) {
        TabRow(selectedTabIndex = tsIndex) {
            listOfTab.forEachIndexed { index, s ->
                Tab(text = { Text(s, style = MaterialTheme.typography.labelMedium) }, selected = tsIndex == index, onClick = { tsIndex = index })
            }
        }
        when (tsIndex) {
            0 -> MostPopularTab()
            1 -> BiggestMovementTab()
            2 -> RecommendationTab()
        }
    }

}