package com.jetpack.explorejetpackcomponentandfunctionality.presentation.home_screen.component

import android.annotation.SuppressLint
import android.graphics.Paint
import androidx.compose.foundation.Canvas
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.nativeCanvas
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.unit.sp
import com.jetpack.explorejetpackcomponentandfunctionality.model.IntradayInfo
import kotlin.math.roundToInt

@SuppressLint("NewApi")
@Composable
fun StockChart(modifier: Modifier = Modifier, infos: List<IntradayInfo>, graphColor: Color) {
    val spacing = 100f
    val transparentGraphColor = remember {
        graphColor.copy(alpha = 0.5f)
    }
    val upperValue = remember(infos) {
        (infos.maxOfOrNull { it.close }?.plus(1))?.roundToInt() ?: 0
    }
    val underValue = remember(infos) {
        infos.minOfOrNull { it.close }?.toInt() ?: 0
    }
    val density = LocalDensity.current
    val paintText = remember {
        Paint().apply {
            color = android.graphics.Color.WHITE
            textAlign = Paint.Align.CENTER
            textSize = density.run { 12.sp.toPx() }
        }
    }

    Canvas(modifier = Modifier) {
        val spacingPerHour = (size.width - spacing) / infos.size
        for (i in infos.indices step 2) {
            val info = infos[i]
            val hour = info.date.hour
            drawContext.canvas.nativeCanvas.apply {
                drawText(hour.toString(), spacing + i * spacingPerHour, size.height - 5, paintText)
            }

            val priceStep = (upperValue - underValue) / 5f
            (1..5).forEach {
                drawContext.canvas.nativeCanvas.apply {
//                    drawText(
//                        round()
//                    )
                }
            }
        }
    }
}