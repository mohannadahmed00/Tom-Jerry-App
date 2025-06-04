package com.giraffe.tomjerryapp.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.giraffe.tomjerryapp.R
import com.giraffe.tomjerryapp.ui.theme.TomJerryAppTheme
import com.giraffe.tomjerryapp.ui.theme.black
import com.giraffe.tomjerryapp.ui.theme.lightBlue
import com.giraffe.tomjerryapp.ui.theme.medium12
import com.giraffe.tomjerryapp.ui.theme.medium14

@Composable
fun DetailsItem(
    modifier: Modifier = Modifier,
    iconRes: Int = R.drawable.temperature,
    value: String = "1000 V",
    label: String = "Temperature"
) {
    Box(
        modifier = modifier.background(lightBlue, shape = RoundedCornerShape(12.dp)),
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 13.5.dp, vertical = 12.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
        ) {
            Image(
                modifier = Modifier.size(32.dp),
                painter = painterResource(iconRes),
                contentDescription = "icon"
            )
            Text(
                modifier = Modifier.padding(top = 12.dp, bottom = 2.dp),
                text = value,
                style = medium14.copy(color = black.copy(alpha = .6f))
            )
            Text(
                text = label,
                style = medium12.copy(color = black.copy(alpha = .37f)),
                maxLines = 1,
                overflow = TextOverflow.Ellipsis
            )
        }
    }
}

@Preview(widthDp = 90)
@Composable
fun DetailsItemPreview() {
    TomJerryAppTheme {
        DetailsItem()
    }

}