package com.example.vocabularywallpaper.ui.theme

import androidx.compose.ui.graphics.Color

val BrandPurple = Color(0xFF625BDA)
val BrandPurpleDark = Color(0xFF5149C5)
val SoftLavender = Color(0xFFEAE8FF)
val DeepNavy = Color(0xFF17172B)
val MutedInk = Color(0xFF626277)
val WarmWhite = Color(0xFFFAF9FF)

val LightAppColors = androidx.compose.material3.lightColorScheme(
    primary = BrandPurple,
    onPrimary = Color.White,
    primaryContainer = SoftLavender,
    onPrimaryContainer = DeepNavy,
    secondary = Color(0xFF52617A),
    onSecondary = Color.White,
    background = WarmWhite,
    onBackground = DeepNavy,
    surface = Color.White,
    onSurface = DeepNavy,
    surfaceVariant = Color(0xFFF0EFF8),
    onSurfaceVariant = MutedInk
)

val DarkAppColors = androidx.compose.material3.darkColorScheme(
    primary = Color(0xFFC2BCFF),
    onPrimary = Color(0xFF282078),
    primaryContainer = Color(0xFF40399A),
    onPrimaryContainer = Color(0xFFE8E5FF),
    secondary = Color(0xFFBBC7E3),
    onSecondary = Color(0xFF263247),
    background = Color(0xFF12121D),
    onBackground = Color(0xFFE8E6F5),
    surface = Color(0xFF1A1A28),
    onSurface = Color(0xFFE8E6F5),
    surfaceVariant = Color(0xFF2B2A3C),
    onSurfaceVariant = Color(0xFFC5C2D7)
)
