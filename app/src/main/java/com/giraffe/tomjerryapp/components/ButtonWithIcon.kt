package com.giraffe.tomjerryapp.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.giraffe.tomjerryapp.R
import com.giraffe.tomjerryapp.ui.theme.TomJerryAppTheme
import com.giraffe.tomjerryapp.ui.theme.blue
import com.giraffe.tomjerryapp.ui.theme.medium10
import com.giraffe.tomjerryapp.ui.theme.white

@Composable
fun ButtonWithIcon(
    modifier: Modifier = Modifier,
    iconRes: Int = R.drawable.cart,
    numberOfNotifications: Int? = null,
    roundedCornerSize: Dp = 8.dp,
    buttonSize: Dp = 30.dp,
    iconSize: Dp = 16.dp,
    borderColor: Color = blue,
    iconColor: Color = blue,
    backgroundColor: Color = Color.Transparent
) {
    val topBtnPadding = if (numberOfNotifications != null) 4.dp else 0.dp
    val endBtnPadding = if (numberOfNotifications != null) 1.dp else 0.dp
    Box(modifier = modifier) {
        Box(
            modifier = Modifier
                .padding(top = topBtnPadding, end = endBtnPadding)
                .size(buttonSize)
                .background(backgroundColor, shape = RoundedCornerShape(roundedCornerSize))
                .border(
                    width = 1.dp,
                    color = borderColor,
                    shape = RoundedCornerShape(roundedCornerSize)
                ),
            contentAlignment = Alignment.Center
        ) {
            Image(
                modifier = Modifier
                    .padding(7.dp)
                    .size(iconSize),
                painter = painterResource(iconRes),
                colorFilter = ColorFilter.tint(iconColor),
                contentDescription = "icon",
                alignment = Alignment.Center
            )
        }
        numberOfNotifications?.let {
            Box(
                modifier = Modifier
                    .size(14.dp)
                    .background(blue, shape = CircleShape)
                    .align(Alignment.TopEnd),
                contentAlignment = Alignment.Center
            ) {
                Text(
                    text = numberOfNotifications.toString(),
                    style = medium10.copy(color = white)
                )
            }
        }
    }
}

@Preview
@Composable
fun ButtonWithIconPreview() {
    TomJerryAppTheme {
        ButtonWithIcon()
    }
}