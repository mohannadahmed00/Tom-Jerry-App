package com.giraffe.tomjerryapp.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.defaultMinSize
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.giraffe.tomjerryapp.R
import com.giraffe.tomjerryapp.components.SettingItem
import com.giraffe.tomjerryapp.components.StateItem
import com.giraffe.tomjerryapp.ui.theme.TomJerryAppTheme
import com.giraffe.tomjerryapp.ui.theme.background
import com.giraffe.tomjerryapp.ui.theme.black
import com.giraffe.tomjerryapp.ui.theme.darkGray
import com.giraffe.tomjerryapp.ui.theme.green
import com.giraffe.tomjerryapp.ui.theme.lightGreen
import com.giraffe.tomjerryapp.ui.theme.lightPink
import com.giraffe.tomjerryapp.ui.theme.lightYellow
import com.giraffe.tomjerryapp.ui.theme.pink
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
                    "Tom",
                    style = MaterialTheme.typography.titleSmall.copy(fontWeight = FontWeight.W500)
                )
                Text(
                    "specializes in failure!",
                    style = MaterialTheme.typography.labelSmall.copy(
                        color = Color.White,
                        fontWeight = FontWeight.W400
                    )
                )
                Button(
                    modifier = Modifier.defaultMinSize(minWidth = 1.dp, minHeight = 1.dp),
                    contentPadding = PaddingValues(horizontal = 12.dp, vertical = 6.dp),
                    colors = ButtonDefaults.buttonColors().copy(
                        containerColor = Color.White.copy(alpha = .12f)
                    ),
                    onClick = {}
                ) {
                    Text("Edit foolishness", style = MaterialTheme.typography.displaySmall)
                }
            }

            Box(
                modifier = Modifier
                    .weight(1f)
                    .background(
                        background,
                        shape = RoundedCornerShape(topStart = 20.dp, topEnd = 20.dp)
                    ),
            ) {
                Column(
                    modifier = Modifier
                        .fillMaxHeight()
                        .padding(
                            start = 16.dp,
                            end = 16.dp,
                            top = 23.dp,
                            bottom = 20.dp,
                        ),
                    verticalArrangement = Arrangement.Top,
                ) {
                    LazyVerticalGrid(
                        columns = GridCells.Fixed(2),
                        verticalArrangement = Arrangement.spacedBy(8.dp),
                        horizontalArrangement = Arrangement.spacedBy(8.dp)
                    ) {
                        item {
                            StateItem()
                        }
                        item {
                            StateItem(
                                iconRes = R.drawable.chase,
                                label = "Chase time",
                                value = "+500 h",
                                color = green,
                                backgroundColor = lightGreen
                            )
                        }
                        item {
                            StateItem(
                                iconRes = R.drawable.sad_face,
                                label = "Hunting times",
                                value = "2M 12K",
                                color = pink,
                                backgroundColor = lightPink
                            )
                        }
                        item {
                            StateItem(
                                iconRes = R.drawable.broken_heart,
                                label = "Heartbroken",
                                value = "3M 7K",
                                color = yellow,
                                backgroundColor = lightYellow
                            )
                        }
                    }
                    Text(
                        modifier = Modifier.padding(top = 24.dp, bottom = 8.dp),
                        text = "Tom settings",
                        style = MaterialTheme.typography.titleMedium.copy(
                            fontWeight = FontWeight.W700,
                            color = darkGray.copy(alpha = .87f)
                        )
                    )
                    SettingItem()
                    SettingItem(iconRes = R.drawable.cat, label = "Meow settings")
                    SettingItem(
                        iconRes = R.drawable.fridge,
                        label = "Password to open the fridge"
                    )
                    Text(
                        modifier = Modifier.padding(top = 24.dp, bottom = 8.dp),
                        text = "His favorite foods",
                        style = MaterialTheme.typography.titleMedium.copy(
                            fontWeight = FontWeight.W700,
                            color = darkGray.copy(alpha = .87f)
                        )
                    )
                    SettingItem(iconRes = R.drawable.warning, label = "Mouses")
                    SettingItem(iconRes = R.drawable.burger, label = "Last stolen meal")
                    SettingItem(iconRes = R.drawable.sleep_face, label = "Change sleep mood")
                    Spacer(modifier = Modifier.weight(1f))
                    Text(
                        modifier = Modifier.fillMaxWidth(),
                        text = "v.TomBeta",
                        textAlign = TextAlign.Center,
                        style = MaterialTheme.typography.bodySmall.copy(color = black.copy(alpha = .6f))
                    )
                }

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