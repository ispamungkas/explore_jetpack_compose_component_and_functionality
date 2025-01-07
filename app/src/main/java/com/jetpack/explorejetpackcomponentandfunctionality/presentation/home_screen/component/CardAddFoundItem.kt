package com.jetpack.explorejetpackcomponentandfunctionality.presentation.home_screen.component

import android.content.res.Configuration
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun CardAddFoundItem(modifier: Modifier = Modifier, onClick: () -> Unit) {
    Surface(
        modifier = modifier.height(200.dp),
        shadowElevation = 10.dp,
        shape = RoundedCornerShape(20.dp),
        onClick = onClick
    ) {
        Column(
            verticalArrangement = Arrangement.Center,
            modifier = Modifier
                .fillMaxHeight()
                .padding(5.dp)
        ) {
            Icon(
                Icons.Default.Add,
                contentDescription = "AddIon",
                Modifier.size(30.dp),
                tint = MaterialTheme.colorScheme.onSurface,
            )
        }
    }
}

@Preview(
    showBackground = true,
    name = "light"
)
@Preview(
    showBackground = true,
    name = "Dark",
    uiMode = Configuration.UI_MODE_NIGHT_YES
)
@Composable
private fun CardPrev() {
    CardAddFoundItem() {}
}