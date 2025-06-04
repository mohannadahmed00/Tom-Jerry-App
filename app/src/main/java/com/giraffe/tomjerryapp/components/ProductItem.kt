package com.giraffe.tomjerryapp.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.giraffe.tomjerryapp.R
import com.giraffe.tomjerryapp.screens.Product
import com.giraffe.tomjerryapp.ui.theme.TomJerryAppTheme
import com.giraffe.tomjerryapp.ui.theme.darkGray
import com.giraffe.tomjerryapp.ui.theme.gray
import com.giraffe.tomjerryapp.ui.theme.regular12
import com.giraffe.tomjerryapp.ui.theme.semiBold18

@Composable
fun ProductItem(
    modifier: Modifier = Modifier,
    product: Product = Product(imgRes = R.drawable.sleeping_tom)
) {
    Box(modifier = modifier.height((219 + 16).dp), contentAlignment = Alignment.TopCenter) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight()
                .padding(top = 16.dp)
                .background(Color.White, shape = RoundedCornerShape(10.dp)),
            horizontalAlignment = Alignment.CenterHorizontally,
        ) {
            Text(
                modifier = Modifier.padding(top = 92.dp, start = 8.dp, end = 8.dp),
                text = product.name,
                maxLines = 1,
                overflow = TextOverflow.Ellipsis,
                style = semiBold18.copy(color = darkGray)
            )
            Text(
                modifier = Modifier
                    .weight(1f)
                    .padding(horizontal = 8.dp),
                text = product.details,
                style = regular12.copy(color = gray),
                maxLines = 3,
                textAlign = TextAlign.Center,
                overflow = TextOverflow.Ellipsis,
            )
            Row(
                modifier = Modifier.padding(8.dp),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceEvenly
            ) {
                ProductPrice(
                    modifier = Modifier
                        .height(30.dp)
                        .weight(1f)
                        .padding(end = 8.dp),
                    price = product.price,
                    priceAfterDiscount = product.priceAfterDiscount
                )
                ButtonWithIcon()
            }
        }
        Image(
            modifier = Modifier.height(100.dp),
            painter = painterResource(product.imgRes),
            contentScale = ContentScale.Crop,
            contentDescription = "product image"
        )
    }
}

@Preview(widthDp = 160, heightDp = 219 + 16)
@Composable
fun TomItemPreview() {
    TomJerryAppTheme {
        ProductItem()
    }
}