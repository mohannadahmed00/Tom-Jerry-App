package com.giraffe.tomjerryapp.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.giraffe.tomjerryapp.R
import com.giraffe.tomjerryapp.components.AppBar
import com.giraffe.tomjerryapp.components.ProductItem
import com.giraffe.tomjerryapp.components.PromotionBanner
import com.giraffe.tomjerryapp.components.SearchBar
import com.giraffe.tomjerryapp.components.SectionHeader
import com.giraffe.tomjerryapp.ui.theme.TomJerryAppTheme
import com.giraffe.tomjerryapp.ui.theme.backgroundColor

@Composable
fun JerryStoreScreen(modifier: Modifier = Modifier) {
    Box(
        modifier = modifier.background(backgroundColor)
    ) {
        Column(modifier = Modifier.padding(horizontal = 16.dp)) {
            AppBar(modifier = Modifier.padding(vertical = 4.dp))
            SearchBar(modifier = Modifier.padding(top = 12.dp, bottom = 8.dp))
            PromotionBanner(modifier = Modifier.padding(bottom = 24.dp))
            SectionHeader(title = "Cheap tom section")
            LazyVerticalGrid(
                columns = GridCells.Fixed(2),
                contentPadding = PaddingValues(top = 16.dp, bottom = 12.dp),
                horizontalArrangement = Arrangement.spacedBy(8.dp),
                verticalArrangement = Arrangement.spacedBy(12.dp),
            ) {
                items(products) {
                    ProductItem(product = it)
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

data class Product(
    val imgRes: Int = R.drawable.frozen_tom,
    val name: String = "Frozen Tom",
    val details: String = "He was chasing Jerry, he froze after the first look",
    val price: Int = 5,
    val priceAfterDiscount: Int? = null,
)

val products = listOf(
    Product(
        imgRes = R.drawable.sport_tom,
        name = "Sport Tom",
        details = "He runs 1 meter... trips over his boot.",
        price = 5,
        priceAfterDiscount = 3
    ),
    Product(
        imgRes = R.drawable.tom_the_lover,
        name = "Tom the lover",
        details = "He loves one-sidedly... and is beaten by the other side.",
        price = 5,
    ),
    Product(
        imgRes = R.drawable.tom_the_bomb,
        name = "Tom the bomb",
        details = "He blows himself up before Jerry can catch him.",
        price = 10,
    ),
    Product(
        imgRes = R.drawable.spy_tom,
        name = "Spy Tom",
        details = "Disguises itself as a table.",
        price = 12,
    ),
    Product(
        imgRes = R.drawable.frozen_tom,
        name = "Frozen Tom",
        details = "He was chasing Jerry, he froze after the first look",
        price = 10,
    ),
    Product(
        imgRes = R.drawable.sleeping_tom,
        name = "Sleeping Tom",
        details = "He doesn't chase anyone, he just snores in stereo.",
        price = 10,
    ),

    )