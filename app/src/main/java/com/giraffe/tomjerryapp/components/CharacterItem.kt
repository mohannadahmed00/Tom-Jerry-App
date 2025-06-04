package com.giraffe.tomjerryapp.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.giraffe.tomjerryapp.screens.Character
import com.giraffe.tomjerryapp.ui.theme.TomJerryAppTheme
import com.giraffe.tomjerryapp.ui.theme.black
import com.giraffe.tomjerryapp.ui.theme.medium18
import com.giraffe.tomjerryapp.ui.theme.regular12

@Composable
fun CharacterItem(
    modifier: Modifier = Modifier,
    character: Character = Character()
) {
    Box {
        Column(
            modifier = modifier
                .padding(top = 24.dp)
                .width(140.dp)
                .background(color = character.backgroundColor, shape = RoundedCornerShape(16.dp)),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {

            Text(
                modifier = Modifier.padding(top = 48.dp),
                text = character.name,
                style = medium18.copy(color = black.copy(alpha = .87f))
            )
            Text(
                modifier = Modifier.padding(top = 4.dp, bottom = 12.dp),
                text = character.description,
                style = regular12.copy(color = black.copy(alpha = .6f))
            )
        }
        Image(
            modifier = Modifier
                .width(82.dp)
                .height(64.dp)
                .align(Alignment.TopCenter),
            painter = painterResource(character.imgRes),
            contentScale = ContentScale.Crop,
            contentDescription = "character face",
        )
    }
}

@Preview
@Composable
fun CharacterItemPreview() {
    TomJerryAppTheme {
        CharacterItem()
    }
}