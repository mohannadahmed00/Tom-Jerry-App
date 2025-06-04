package com.giraffe.tomjerryapp.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.giraffe.tomjerryapp.R
import com.giraffe.tomjerryapp.components.CharacterItem
import com.giraffe.tomjerryapp.components.EpisodeCard
import com.giraffe.tomjerryapp.components.SectionHeader
import com.giraffe.tomjerryapp.ui.theme.TomJerryAppTheme
import com.giraffe.tomjerryapp.ui.theme.black
import com.giraffe.tomjerryapp.ui.theme.darkGray
import com.giraffe.tomjerryapp.ui.theme.regular14
import com.giraffe.tomjerryapp.ui.theme.semiBold18
import com.giraffe.tomjerryapp.ui.theme.semiBold20
import com.giraffe.tomjerryapp.ui.theme.yellow

@Composable
fun SecretEpisodes(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .background(
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
                .padding(start = 16.dp, end = 16.dp, top = 16.dp, bottom = 8.dp),
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
            Column(
                modifier = Modifier
                    .weight(1f)
            ) {
                Text(
                    modifier = Modifier.padding(bottom = 12.dp),
                    text = "Deleted episodes of Tom and Jerry!",
                    style = semiBold18.copy(
                        color = darkGray.copy(alpha = .87f),
                        lineHeight = 20.sp,
                        letterSpacing = .25.sp
                    )
                )
                Text(
                    text = "Scenes that were canceled for... mysterious (and sometimes embarrassing) reasons.",
                    style = regular14.copy(
                        color = darkGray.copy(alpha = .6f),
                        lineHeight = 20.sp,
                        letterSpacing = .25.sp
                    )
                )
            }
            Image(
                modifier = Modifier
                    .width(112.dp)
                    .height(178.dp),
                painter = painterResource(R.drawable.tom_jerry),
                contentDescription = "tom & jerry",
                contentScale = ContentScale.Crop
            )
        }
        SectionHeader(
            modifier = Modifier.padding(horizontal = 16.dp, vertical = 12.dp),
            title = "Most watched"
        )
        LazyRow(
            modifier = Modifier.padding(bottom = 24.dp),
            contentPadding = PaddingValues(horizontal = 16.dp),
            horizontalArrangement = Arrangement.spacedBy(12.dp)
        ) {
            items(secretEpisodes) {
                EpisodeCard(episode = it)
            }
        }
        Text(
            modifier = Modifier.padding(horizontal = 16.dp),
            text = "Popular character", style = semiBold20.copy(black.copy(alpha = .87f))
        )

        LazyRow(
            contentPadding = PaddingValues(vertical = 12.dp, horizontal = 16.dp),
            horizontalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            items(characters) {
                CharacterItem(character = it)
            }
        }
    }
}

data class SecretEpisode(
    val coverImgRes: Int = R.drawable.tom_jerry_moon,
    val title: String = "Number 404 - The Cursed Cheese \uD83E\uDDC0",
    val iconRes: Int = R.drawable.cheese,
    val iconColor: Color = yellow,
)

val secretEpisodes = listOf(
    SecretEpisode(),
    SecretEpisode(
        coverImgRes = R.drawable.episode_cover,
        title = "Chase on the moon \uD83C\uDF15\n"
    ),
    SecretEpisode(),
    SecretEpisode(
        coverImgRes = R.drawable.episode_cover,
        title = "Chase on the moon \uD83C\uDF15\n"
    ),
)

data class Character(
    val imgRes: Int = R.drawable.tom_face,
    val name: String = "Tom",
    val description: String = "Failed stalker",
    val backgroundColor: Color = Color(0XFFFCF2C5)
)

val characters = listOf(
    Character(),
    Character(
        imgRes = R.drawable.jerry_face,
        name = "Jerry",
        description = "A scammer mouse",
        backgroundColor = Color(0XFFFCC5E4)
    ),
    Character(),
    Character(
        imgRes = R.drawable.jerry_face,
        name = "Jerry",
        description = "A scammer mouse",
        backgroundColor = Color(0XFFFCC5E4)
    ),
)

@Preview(widthDp = 360, heightDp = 800)
@Composable
fun SecretEpisodesPreview() {
    TomJerryAppTheme {
        SecretEpisodes()
    }
}