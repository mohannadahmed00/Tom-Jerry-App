package com.giraffe.tomjerryapp.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.giraffe.tomjerryapp.R
import com.giraffe.tomjerryapp.ui.theme.TomJerryAppTheme
import com.giraffe.tomjerryapp.ui.theme.black
import com.giraffe.tomjerryapp.ui.theme.blue
import com.giraffe.tomjerryapp.ui.theme.lightBlue

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
        modifier = modifier.background(backgroundColor, shape = RoundedCornerShape(12.dp))
    ) {
        Row(
            modifier = Modifier.padding(top = 8.dp, bottom = 8.dp, start = 12.dp, end = 10.dp),
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Image(
                modifier = Modifier
                    .padding(end = 10.dp)
                    .size(40.dp),
                painter = painterResource(iconRes),
                contentDescription = "icon",
                colorFilter = ColorFilter.tint(color)
            )
            Column {
                Text(
                    value,
                    style = MaterialTheme.typography.labelMedium.copy(
                        color = black.copy(0.6f),
                        fontWeight = FontWeight.W600
                    )
                )
                Text(
                    label,
                    style = MaterialTheme.typography.labelSmall.copy(color = black.copy(0.37f))
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