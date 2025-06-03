package com.giraffe.tomjerryapp.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.giraffe.tomjerryapp.R
import com.giraffe.tomjerryapp.ui.theme.TomJerryAppTheme
import com.giraffe.tomjerryapp.ui.theme.blue
import com.giraffe.tomjerryapp.ui.theme.darkGray
import com.giraffe.tomjerryapp.ui.theme.gray

@Composable
fun SearchBar(modifier: Modifier = Modifier) {
    Row(
        modifier = modifier
            .height(48.dp)
            .fillMaxWidth(),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.spacedBy(8.dp),
    ) {
        Row(
            modifier = Modifier
                .weight(1f)
                .background(Color.White, shape = RoundedCornerShape(12.dp)),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Image(
                modifier = Modifier
                    .padding(start = 13.25.dp)
                    .size(24.dp),
                painter = painterResource(R.drawable.search),
                contentDescription = "search icon"
            )
            OutlinedTextField(
                modifier = Modifier.weight(1f),
                value = "",
                colors = TextFieldDefaults.colors().copy(
                    unfocusedContainerColor = Color.Transparent,
                    focusedContainerColor = Color.Transparent,
                    focusedIndicatorColor = Color.Transparent,
                    unfocusedIndicatorColor = Color.Transparent
                ),
                onValueChange = {},
                textStyle = MaterialTheme.typography.bodyMedium.copy(
                    color = darkGray,
                    fontWeight = FontWeight.W400,
                ),
                maxLines = 1,
                placeholder = {
                    Text(
                        "Search about tom ...",
                        style = MaterialTheme.typography.bodyMedium.copy(
                            color = gray,
                            fontWeight = FontWeight.W400
                        )
                    )
                }
            )
        }
        ButtonWithIcon(
            roundedCornerSize = 12.dp,
            iconColor = Color.White,
            buttonSize = 48.dp,
            iconSize = 24.dp,
            iconRes = R.drawable.filter,
            backgroundColor = blue
        )
    }
}

@Preview
@Composable
fun SearchBarPreview() {
    TomJerryAppTheme {
        SearchBar()
    }
}