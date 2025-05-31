package com.giraffe.tomjerryapp.ui.theme

import androidx.compose.material3.Typography
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.sp

// Set of Material typography styles to start with
val Typography = Typography(
    displaySmall = TextStyle(
        fontFamily = FontFamily.Default,
        color = Color.White,
        fontSize = 10.sp,
        textAlign = TextAlign.Center,
        fontWeight = FontWeight.W500
    ),
    bodySmall = TextStyle(
        fontFamily = FontFamily.Default,
        color = gray,
        fontSize = 12.sp,
        textAlign = TextAlign.Center,
        fontWeight = FontWeight.W400
    ),
    bodyMedium = TextStyle(
        fontFamily = FontFamily.Default,
        color = black.copy(alpha = 0.6f),
        fontSize = 14.sp,
        lineHeight = 20.sp,
        letterSpacing = 0.5.sp,
        fontWeight = FontWeight.W500
    ),
    bodyLarge = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Normal,
        fontSize = 16.sp,
        lineHeight = 24.sp,
        letterSpacing = 0.5.sp
    ),

    labelSmall = TextStyle(
        fontFamily = FontFamily.Default,
        color = blue,
        fontSize = 12.sp,
        textAlign = TextAlign.Center,
        fontWeight = FontWeight.W500
    ),

    labelMedium = TextStyle(
        fontFamily = FontFamily.Default,
        color = Color.White,
        fontSize = 16.sp,
        textAlign = TextAlign.Center,
        fontWeight = FontWeight.W500
    ),

    titleSmall = TextStyle(
        fontFamily = FontFamily.Default,
        color = Color.White,
        fontSize = 18.sp,
        fontWeight = FontWeight.W600,
        lineHeight = 16.sp,
        letterSpacing = 0.5.sp
    ),
    titleMedium = TextStyle(
        fontFamily = FontFamily.Default,
        color = darkGray,
        fontSize = 20.sp,
        fontWeight = FontWeight.W500
    ),


    /* Other default text styles to override
    titleLarge = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Normal,
        fontSize = 22.sp,
        lineHeight = 28.sp,
        letterSpacing = 0.sp
    ),
    labelSmall = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Medium,
        fontSize = 11.sp,
        lineHeight = 16.sp,
        letterSpacing = 0.5.sp
    )
    */
)