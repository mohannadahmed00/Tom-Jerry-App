package com.giraffe.tomjerryapp.components

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.giraffe.tomjerryapp.R
import com.giraffe.tomjerryapp.ui.theme.TomJerryAppTheme
import com.giraffe.tomjerryapp.ui.theme.white
import com.giraffe.tomjerryapp.ui.theme.yellow
import kotlin.math.cos
import kotlin.math.sin

@Composable
fun StateProgress(
    modifier: Modifier = Modifier.size(140.dp),
    progress: Float = .5f,
    strokeWidth: Dp = 2.dp,
    activeColor: Color = yellow,
    backgroundColor: Color = white,
    iconRes: Int = R.drawable.broken_heart,
) {
    val dotRadius = strokeWidth * 2
    Box(
        modifier = modifier
            .padding(dotRadius)
            .aspectRatio(1f),
        contentAlignment = Alignment.Center,
    ) {
        Box(
            modifier = Modifier
                .padding((strokeWidth.value / 2).dp)
                .fillMaxSize()
                .background(backgroundColor, shape = CircleShape),
            contentAlignment = Alignment.Center,
        ) {
            Image(
                modifier = Modifier.fillMaxSize(.6f),
                painter = painterResource(iconRes),
                contentDescription = "icon"
            )
        }
        CircularProgressIndicator(
            modifier = Modifier.fillMaxSize(),
            progress = { progress },
            color = activeColor,
            trackColor = Color.Transparent,
            strokeWidth = strokeWidth
        )
        Canvas(modifier = Modifier.fillMaxSize()) {
            val diameter = size.minDimension
            val radius = diameter / 2
            val angleRad = Math.toRadians((360f * progress - 90f).toDouble())
            val dotX = center.x + (radius - strokeWidth.toPx() / 2) * cos(angleRad).toFloat()
            val dotY = center.y + (radius - strokeWidth.toPx() / 2) * sin(angleRad).toFloat()
            drawCircle(
                color = activeColor,
                radius = dotRadius.toPx(),
                center = Offset(dotX, dotY)
            )
        }
    }
}

@Preview
@Composable
fun StateProgressPreview() {
    TomJerryAppTheme {
        StateProgress()
    }
}