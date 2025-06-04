package com.giraffe.tomjerryapp.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.giraffe.tomjerryapp.R
import com.giraffe.tomjerryapp.ui.theme.TomJerryAppTheme
import com.giraffe.tomjerryapp.ui.theme.blue
import com.giraffe.tomjerryapp.ui.theme.medium12

@Composable
fun ProductPrice(
    modifier: Modifier = Modifier,
    price: Int = 5,
    priceAfterDiscount: Int? = null,
    unit: String = "cheeses",
    backgroundColor: Color = Color(0XFFE9F6FB)

) {
    Box(
        modifier = modifier.background(backgroundColor, shape = RoundedCornerShape(8.dp)),
        contentAlignment = Alignment.Center
    ) {
        Row(
            modifier = Modifier.padding(
                start = 11.5.dp,
                end = 10.dp,
                top = 7.83.dp,
                bottom = 7.83.dp
            ),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center
        ) {
            Image(
                modifier = Modifier
                    .size(16.dp)
                    .padding(end = 4.dp),
                painter = painterResource(R.drawable.money_bag),
                contentDescription = "money bag"
            )
            priceAfterDiscount?.let {
                Text(
                    modifier = Modifier.padding(end = 4.dp),
                    text = price.toString(),
                    style = medium12.copy(color = blue),
                    textDecoration = TextDecoration.LineThrough
                )
            }
            Text(
                modifier = Modifier.padding(end = 4.dp),
                text = (priceAfterDiscount ?: price).toString(),
                style = medium12.copy(color = blue)
            )
            Text(
                text = unit,
                style = medium12.copy(
                    color = blue,
                    lineHeight = 15.sp,
                )
            )
        }
    }
}

@Preview(widthDp = 106, heightDp = 30)
@Composable
fun ProductPricePreview() {
    TomJerryAppTheme {
        ProductPrice()
    }
}