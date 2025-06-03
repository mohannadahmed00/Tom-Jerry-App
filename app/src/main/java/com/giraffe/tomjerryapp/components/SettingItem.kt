package com.giraffe.tomjerryapp.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.MaterialTheme
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

@Composable
fun SettingItem(
    modifier: Modifier = Modifier,
    iconRes: Int = R.drawable.bed,
    label: String = "Change sleeping place"
) {
    Box {
        Row(
            modifier = modifier.padding(horizontal = 9.25.dp, vertical = 12.25.dp),
            verticalAlignment = Alignment.CenterVertically,
        ) {
            Image(
                modifier = Modifier
                    .padding(end = 17.25.dp)
                    .size(24.dp),
                painter = painterResource(iconRes),
                colorFilter = ColorFilter.tint(darkGray),
                contentDescription = "icon"
            )
            Text(
                label,
                style = MaterialTheme.typography.labelMedium.copy(color = darkGray.copy(.87f))
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun LabeledOptionPreview() {
    TomJerryAppTheme {
        SettingItem()
    }
}