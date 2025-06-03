package com.giraffe.tomjerryapp.components

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
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
        modifier = modifier
            .height(36.dp)
            .fillMaxWidth()
            .background(
                Color.White, shape = RoundedCornerShape(
                    topStart = 20.dp,
                    bottomStart = 20.dp,
                    topEnd = 12.dp,
                    bottomEnd = 12.dp
                )
            ),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Box(
            modifier = Modifier
                .size(36.dp)
                .border(1.dp, lightBlue, CircleShape)
                .background(Color.White, shape = CircleShape),
            contentAlignment = Alignment.Center
        ) {
            Text(stepNumber.toString(), style = MaterialTheme.typography.labelSmall)
        }
        Text(
            modifier = Modifier.padding(horizontal = 8.dp),
            text = stepText, style = MaterialTheme.typography.bodyMedium.copy(fontWeight = FontWeight.W400),
        )
    }

}

@Preview
@Composable
fun PreparationItemPreview() {
    TomJerryAppTheme {
        PreparationItem()
    }
}