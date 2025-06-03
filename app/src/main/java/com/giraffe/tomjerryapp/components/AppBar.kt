package com.giraffe.tomjerryapp.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.giraffe.tomjerryapp.R
import com.giraffe.tomjerryapp.ui.theme.TomJerryAppTheme
import com.giraffe.tomjerryapp.ui.theme.black
import com.giraffe.tomjerryapp.ui.theme.darkGray
import com.giraffe.tomjerryapp.ui.theme.lightGray

@Composable
fun AppBar(modifier: Modifier = Modifier) {
    Row(
        modifier = modifier.fillMaxWidth(),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Image(
            modifier = Modifier
                .padding(end = 8.dp)
                .size(48.dp)
                .clip(RoundedCornerShape(12.dp)),
            painter = painterResource(R.drawable.jerry_profile_pic),
            contentDescription = "profile picture",
            contentScale = ContentScale.Crop
        )
        Column(modifier = Modifier.weight(1f)) {
            Text(
                text = "Hi, Jerry \uD83D\uDC4B\uD83C\uDFFB",
                style = MaterialTheme.typography.bodyMedium.copy(color = black)
            )
            Text(
                "Which Tom do you want to buy?",
                style = MaterialTheme.typography.bodySmall.copy(color = lightGray)
            )
        }
        ButtonWithIcon(
            numberOfNotifications = 3,
            roundedCornerSize = 12.dp,
            borderColor = darkGray.copy(alpha = .15f),
            iconColor = darkGray,
            buttonSize = 40.dp,
            iconSize = 24.dp,
            iconRes = R.drawable.notification
        )
    }
}

@Preview(showBackground = true)
@Composable
fun AppBarPreview() {
    TomJerryAppTheme {
        AppBar()
    }
}