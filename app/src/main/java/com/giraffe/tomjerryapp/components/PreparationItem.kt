package com.giraffe.tomjerryapp.components

import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.giraffe.tomjerryapp.ui.theme.TomJerryAppTheme
import com.giraffe.tomjerryapp.ui.theme.lightBlue

@Composable
fun PreparationItem(
    modifier: Modifier = Modifier,
    stepNumber: Int = 1,
    stepText: String = "Put the pasta in a toaster."
) {
    Row(
        modifier = modifier,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Box(
            modifier = Modifier
                .padding(end = 8.dp)
                .border(1.dp, lightBlue, CircleShape)
                .size(36.dp),
            contentAlignment = Alignment.Center
        ) {
            Text(stepNumber.toString(), style = MaterialTheme.typography.labelSmall)
        }
        Text(stepText, style = MaterialTheme.typography.bodyMedium)
    }

}

@Preview
@Composable
fun PreparationItemPreview(modifier: Modifier = Modifier) {
    TomJerryAppTheme {
        PreparationItem()
    }
}