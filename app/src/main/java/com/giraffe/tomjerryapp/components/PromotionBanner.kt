package com.giraffe.tomjerryapp.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.constraintlayout.compose.ChainStyle
import androidx.constraintlayout.compose.ConstraintLayout
import androidx.constraintlayout.compose.Dimension
import com.giraffe.tomjerryapp.R
import com.giraffe.tomjerryapp.ui.theme.TomJerryAppTheme

@Composable
fun PromotionBanner(modifier: Modifier = Modifier) {
    ConstraintLayout(
        modifier = modifier
            .height((92 + 16).dp)
            .fillMaxWidth()
    ) {
        val (text, image, banner, circles) = createRefs()
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(92.dp)
                .background(
                    brush = Brush.horizontalGradient(
                        colors = listOf(
                            Color(0XFF03446A),
                            Color(0XFF0685D0),
                        )
                    ), shape = RoundedCornerShape(16.dp)
                )
                .constrainAs(banner) {
                    top.linkTo(parent.top)
                    bottom.linkTo(parent.bottom)
                    start.linkTo(parent.start)
                    end.linkTo(parent.end)
                    verticalBias = 1f
                }
        )
        Column(
            modifier = Modifier
                .padding(start = 12.dp)
                .constrainAs(text) {
                    top.linkTo(banner.top)
                    bottom.linkTo(banner.bottom)
                    start.linkTo(banner.start)
                    end.linkTo(image.start)
                }
        ) {
            Text("Buy 1 Tom and get 2 for free", style = MaterialTheme.typography.labelMedium)
            Spacer(modifier = Modifier.height(8.dp))
            Text(
                "Adopt Tom! (Free Fail-Free Guarantee)",
                style = MaterialTheme.typography.labelSmall.copy(
                    color = Color.White.copy(alpha = .8f),
                    fontWeight = FontWeight.W400
                )
            )
        }
        Image(
            modifier = Modifier
                .constrainAs(circles) {
                    top.linkTo(banner.top)
                    bottom.linkTo(banner.bottom)
                    end.linkTo(banner.end)
                    height = Dimension.fillToConstraints
                }
                .clip(RoundedCornerShape(topEnd = 16.dp, bottomEnd = 16.dp)),
            painter = painterResource(R.drawable.circles),
            contentDescription = "circles",
            contentScale = ContentScale.Crop
        )
        Image(
            modifier = Modifier
                .width(115.37.dp)
                .height(108.dp)
                .constrainAs(image) {
                    top.linkTo(parent.top)
                    start.linkTo(text.end)
                }
                .clip(RoundedCornerShape(bottomEnd = 16.dp)),
            painter = painterResource(R.drawable.tom_with_money),
            contentDescription = "tom with money",
            contentScale = ContentScale.Crop
        )

        createHorizontalChain(text, image, chainStyle = ChainStyle.SpreadInside)
    }
}

@Preview(widthDp = 328)
@Composable
fun PromotionBannerPreview() {
    TomJerryAppTheme {
        PromotionBanner()
    }
}