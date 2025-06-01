package com.giraffe.tomjerryapp.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid
import androidx.compose.foundation.lazy.staggeredgrid.StaggeredGridCells
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.giraffe.tomjerryapp.R
import com.giraffe.tomjerryapp.components.ButtonWithIcon
import com.giraffe.tomjerryapp.components.PromotionBanner
import com.giraffe.tomjerryapp.components.TomItem
import com.giraffe.tomjerryapp.ui.theme.TomJerryAppTheme
import com.giraffe.tomjerryapp.ui.theme.blue
import com.giraffe.tomjerryapp.ui.theme.darkGray
import com.giraffe.tomjerryapp.ui.theme.lightGray

@Composable
fun JerryStoreScreen(modifier: Modifier= Modifier) {
    Box(
        modifier = modifier.background(Color.White)
    ) {
        Column(modifier = Modifier.padding(horizontal = 16.dp)) {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(vertical = 4.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Image(
                    modifier = Modifier
                        .size(48.dp)
                        .padding(end = 8.dp)
                        .clip(RoundedCornerShape(12.dp)),
                    painter = painterResource(R.drawable.jerry_profile_pic),
                    contentDescription = "profile picture"
                )
                Column(modifier = Modifier.weight(1f)) {
                    Text("Hi, Jerry \uD83D\uDC4B\uD83C\uDFFB")
                    Text(
                        "Which Tom do you want to buy?",
                        style = MaterialTheme.typography.bodySmall
                    )
                }
                ButtonWithIcon(
                    numberOfNotifications = 3,
                    borderColor = darkGray.copy(alpha = .15f),
                    iconColor = darkGray,
                    buttonSize = 40.dp,
                    iconSize = 24.dp,
                    iconRes = R.drawable.notification
                )
            }
            Row(
                modifier = Modifier.fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically
            ) {
                OutlinedTextField(
                    modifier = Modifier.weight(1f),
                    value = "",
                    prefix = {
                        Image(
                            modifier = Modifier
                                .padding(end = 8.dp)
                                .size(24.dp),
                            painter = painterResource(R.drawable.search),
                            contentDescription = "search"
                        )
                    },
                    colors = OutlinedTextFieldDefaults.colors().copy(
                        unfocusedContainerColor = Color.Transparent,
                        focusedContainerColor = Color.Transparent,
                        focusedIndicatorColor = Color.Transparent,
                        unfocusedIndicatorColor = Color.Transparent
                    ),
                    onValueChange = {},
                    textStyle = MaterialTheme.typography.bodyMedium.copy(
                        color = darkGray,
                        fontWeight = FontWeight.W400
                    ),
                    placeholder = {
                        Text(
                            "Search about tom ...",
                            style = MaterialTheme.typography.bodyMedium.copy(
                                color = lightGray,
                                fontWeight = FontWeight.W400
                            )
                        )
                    }
                )
                ButtonWithIcon(
                    iconColor = Color.White,
                    buttonSize = 48.dp,
                    iconSize = 24.dp,
                    iconRes = R.drawable.filter,
                    backgroundColor = blue
                )
            }
            PromotionBanner(modifier = Modifier.padding(bottom = 24.dp))
            Row(
                modifier = Modifier.fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Text("Cheap tom section", style = MaterialTheme.typography.titleMedium)
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
            LazyVerticalStaggeredGrid(
                modifier = Modifier.weight(1f),
                columns = StaggeredGridCells.Fixed(2),
                verticalItemSpacing = 12.dp,
                contentPadding = PaddingValues(vertical = 16.dp),
                horizontalArrangement = Arrangement.spacedBy(8.dp)
            ) {
                items(8) {
                    TomItem()
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun JerryStoreScreenPreview() {
    TomJerryAppTheme {
        JerryStoreScreen()
    }
}