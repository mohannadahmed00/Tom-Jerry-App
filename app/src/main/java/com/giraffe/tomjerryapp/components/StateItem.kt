package com.giraffe.tomjerryapp.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.giraffe.tomjerryapp.R
import com.giraffe.tomjerryapp.ui.theme.TomJerryAppTheme
import com.giraffe.tomjerryapp.ui.theme.black
import com.giraffe.tomjerryapp.ui.theme.blue
import com.giraffe.tomjerryapp.ui.theme.lightBlue
import com.giraffe.tomjerryapp.ui.theme.medium12
import com.giraffe.tomjerryapp.ui.theme.semiBold16

@Composable
fun StateItem(
    modifier: Modifier = Modifier,
    iconRes: Int = R.drawable.evil,
    label: String = "No. of quarrels",
    value: String = "2M 12K",
    color: Color = blue,
    backgroundColor: Color = lightBlue
) {
    Box(
        modifier = modifier.background(backgroundColor, shape = RoundedCornerShape(12.dp)),
        contentAlignment = Alignment.Center
    ) {
        Row(
            modifier = Modifier.padding(top = 8.dp, bottom = 8.dp, start = 12.dp, end = 14.dp),
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically
        ) {
            StateProgress(
                modifier = modifier.padding(end = 10.dp ).size(40.dp),
                strokeWidth = 1.dp,
                progress = .5f,
                activeColor = color,
                iconRes = iconRes
            )
            Column {
                Text(
                    value,
                    style = semiBold16.copy(color = black.copy(0.6f))
                )
                Text(
                    label,
                    style = medium12.copy(color = black.copy(0.37f))
                )
            }
        }
    }
}

@Preview
@Composable
fun StateItemPreview() {
    TomJerryAppTheme {
        StateItem()
    }
}