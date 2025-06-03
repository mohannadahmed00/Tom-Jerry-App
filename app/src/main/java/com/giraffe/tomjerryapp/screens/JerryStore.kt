package com.giraffe.tomjerryapp.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid
import androidx.compose.foundation.lazy.staggeredgrid.StaggeredGridCells
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.giraffe.tomjerryapp.components.AppBar
import com.giraffe.tomjerryapp.components.PromotionBanner
import com.giraffe.tomjerryapp.components.SearchBar
import com.giraffe.tomjerryapp.components.SectionHeader
import com.giraffe.tomjerryapp.components.ProductItem
import com.giraffe.tomjerryapp.ui.theme.TomJerryAppTheme
import com.giraffe.tomjerryapp.ui.theme.background

@Composable
fun JerryStoreScreen(modifier: Modifier = Modifier) {
    Box(
        modifier = modifier.background(background)
    ) {
        Column(modifier = Modifier.padding(horizontal = 16.dp)) {
            AppBar(modifier = Modifier.padding(vertical = 4.dp))
            SearchBar(modifier = Modifier.padding(top = 12.dp, bottom = 8.dp))
            PromotionBanner(modifier = Modifier.padding(bottom = 24.dp))
            SectionHeader(title = "Cheap tom section")
            LazyVerticalStaggeredGrid(
                columns = StaggeredGridCells.Fixed(2),
                verticalItemSpacing = 12.dp,
                contentPadding = PaddingValues(top = 16.dp, bottom = 12.dp),
                horizontalArrangement = Arrangement.spacedBy(8.dp)
            ) {
                items(8) {
                    ProductItem()
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