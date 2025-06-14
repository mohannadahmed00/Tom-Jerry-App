package com.giraffe.tomjerryapp.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.giraffe.tomjerryapp.R
import com.giraffe.tomjerryapp.ui.theme.TomJerryAppTheme
import com.giraffe.tomjerryapp.ui.theme.medium16
import com.giraffe.tomjerryapp.ui.theme.white

@Composable
fun LabeledIcon(
    modifier: Modifier = Modifier,
    iconRes: Int = R.drawable.ruler,
    label: String = "High tension"
) {
    Row(modifier = modifier, verticalAlignment = Alignment.CenterVertically) {
        Image(
            modifier = Modifier.padding(end = 8.dp),
            painter = painterResource(iconRes),
            contentDescription = "icon"
        )
        Text(
            text = label,
            style = medium16.copy(white.copy(alpha = .87f))
        )
    }
}

@Preview
@Composable
fun LabeledIconPreview() {
    TomJerryAppTheme {
        LabeledIcon()
    }
}