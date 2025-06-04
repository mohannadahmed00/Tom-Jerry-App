package com.giraffe.tomjerryapp.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.paint
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.giraffe.tomjerryapp.screens.SecretEpisode
import com.giraffe.tomjerryapp.ui.theme.TomJerryAppTheme
import com.giraffe.tomjerryapp.ui.theme.semiBold14

@Composable
fun EpisodeCard(
    modifier: Modifier = Modifier,
    episode: SecretEpisode = SecretEpisode()
) {
    Box(
        modifier = modifier
            .width(212.dp)
            .height(311.dp)
            .clip(RoundedCornerShape(16.dp))
            .paint(
                painter = painterResource(episode.coverImgRes),
                contentScale = ContentScale.Crop
            )
            .background(
                brush = Brush.verticalGradient(
                    colors = listOf(
                        Color.Black.copy(alpha = 0f),
                        Color.Black.copy(alpha = .8f),
                    )
                )
            )
    ) {
        ButtonWithIcon(
            modifier = Modifier
                .padding(8.dp)
                .align(Alignment.TopEnd),
            buttonSize = 48.dp,
            borderColor = Color.White.copy(alpha = .5f),
            backgroundColor = Color.White.copy(alpha = .24f),
            iconRes = episode.iconRes,
            iconSize = 24.dp,
            iconColor = episode.iconColor,
            roundedCornerSize = 12.dp
        )
        Text(
            modifier = Modifier
                .padding(horizontal = 8.dp, vertical = 12.dp)
                .align(Alignment.BottomStart),
            text = episode.title,
            style = semiBold14.copy(color = Color.White)
        )

    }
}

@Preview
@Composable
fun EpisodeCardPreview() {
    TomJerryAppTheme {
        EpisodeCard()
    }
}