package com.jetpack.explorejetpackcomponentandfunctionality.presentation.home_screen.component

import android.annotation.SuppressLint
import android.content.res.Configuration
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
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
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.jetpack.explorejetpackcomponentandfunctionality.R
import com.jetpack.explorejetpackcomponentandfunctionality.model.IntradayInfo
import com.jetpack.explorejetpackcomponentandfunctionality.ui.theme.ExploreJetpackComponentAndFunctionalityTheme
import com.jetpack.explorejetpackcomponentandfunctionality.utils.ObjectDummy


@SuppressLint("NewApi")
@Composable
fun CardFoundsItem(modifier: Modifier = Modifier, infos: List<IntradayInfo>) {
    Surface(
        shape = RoundedCornerShape(20.dp),
        shadowElevation = 10.dp,
        modifier = modifier
            .height(200.dp)
            .width(200.dp)
    ) {
        Column(
            modifier = Modifier
                .fillMaxHeight()
                .fillMaxWidth()
        ) {
            Row(
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier.padding(top = 15.dp, start = 15.dp, end = 15.dp).weight(0.25f)
            ) {
                Image(
                    painter = painterResource(R.drawable.sample_background),
                    contentDescription = "Image of coin",
                    contentScale = ContentScale.Crop,
                    modifier = Modifier
                        .size(35.dp)
                        .clip(shape = RoundedCornerShape(100.dp)),
                )
                Spacer(
                    modifier = Modifier.width(10.dp)
                )
                Column {
                    Text(
                        "Bitcoin",
                        style = MaterialTheme.typography.bodyLarge.copy(
                            color = MaterialTheme.colorScheme.onSurface,
                            fontWeight = FontWeight.SemiBold
                        ),
                    )
                    Text(
                        "BTC",
                        style = MaterialTheme.typography.bodyLarge.copy(
                            color = MaterialTheme.colorScheme.onSurfaceVariant,
                            fontWeight = FontWeight.SemiBold
                        ),
                    )
                }
            }
            val latest = infos.last()
            val lastOne = infos[infos.size - 2]
            val color = if (latest.close < lastOne.close) Color.Red else Color.Green
            StockChart(
                infos = infos,
                modifier = Modifier
                    .height(60.dp)
                    .padding(start = 15.dp, end = 5.dp)
                    .fillMaxWidth(),
                graphColor = color,
                showParameter = false
            )

            Column(
                verticalArrangement = Arrangement.Bottom,
                modifier = Modifier.padding(start = 15.dp, bottom = 15.dp).weight(0.25f)
            ) {
                Text(
                    "$2,899.00",
                    style = MaterialTheme.typography.bodyLarge.copy(
                        fontWeight = FontWeight.Bold,
                        color = MaterialTheme.colorScheme.onSurface
                    )
                )
                Row {
                    Text(
                        "$290,-",
                        style = MaterialTheme.typography.labelSmall.copy(
                            color = Color.Green
                        )
                    )
                    Spacer(
                        modifier = Modifier.width(5.dp)
                    )
                    Text(
                        "+0.001%",
                        style = MaterialTheme.typography.labelSmall.copy(
                            color = Color.Green
                        )
                    )
                }
            }
        }

    }
}

@SuppressLint("NewApi")
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
        CardFoundsItem(
            infos = ObjectDummy.getListOfIntradayInfo()
        )
    }
}