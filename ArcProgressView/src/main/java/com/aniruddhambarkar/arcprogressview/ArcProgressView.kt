package com.aniruddhambarkar.arcprogressmeter

import androidx.compose.animation.core.FastOutSlowInEasing
import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.animation.core.tween
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.geometry.Size

@Composable
fun ArcProgressView(
    modifier: Modifier = Modifier,
    progress: Float = 0f,
    strokeWidth: Dp = 18.dp,
    gradientColors: List<Color> =  listOf(
        Color(0xFFabacac)
    ),
    backgroundColor: Color = Color(0xFF2A2F4F),
    animationDuration: Int = 1200
) {
    val animatedProgress by animateFloatAsState(
        targetValue = progress,
        animationSpec = tween(animationDuration, easing = FastOutSlowInEasing),
        label = "progress"
    )

    Canvas(
        modifier = modifier
            .fillMaxWidth()
            .aspectRatio(1.5f) // ⬅️ NO padding here
    ) {
        val strokePx = strokeWidth.toPx()
        val diameter = size.height
        if (diameter <= 0f) return@Canvas // safety

        val radius = diameter / 2f

        val topLeft = Offset(
            (size.width - diameter) / 2f,
            strokePx / 2f
        )

        val arcSize = Size(diameter, diameter)

        val stroke = Stroke(
            width = strokePx,
            cap = StrokeCap.Round
        )

        // Background arc
        drawArc(
            color = backgroundColor,
            startAngle = 120f,
            sweepAngle = 300f,
            useCenter = false,
            topLeft = topLeft,
            size = arcSize,
            style = stroke
        )

        // Progress arc
        drawArc(
            brush = Brush.sweepGradient(
                colors = gradientColors,
                center = topLeft + Offset(radius, radius)
            ),
            startAngle = 120f,
            sweepAngle = 300f * animatedProgress,
            useCenter = false,
            topLeft = topLeft,
            size = arcSize,
            style = stroke
        )
    }
}