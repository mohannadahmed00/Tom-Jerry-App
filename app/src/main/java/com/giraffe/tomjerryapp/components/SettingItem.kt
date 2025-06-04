package com.giraffe.tomjerryapp.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.giraffe.tomjerryapp.R
import com.giraffe.tomjerryapp.ui.theme.TomJerryAppTheme
import com.giraffe.tomjerryapp.ui.theme.darkGray
import com.giraffe.tomjerryapp.ui.theme.medium16
import com.giraffe.tomjerryapp.ui.theme.white

@Composable
fun SettingItem(
    modifier: Modifier = Modifier,
    iconRes: Int = R.drawable.bed,
    label: String = "Change sleeping place"
) {
    Row(
        modifier = modifier,
        verticalAlignment = Alignment.CenterVertically,
    ) {
        Box(
            modifier = Modifier
                .padding(end = 8.dp)
                .size(40.dp)
                .background(white, shape = RoundedCornerShape(8.dp)),
            contentAlignment = Alignment.Center
        ) {
            Image(
                modifier = Modifier
                    .padding(8.dp)
                    .size(24.dp),
                painter = painterResource(iconRes),
                colorFilter = ColorFilter.tint(darkGray),
                contentDescription = "icon"
            )
        }
        Text(
            text = label,
            style = medium16.copy(color = darkGray.copy(.87f))
        )
    }
}

@Preview
@Composable
fun LabeledOptionPreview() {
    TomJerryAppTheme {
        SettingItem()
    }
}