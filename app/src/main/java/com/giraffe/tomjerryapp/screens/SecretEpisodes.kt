package com.giraffe.tomjerryapp.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.giraffe.tomjerryapp.R
import com.giraffe.tomjerryapp.components.CharacterItem
import com.giraffe.tomjerryapp.components.EpisodeCard
import com.giraffe.tomjerryapp.ui.theme.TomJerryAppTheme
import com.giraffe.tomjerryapp.ui.theme.black

@Composable
fun SecretEpisodes(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier.background(
            brush = Brush.verticalGradient(
                colors = listOf(
                    Color(0XFFA3DCFF),
                    Color.White
                )
            )
        )
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 16.dp, end = 16.dp, top = 16.dp),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically

        ) {
            Image(
                modifier = Modifier
                    .size(40.dp)
                    .clip(shape = RoundedCornerShape(12.dp)),
                painter = painterResource(R.drawable.jackass),
                contentDescription = "profile picture",
                contentScale = ContentScale.Crop
            )

            Box(
                modifier = Modifier
                    .size(40.dp)
                    .background(
                        brush = Brush.verticalGradient(
                            colors = listOf(
                                Color(0xFF0085E3),
                                Color(0xFF00497D),
                            )
                        ),
                        shape = RoundedCornerShape(12.dp)
                    ),
                contentAlignment = Alignment.Center
            ) {
                Image(
                    painter = painterResource(R.drawable.secret),
                    contentDescription = "icon"
                )

            }
        }
        Row(
            modifier = Modifier.padding(horizontal = 16.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Column(modifier = Modifier.weight(1f)) {
                Text(
                    modifier = Modifier.padding(bottom = 12.dp),
                    text = "Deleted episodes of Tom and Jerry!",
                    style = MaterialTheme.typography.titleSmall.copy(color = black.copy(alpha = .87f))
                )
                Text(
                    text = "Scenes that were canceled for... mysterious (and sometimes embarrassing) reasons.",
                    style = MaterialTheme.typography.bodyMedium.copy(fontWeight = FontWeight.W400)
                )
            }
            Image(
                modifier = Modifier
                    .width(112.dp)
                    .height(178.dp),
                painter = painterResource(R.drawable.tom_jerry),
                contentDescription = "tom & jerry",
            )
        }
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp, vertical = 12.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Text("Most watched", style = MaterialTheme.typography.titleMedium)
            Row(
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(
                    modifier = Modifier.padding(end = 4.dp),
                    text = "View all",
                    style = MaterialTheme.typography.labelSmall
                )
                Image(
                    painter = painterResource(R.drawable.right_arrow),
                    contentDescription = "right arrow"
                )
            }
        }
        LazyRow(
            contentPadding = PaddingValues(horizontal = 16.dp),
            horizontalArrangement = Arrangement.spacedBy(12.dp)
        ) {
            items(5) {
                EpisodeCard()
            }
        }
        Text(
            modifier = Modifier.padding(vertical = 12.dp, horizontal = 16.dp),
            text = "Popular character", style = MaterialTheme.typography.titleMedium
        )

        LazyRow(
            contentPadding = PaddingValues(horizontal = 16.dp),
            horizontalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            items(5) {
                CharacterItem()
            }
        }
    }
}

@Preview(widthDp = 360, heightDp = 800)
@Composable
fun SecretEpisodesPreview() {
    TomJerryAppTheme {
        SecretEpisodes()
    }
}