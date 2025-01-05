package com.jetpack.explorejetpackcomponentandfunctionality.presentation

import android.content.res.Configuration
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.graphics.ColorMatrix
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.jetpack.explorejetpackcomponentandfunctionality.R
import com.jetpack.explorejetpackcomponentandfunctionality.ui.theme.ExploreJetpackComponentAndFunctionalityTheme

@Composable
fun InitialScreen(modifier: Modifier = Modifier, navigateToLogin: () -> Unit, navigateToRegister: () -> Unit) {
    Scaffold(
        modifier = modifier,
        contentWindowInsets = WindowInsets(0.dp),
    ) { paddingValues ->
        Box(
            modifier = Modifier
                .padding(paddingValues)
                .fillMaxSize()
        ) {
            Image(
                painter = painterResource(R.drawable.sample_background),
                contentScale = ContentScale.Crop,
                contentDescription = "Background Crypto",
                colorFilter = ColorFilter.colorMatrix(colorMatrix = ColorMatrix().apply {
                    setToSaturation(
                        0f
                    )
                }),
                modifier = Modifier.fillMaxSize()
            )
            Column(
                modifier = Modifier
                    .align(alignment = Alignment.BottomCenter)
                    .fillMaxWidth()
                    .padding(horizontal = 50.dp, vertical = 50.dp)
            ) {
                Text(
                    "Crypto Just Got Easier",
                    style = MaterialTheme.typography.displayLarge.copy(
                        color = Color.White,
                        fontWeight = FontWeight.Medium
                    ),
                    textAlign = TextAlign.Center
                )
                Spacer(
                    modifier = Modifier.height(70.dp)
                )
                Text(
                    "Experience seamless trading and secure asset management",
                    style = MaterialTheme.typography.headlineSmall.copy(color = Color.White),
                    textAlign = TextAlign.Center
                )
                Spacer(
                    modifier = Modifier.height(50.dp)
                )
                Button(
                    onClick = {
                        navigateToRegister()
                    },
                    modifier = Modifier
                        .height(50.dp)
                        .align(alignment = Alignment.CenterHorizontally)
                ) {
                    Text(
                        "Get Started",
                        style = MaterialTheme.typography.bodyMedium.copy(fontWeight = FontWeight.Medium)
                    )
                }
                Spacer(
                    modifier = Modifier.height(20.dp)
                )
                Text(
                    "Log In",
                    style = MaterialTheme.typography.bodyMedium.copy(
                        color = Color.White,
                        fontWeight = FontWeight.Medium
                    ),
                    modifier = Modifier
                        .align(alignment = Alignment.CenterHorizontally)
                        .clickable {
                            navigateToLogin()
                        }
                )

            }
        }
    }
}

@Preview(
    name = "Light",
    showBackground = true,
    showSystemUi = true,
    device = "id:pixel_5",
)
@Preview(
    name = "Dark",
    uiMode = Configuration.UI_MODE_NIGHT_YES,
    showSystemUi = true,
    showBackground = true,
    device = "id:pixel_5"
)
@Composable
private fun InitialScreenPrev() {
    ExploreJetpackComponentAndFunctionalityTheme {
        InitialScreen(
            navigateToRegister = {},
            navigateToLogin = {}
        )
    }
}