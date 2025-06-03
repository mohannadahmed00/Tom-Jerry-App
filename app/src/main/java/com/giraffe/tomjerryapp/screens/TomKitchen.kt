package com.giraffe.tomjerryapp.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.drawBehind
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.giraffe.tomjerryapp.R
import com.giraffe.tomjerryapp.components.DetailsItem
import com.giraffe.tomjerryapp.components.LabeledIcon
import com.giraffe.tomjerryapp.components.PreparationItem
import com.giraffe.tomjerryapp.components.ProductPrice
import com.giraffe.tomjerryapp.ui.theme.TomJerryAppTheme
import com.giraffe.tomjerryapp.ui.theme.background
import com.giraffe.tomjerryapp.ui.theme.black
import com.giraffe.tomjerryapp.ui.theme.blue
import com.giraffe.tomjerryapp.ui.theme.lightBlue

@Composable
fun TomKitchenScreen(modifier: Modifier = Modifier) {
    Box(modifier = modifier) {
        Image(
            modifier = Modifier.fillMaxWidth(),
            painter = painterResource(R.drawable.pasta_background),
            contentDescription = "background",
            contentScale = ContentScale.Crop
        )
        Column {
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 16.dp, vertical = 40.dp)
            ) {
                LabeledIcon(modifier = Modifier.padding(bottom = 16.dp))
                LabeledIcon(iconRes = R.drawable.chef, label = "Shocking foods")
            }
            Box(
                modifier = Modifier
                    .weight(1f)
                    .background(
                        color = background,
                        shape = RoundedCornerShape(topStart = 30.dp, topEnd = 30.dp)
                    ),
            ) {
                Image(
                    modifier = Modifier
                        .width(188.dp)
                        .height(168.dp)
                        .align(Alignment.TopEnd)
                        .offset(y = (-120).dp),
                    painter = painterResource(R.drawable.pasta),
                    contentDescription = "pasta"
                )
                Column(
                    modifier = Modifier.fillMaxWidth(),
                    verticalArrangement = Arrangement.Top,
                ) {

                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(top = 32.dp, start = 16.dp, end = 16.dp, bottom = 16.dp),
                        horizontalArrangement = Arrangement.SpaceBetween,
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Column {
                            Text(
                                "Electric Tom pasta",
                                style = MaterialTheme.typography.titleMedium.copy(black.copy(alpha = .87f))
                            )
                            ProductPrice(
                                modifier = Modifier.padding(top = 12.dp),
                                backgroundColor = lightBlue
                            )
                        }
                        Image(
                            painter = painterResource(R.drawable.heart),
                            contentDescription = "heart"
                        )
                    }
                    Text(
                        modifier = Modifier.padding(horizontal = 16.dp),
                        text = "Pasta cooked with a charger cable and sprinkled with questionable cheese. Make sure to unplug it before eating (or not, you decide).",
                        style = MaterialTheme.typography.bodyMedium
                    )

                    Text(
                        modifier = Modifier.padding(
                            top = 24.dp,
                            start = 16.dp,
                            end = 16.dp,
                            bottom = 8.dp
                        ),
                        text = "Details",
                        style = MaterialTheme.typography.titleSmall.copy(
                            color = black.copy(alpha = 0.87f),
                            fontWeight = FontWeight.W500
                        )
                    )
                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(horizontal = 16.dp),
                        horizontalArrangement = Arrangement.SpaceBetween
                    ) {
                        DetailsItem(modifier = Modifier.weight(1f))
                        Spacer(modifier = Modifier.width(8.dp))
                        DetailsItem(
                            modifier = Modifier.weight(1f),
                            iconRes = R.drawable.timer,
                            value = "3 sparks",
                            label = "Time"
                        )
                        Spacer(modifier = Modifier.width(8.dp))
                        DetailsItem(
                            modifier = Modifier.weight(1f),
                            iconRes = R.drawable.evil,
                            value = "1M 12K",
                            label = "No. of deaths"
                        )
                    }
                    Text(
                        modifier = Modifier.padding(top = 24.dp, start = 16.dp, end = 16.dp),
                        text = "Preparation method",
                        style = MaterialTheme.typography.titleSmall.copy(
                            color = black.copy(alpha = 0.87f),
                            fontWeight = FontWeight.W500
                        )
                    )
                    LazyColumn(
                        modifier = Modifier
                            .weight(1f)
                            .padding(horizontal = 16.dp),
                        verticalArrangement = Arrangement.spacedBy(8.dp),
                        contentPadding = PaddingValues(top = 8.dp)

                    ) {
                        items(6) {
                            PreparationItem(stepNumber = it + 1)
                        }
                    }

                    Button(
                        modifier = Modifier
                            .background(Color.White)
                            .drawBehind {
                                drawLine(
                                    color = black.copy(alpha = .12f),
                                    start = Offset(0f, 1f),
                                    end = Offset(size.width, 1f),
                                    strokeWidth = 1.dp.toPx()
                                )
                            }
                            .padding(horizontal = 16.dp, vertical = 15.dp)
                            .height(56.dp)
                            .fillMaxWidth(),
                        shape = RoundedCornerShape(16.dp),
                        colors = ButtonDefaults.buttonColors().copy(containerColor = blue),
                        onClick = {}
                    ) {
                        Row(
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            Text(
                                "Add to cart",
                                style = MaterialTheme.typography.labelMedium.copy(
                                    color = Color.White.copy(alpha = .87f)
                                )
                            )
                            Box(
                                modifier = Modifier
                                    .padding(horizontal = 8.dp)
                                    .size(5.dp)
                                    .background(Color.White.copy(alpha = .38f), CircleShape)
                            )
                            Column {
                                Text(
                                    "3 Cheeses",
                                    style = MaterialTheme.typography.bodyMedium.copy(color = Color.White)
                                )
                                Text(
                                    "5 Cheeses",
                                    style = MaterialTheme.typography.labelSmall.copy(
                                        color = Color.White.copy(alpha = .8f),
                                        textDecoration = TextDecoration.LineThrough
                                    )
                                )
                            }
                        }

                    }
                }
            }

        }
    }

}

@Preview(showBackground = true, widthDp = 320, heightDp = 710)
@Composable
fun TomKitchenScreenPreview() {
    TomJerryAppTheme {
        TomKitchenScreen()
    }
}