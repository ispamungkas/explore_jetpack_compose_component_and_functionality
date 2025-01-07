package com.jetpack.explorejetpackcomponentandfunctionality.presentation.home_screen.component

import android.annotation.SuppressLint
import android.graphics.Paint
import androidx.compose.foundation.Canvas
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Path
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.asAndroidPath
import androidx.compose.ui.graphics.asComposePath
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.graphics.nativeCanvas
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.jetpack.explorejetpackcomponentandfunctionality.model.IntradayInfo
import kotlin.math.round
import kotlin.math.roundToInt

@SuppressLint("NewApi")
@Composable
fun StockChart(modifier: Modifier = Modifier, infos: List<IntradayInfo>, graphColor: Color = Color.Green, showParameter : Boolean) {
    var spacing = 100f
    if (showParameter) {
        spacing = 100f
    } else {
        spacing = 1f
    }
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

    Canvas(modifier = modifier) {
        val spacingPerHour = (size.width - spacing) / infos.size
        if (showParameter) {
            for (i in infos.indices step 2) {
                val info = infos[i]
                val hour = info.date.hour
                drawContext.canvas.nativeCanvas.apply {
                    drawText(hour.toString(), spacing + i * spacingPerHour, size.height - 5, paintText)
                }
            }

            val priceStep = (upperValue - underValue) / 5f
            (0..5).forEach { i ->
                drawContext.canvas.nativeCanvas.apply {
                    drawText(
                        round(underValue + priceStep * i).toString(),
                        30f,
                        size.height - spacing - i * size.height / 5f,
                        paintText
                    )
                }
            }
        }
        var lastX = 0f
        val strokePath = Path().apply {
            val height = size.height
            for (i in infos.indices) {
                val info = infos[i]
                val nextInfo = infos.getOrNull(i + 1) ?: infos.last()
                val leftRatio = (info.close - underValue) / (upperValue - underValue)
                val rightRatio = (nextInfo.close - underValue) / (upperValue - underValue)

                val x1 = spacing + i * spacingPerHour
                val y1 = height - spacing - (leftRatio * height).toFloat()
                val x2 = spacing + (i + 1) * spacingPerHour
                val y2 = height - spacing - (rightRatio * height).toFloat()

                if (i == 0) {
                    moveTo(
                        x1, y1
                    )
                }
                lastX = (x1 + x2) / 2f
                quadraticBezierTo(
                    x1, y1, lastX, (y1 + y2) / 2f
                )
            }
        }
        val fillPath = android.graphics.Path(strokePath.asAndroidPath())
            .asComposePath()
            .apply {
                lineTo(lastX, size.height - spacing)
                lineTo(spacing, size.height - spacing)
                close()
            }

        drawPath(
            path = fillPath,
            brush = Brush.verticalGradient(
                colors = listOf(
                    transparentGraphColor,
                    Color.Transparent
                ),
                endY = size.height - spacing
            )
        )

        drawPath(
            path = strokePath,
            color = graphColor,
            style = Stroke(
                width = 3.dp.toPx(),
                cap = StrokeCap.Round
            )
        )
    }
}