package com.giraffe.tomjerryapp.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.giraffe.tomjerryapp.R
import com.giraffe.tomjerryapp.ui.theme.TomJerryAppTheme
import com.giraffe.tomjerryapp.ui.theme.blue
import com.giraffe.tomjerryapp.ui.theme.darkGray
import com.giraffe.tomjerryapp.ui.theme.medium12
import com.giraffe.tomjerryapp.ui.theme.semiBold20

@Composable
fun SectionHeader(
    modifier: Modifier = Modifier,
    title: String = "Cheap tom section"
) {
    Row(
        modifier = modifier.fillMaxWidth(),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        Text(
            text = title,
            style = semiBold20.copy(color = darkGray)
        )
        Row(
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(
                modifier = Modifier.padding(end = 4.dp),
                text = "View all",
                style = medium12.copy(color = blue)
            )
            Image(
                painter = painterResource(R.drawable.right_arrow),
                contentDescription = "right arrow"
            )
        }

    }
}

@Preview(showBackground = true)
@Composable
fun SectionHeaderPreview() {
    TomJerryAppTheme {
        SectionHeader()
    }
}