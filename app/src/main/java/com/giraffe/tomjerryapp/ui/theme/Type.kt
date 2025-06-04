package com.giraffe.tomjerryapp.ui.theme

import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.googlefonts.GoogleFont
import androidx.compose.ui.unit.sp
import com.giraffe.tomjerryapp.R

// Set of Material typography styles to start with

val provider = GoogleFont.Provider(
    providerAuthority = "com.google.android.gms.fonts",
    providerPackage = "com.google.android.gms",
    certificates = R.array.com_google_android_gms_fonts_certs
)

val fontName = GoogleFont("Roboto")
//val fontName = GoogleFont("IBM Plex Sans Arabic")
//val fontName = GoogleFont("Arvo")
//val fontName = GoogleFont("IBM Plex Sans")

val fontFamily = FontFamily(androidx.compose.ui.text.googlefonts.Font(googleFont = fontName, fontProvider = provider))
//val fontFamily = FontFamily.Default

val IbmPlexSansArabicFamily = FontFamily(
    Font(R.font.thin, FontWeight.Thin),
    Font(R.font.light, FontWeight.Light),
    Font(R.font.extra_light, FontWeight.ExtraLight),
    Font(R.font.regular, FontWeight.Normal),
    Font(R.font.medium, FontWeight.Medium),
    Font(R.font.semi_bold, FontWeight.SemiBold),
    Font(R.font.bold, FontWeight.Bold),
)
val medium10 = TextStyle(
    fontFamily = fontFamily,
    fontSize = 10.sp,
    fontWeight = FontWeight.Medium,
)
val medium12 = TextStyle(
    fontFamily = fontFamily,
    fontSize = 12.sp,
    fontWeight = FontWeight.Medium,
)
val medium14 = TextStyle(
    fontFamily = fontFamily,
    fontSize = 14.sp,
    fontWeight = FontWeight.Medium,
)
val medium16 = TextStyle(
    fontFamily = fontFamily,
    fontSize = 16.sp,
    fontWeight = FontWeight.Medium,
)
val medium18 = TextStyle(
    fontFamily = fontFamily,
    fontSize = 18.sp,
    fontWeight = FontWeight.Medium,
)
val medium20 = TextStyle(
    fontFamily = fontFamily,
    fontSize = 20.sp,
    fontWeight = FontWeight.Medium,
)

val regular12 = TextStyle(
    fontFamily = fontFamily,
    fontSize = 12.sp,
    fontWeight = FontWeight.Normal,
)
val regular14 = TextStyle(
    fontFamily = fontFamily,
    fontSize = 14.sp,
    fontWeight = FontWeight.Normal,
)
val semiBold14 = TextStyle(
    fontFamily = fontFamily,
    fontSize = 14.sp,
    fontWeight = FontWeight.SemiBold,
)
val semiBold16 = TextStyle(
    fontFamily = fontFamily,
    fontSize = 16.sp,
    fontWeight = FontWeight.SemiBold,
)
val semiBold18 = TextStyle(
    fontFamily = fontFamily,
    fontSize = 18.sp,
    fontWeight = FontWeight.SemiBold,
)
val semiBold20 = TextStyle(
    fontFamily = fontFamily,
    fontSize = 20.sp,
    fontWeight = FontWeight.SemiBold,
)
val bold20 = TextStyle(
    fontFamily = fontFamily,
    fontSize = 20.sp,
    fontWeight = FontWeight.Bold,
)
