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
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.giraffe.tomjerryapp.R
import com.giraffe.tomjerryapp.ui.theme.TomJerryAppTheme
import com.giraffe.tomjerryapp.ui.theme.darkGray

@Composable
fun ProductItem(
    modifier: Modifier = Modifier,
    imgRes: Int = R.drawable.tom,
    name: String = "Frozen Tom",
    details: String = "He was chasing Jerry, he froze after the first look",
    price: Int = 5,
    priceAfterDiscount: Int = 3,
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
                text = name,
                maxLines = 1,
                overflow = TextOverflow.Ellipsis,
                style = MaterialTheme.typography.titleSmall.copy(color = darkGray)
            )
            Text(
                modifier = Modifier
                    .weight(1f)
                    .padding(horizontal = 8.dp),
                text = details,
                style = MaterialTheme.typography.bodySmall,
                maxLines = 3,
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
                    price = price,
                    priceAfterDiscount = priceAfterDiscount
                )
                ButtonWithIcon()
            }
        }
        Image(
            modifier = Modifier.height(100.dp),
            painter = painterResource(imgRes),
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