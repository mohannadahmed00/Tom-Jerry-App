package com.giraffe.tomjerryapp.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.giraffe.tomjerryapp.R
import com.giraffe.tomjerryapp.ui.theme.TomJerryAppTheme
import com.giraffe.tomjerryapp.ui.theme.darkGray
import com.giraffe.tomjerryapp.ui.theme.lightYellow

@Composable
fun CharacterItem(
    modifier: Modifier = Modifier,
    imageRes: Int = R.drawable.tom_face,
    name: String = "Tom",
    description: String = "Failed stalker",
    backgroundColor: Color = lightYellow
) {
    Box {
        Column(
            modifier = modifier
                .padding(top = 24.dp)
                .width(140.dp)
                .background(color = backgroundColor, shape = RoundedCornerShape(16.dp)),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {

            Text(
                modifier = Modifier.padding(top = 48.dp),
                text = name,
                style = MaterialTheme.typography.titleSmall.copy(
                    fontWeight = FontWeight.W500,
                    color = darkGray.copy(alpha = .87f)
                )
            )
            Text(
                modifier = Modifier.padding(top = 4.dp, bottom = 12.dp),
                text = description,
                style = MaterialTheme.typography.bodySmall.copy(color = darkGray.copy(alpha = .6f))
            )
        }
        Image(
            modifier = Modifier
                .width(82.dp)
                .height(64.dp)
                .align(Alignment.TopCenter),
            painter = painterResource(imageRes),
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