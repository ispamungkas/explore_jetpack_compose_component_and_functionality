package com.jetpack.explorejetpackcomponentandfunctionality.presentation.home_screen.tab_page

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@Composable
fun BiggestMovementTab(modifier: Modifier = Modifier) {
    Column (
        modifier = modifier
            .fillMaxHeight(),
        verticalArrangement = Arrangement.Center,
    ) {
        Text("Under Development", style = MaterialTheme.typography.bodyLarge)
    }
}