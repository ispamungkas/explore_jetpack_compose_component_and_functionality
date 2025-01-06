package com.jetpack.explorejetpackcomponentandfunctionality.presentation.home_screen.component

import android.content.res.Configuration
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.jetpack.explorejetpackcomponentandfunctionality.R
import com.jetpack.explorejetpackcomponentandfunctionality.ui.theme.ExploreJetpackComponentAndFunctionalityTheme


@Composable
fun CardFoundsItem(modifier: Modifier = Modifier) {
    Surface(
        modifier = modifier
    ) {
        Column(
            modifier = Modifier
                .padding(10.dp)
        ) {
            Row(
                verticalAlignment = Alignment.CenterVertically
            ) {
                Image(
                    painter = painterResource(R.drawable.sample_background),
                    contentDescription = "Image of coin",
                    contentScale = ContentScale.Crop,
                    modifier = Modifier
                        .size(24.dp)
                        .clip(shape = RoundedCornerShape(100.dp)),
                )
                Spacer(
                    modifier = Modifier.width(5.dp)
                )
                Column {
                    Text(
                        "Bitcoin",
                        style = MaterialTheme.typography.bodySmall.copy(
                            color = MaterialTheme.colorScheme.onSurface,
                            fontWeight = FontWeight.SemiBold
                        ),
                    )
                    Text(
                        "BTC",
                        style = MaterialTheme.typography.bodySmall.copy(
                            color = MaterialTheme.colorScheme.onSurfaceVariant,
                            fontWeight = FontWeight.SemiBold
                        ),
                    )
                }
            }
        }
    }
}

@Preview(
    name = "light",
    showBackground = true
)
@Preview(
    uiMode = Configuration.UI_MODE_NIGHT_YES,
    name = "Dark",
    showBackground = true,
)
@Composable
private fun CardFoundsPrev() {
    ExploreJetpackComponentAndFunctionalityTheme {
        CardFoundsItem()
    }
}