package com.jetpack.explorejetpackcomponentandfunctionality.presentation.home_screen

import android.content.res.Configuration
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.KeyboardArrowRight
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.drawWithCache
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.Rect
import androidx.compose.ui.graphics.BlendMode
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.CompositingStrategy
import androidx.compose.ui.graphics.Path
import androidx.compose.ui.graphics.drawscope.clipPath
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.jetpack.explorejetpackcomponentandfunctionality.R
import com.jetpack.explorejetpackcomponentandfunctionality.presentation.home_screen.component.CardAddFoundItem
import com.jetpack.explorejetpackcomponentandfunctionality.presentation.home_screen.component.CardFoundsItem
import com.jetpack.explorejetpackcomponentandfunctionality.presentation.home_screen.component.CardPorto
import com.jetpack.explorejetpackcomponentandfunctionality.ui.theme.ExploreJetpackComponentAndFunctionalityTheme
import com.jetpack.explorejetpackcomponentandfunctionality.utils.ObjectDummy

@Composable
fun HomeScreen(modifier: Modifier = Modifier) {
    Scaffold(
        modifier = modifier,
    ) { paddingValues ->
        val isDark = isSystemInDarkTheme()

        Box(
            modifier = Modifier
                .fillMaxSize()
                .padding(paddingValues),
        ) {
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(500.dp)
                    .background(
                        brush = Brush.verticalGradient(
                            colors = listOf(
                                if (isDark) Color.White.copy(alpha = 0.1f) else Color.Black.copy(
                                    alpha = 0.1f
                                ),
                                Color.Transparent
                            ),
                        ),
                    )
            )
            Column(
                modifier = Modifier.align(alignment = Alignment.TopCenter)
            ) {
                TopAppBarWithHighlight()
                Spacer(modifier = Modifier.height(20.dp))
                CardPorto(
                    modifier = Modifier.padding(horizontal = 20.dp)
                )
                Spacer(
                    modifier = Modifier.height(20.dp)
                )
                Row(
                    horizontalArrangement = Arrangement.SpaceBetween,
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = 20.dp)
                ) {
                    Text("MY FOUNDS", style = MaterialTheme.typography.bodyLarge)
                    Row(verticalAlignment = Alignment.CenterVertically) {
                        Text(
                            "View all",
                            style = MaterialTheme.typography.bodyLarge.copy(fontWeight = FontWeight.Bold),
                        )
                        Icon(
                            Icons.Default.KeyboardArrowRight,
                            contentDescription = "View all Icons",
                            Modifier.size(24.dp),
                        )
                    }
                }
                Spacer(modifier = Modifier.height(10.dp))
                LazyRow(
                    horizontalArrangement = Arrangement.spacedBy(5.dp),
                    contentPadding = PaddingValues(5.dp)
                ) {
                    item {
                        CardAddFoundItem() {}
                    }
                    items(count = 5) {
                        CardFoundsItem(
                            infos = ObjectDummy.getListOfIntradayInfo()
                        )
                    }
                }
                Spacer(modifier = Modifier.height(10.dp))
                TabScreen(
                    modifier.padding(horizontal = 10.dp)
                )
            }
        }
    }
}

@Composable
fun TopAppBarWithHighlight(modifier: Modifier = Modifier) {
    Box(
        modifier = modifier
    ) {
        Column {
            Spacer(
                modifier = Modifier.height(20.dp)
            )
            Row(
                verticalAlignment = Alignment.CenterVertically
            ) {
                Image(
                    painter = painterResource(R.drawable.sample_background),
                    contentDescription = "Image user",
                    contentScale = ContentScale.Crop,
                    modifier = Modifier
                        .padding(start = 20.dp)
                        .weight(0.2f)
                        .aspectRatio(1f)
                        .graphicsLayer {
                            compositingStrategy = CompositingStrategy.Offscreen
                        }
                        .drawWithCache {
                            val path = Path()
                            path.addOval(
                                oval = Rect(
                                    topLeft = Offset.Zero,
                                    bottomRight = Offset(size.width, size.height)
                                )
                            )
                            onDrawWithContent {
                                clipPath(path) {
                                    this@onDrawWithContent.drawContent()
                                }
                                val dotSize = size.width / 8f
                                // Clip a white border for the content
                                drawCircle(
                                    Color.Black,
                                    radius = dotSize,
                                    center = Offset(
                                        x = size.width - dotSize,
                                        y = size.height - dotSize
                                    ),
                                    blendMode = BlendMode.Clear
                                )
                                // draw the red circle indication
                                drawCircle(
                                    Color.Green, radius = dotSize * 0.7f,
                                    center = Offset(
                                        x = size.width - dotSize,
                                        y = size.height - dotSize
                                    )
                                )
                            }
                        }
                )

                Column(
                    modifier = Modifier
                        .weight(0.6f)
                        .padding(horizontal = 15.dp)
                ) {
                    Text(
                        "Hello, Maspam!",
                        style = MaterialTheme.typography.bodyLarge.copy(fontWeight = FontWeight.Medium)
                    )
                    Text(
                        "maspam@gmail.com",
                        style = MaterialTheme.typography.bodyLarge.copy(fontWeight = FontWeight.Medium)
                    )
                }

                // Row Scope
                Icon(
                    imageVector = Icons.Default.Notifications,
                    contentDescription = "Icon Notification",
                    modifier = Modifier
                        .weight(0.2f)
                        .padding(end = 20.dp)
                )

            }

        }

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
        HomeScreen()
    }
}