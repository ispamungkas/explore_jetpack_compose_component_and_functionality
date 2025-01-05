package com.jetpack.explorejetpackcomponentandfunctionality.presentation.home_screen

import android.content.res.Configuration
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.jetpack.explorejetpackcomponentandfunctionality.R
import com.jetpack.explorejetpackcomponentandfunctionality.presentation.home_screen.component.CardPorto
import com.jetpack.explorejetpackcomponentandfunctionality.ui.theme.ExploreJetpackComponentAndFunctionalityTheme

@Composable
fun HomeScreen(modifier: Modifier = Modifier) {
    Scaffold(
        modifier = modifier,
        topBar = {
            TopAppBarWithHighlight()
        }
    ) { paddingValues ->
        LazyColumn(
            modifier = Modifier.padding(paddingValues)
        ) {

        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TopAppBarWithHighlight(modifier: Modifier = Modifier) {
    val isDark = isSystemInDarkTheme()

    Box(
        modifier = modifier
    ) {
        Column {
            TopAppBar(
                navigationIcon = {
                    Image(
                        painter = painterResource(R.drawable.sample_background),
                        contentDescription = "Image user",
                        contentScale = ContentScale.Crop,
                        modifier = Modifier
                            .padding(start = 10.dp)
                            .size(40.dp)
                            .clip(shape = RoundedCornerShape(100))
                    )
                },
                actions = {
                    // Row Scope
                    Icon(
                        imageVector = Icons.Default.Notifications,
                        contentDescription = "Icon Notification",
                        modifier = Modifier.padding(end = 10.dp)
                    )
                },
                title = {
                    Column(
                        modifier = Modifier.padding(horizontal = 5.dp)
                    ) {
                        Text(
                            "Hello, Maspam!",
                            style = MaterialTheme.typography.bodyMedium.copy(fontWeight = FontWeight.Medium)
                        )
                        Text(
                            "isuryapputrapamungkas@gmail.com",
                            style = MaterialTheme.typography.bodySmall.copy(fontWeight = FontWeight.Medium)
                        )
                    }
                }
            )
            CardPorto()
        }
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(50.dp)
                .background(
                    brush = Brush.verticalGradient(
                        colors = listOf(
                            if (isDark) Color.White.copy(alpha = 0.1f) else Color.Black.copy(alpha = 0.1f),
                            Color.Transparent
                        ),
                    ),
                )
        )
    }
}

@Preview(
    showBackground = true,
    name = "Light",
    device = "id:pixel_5"
)
@Preview(
    showBackground = true,
    uiMode = Configuration.UI_MODE_NIGHT_YES,
    name = "Dark",
    device = "id:pixel_5"
)
@Composable
private fun ComponentPrev() {
    ExploreJetpackComponentAndFunctionalityTheme {
        HomeScreen(
        )
    }
}