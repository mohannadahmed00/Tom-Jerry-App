package com.giraffe.tomjerryapp.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.giraffe.tomjerryapp.R
import com.giraffe.tomjerryapp.components.SettingItem
import com.giraffe.tomjerryapp.components.StateItem
import com.giraffe.tomjerryapp.ui.theme.TomJerryAppTheme
import com.giraffe.tomjerryapp.ui.theme.backgroundColor
import com.giraffe.tomjerryapp.ui.theme.black
import com.giraffe.tomjerryapp.ui.theme.bold20
import com.giraffe.tomjerryapp.ui.theme.darkGray
import com.giraffe.tomjerryapp.ui.theme.green
import com.giraffe.tomjerryapp.ui.theme.lightGreen
import com.giraffe.tomjerryapp.ui.theme.lightPink
import com.giraffe.tomjerryapp.ui.theme.lightYellow
import com.giraffe.tomjerryapp.ui.theme.medium10
import com.giraffe.tomjerryapp.ui.theme.medium18
import com.giraffe.tomjerryapp.ui.theme.pink
import com.giraffe.tomjerryapp.ui.theme.regular12
import com.giraffe.tomjerryapp.ui.theme.white
import com.giraffe.tomjerryapp.ui.theme.yellow

@Composable
fun TomAccount(modifier: Modifier = Modifier) {
    Box(
        modifier = modifier.fillMaxSize()
    ) {
        Image(
            modifier = Modifier.fillMaxWidth(),
            painter = painterResource(R.drawable.account_background),
            contentDescription = "background",
            contentScale = ContentScale.Crop
        )
        Column {
            Column(
                modifier = Modifier.fillMaxWidth(),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Image(
                    modifier = Modifier
                        .padding(top = 16.dp, bottom = 4.dp)
                        .size(64.dp)
                        .clip(shape = RoundedCornerShape(12.dp)),
                    painter = painterResource(R.drawable.jackass),
                    contentDescription = "profile picture",
                    contentScale = ContentScale.Crop
                )
                Text(
                    text = "Tom",
                    style = medium18.copy(color = white)
                )
                Text(
                    "specializes in failure!",
                    style = regular12.copy(white.copy(alpha = .8f))
                )
                Box(
                    modifier = Modifier
                        .padding(top = 4.dp, bottom = 8.dp)
                        .background(
                            white.copy(alpha = .12f),
                            shape = RoundedCornerShape(40.dp)
                        ),
                )
                {
                    Text(
                        modifier = Modifier.padding(horizontal = 12.dp, vertical = 5.dp),
                        text = "Edit foolishness",
                        style = medium10.copy(color = white)
                    )
                }
            }


            Column(
                modifier = Modifier
                    .fillMaxHeight()
                    .weight(1f)
                    .background(
                        backgroundColor,
                        shape = RoundedCornerShape(topStart = 20.dp, topEnd = 20.dp)
                    ),
                verticalArrangement = Arrangement.Top,
            ) {
                LazyVerticalGrid(
                    modifier = Modifier.padding(horizontal = 16.dp, vertical = 23.dp),
                    columns = GridCells.Fixed(2),
                    verticalArrangement = Arrangement.spacedBy(8.dp),
                    horizontalArrangement = Arrangement.spacedBy(8.dp)
                ) {
                    item {
                        StateItem()
                    }
                    item {
                        StateItem(
                            iconRes = R.drawable.green_progress,
                            label = "Chase time",
                            value = "+500 h",
                            color = green,
                            backgroundColor = lightGreen
                        )
                    }
                    item {
                        StateItem(
                            iconRes = R.drawable.pink_progress,
                            label = "Hunting times",
                            value = "2M 12K",
                            color = pink,
                            backgroundColor = lightPink
                        )
                    }
                    item {
                        StateItem(
                            iconRes = R.drawable.yellow_progress,
                            label = "Heartbroken",
                            value = "3M 7K",
                            color = yellow,
                            backgroundColor = lightYellow
                        )
                    }
                }
                Text(
                    modifier = Modifier.padding(
                        top = 1.dp,
                        bottom = 8.dp,
                        start = 16.dp,
                    ),
                    text = "Tom settings",
                    style = bold20.copy(color = darkGray.copy(alpha = .87f))
                )
                SettingItem(
                    modifier = Modifier.padding(
                        bottom = 12.dp,
                        start = 16.dp,
                        end = 16.dp
                    )
                )
                SettingItem(
                    modifier = Modifier.padding(bottom = 12.dp, start = 16.dp, end = 16.dp),
                    iconRes = R.drawable.cat, label = "Meow settings"
                )
                SettingItem(
                    modifier = Modifier.padding(horizontal = 16.dp),
                    iconRes = R.drawable.fridge,
                    label = "Password to open the fridge"
                )
                Spacer(
                    modifier = Modifier
                        .padding(vertical = 12.dp)
                        .fillMaxWidth()
                        .height(1.dp)
                        .background(Color(0xFF001A1F).copy(alpha = .08f))
                )
                Text(
                    modifier = Modifier.padding(bottom = 8.dp, start = 16.dp),
                    text = "His favorite foods",
                    style = bold20.copy(color = darkGray.copy(alpha = .87f))
                )
                SettingItem(
                    modifier = Modifier.padding(bottom = 12.dp, start = 16.dp, end = 16.dp),
                    iconRes = R.drawable.warning, label = "Mouses"
                )
                SettingItem(
                    modifier = Modifier.padding(bottom = 12.dp, start = 16.dp, end = 16.dp),
                    iconRes = R.drawable.burger, label = "Last stolen meal"
                )
                SettingItem(
                    modifier = Modifier.padding(horizontal = 16.dp),
                    iconRes = R.drawable.sleep_face, label = "Change sleep mood"
                )
                Spacer(modifier = Modifier.weight(1f))
                Text(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(bottom = 20.dp),
                    text = "v.TomBeta",
                    textAlign = TextAlign.Center,
                    style = MaterialTheme.typography.bodySmall.copy(color = black.copy(alpha = .6f))
                )
            }
        }
    }
}

@Preview
@Composable
fun TomAccountPreview() {
    TomJerryAppTheme {
        TomAccount()
    }
}