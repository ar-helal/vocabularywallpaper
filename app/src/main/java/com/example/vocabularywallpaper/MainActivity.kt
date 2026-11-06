package com.example.vocabularywallpaper

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.example.vocabularywallpaper.ui.screens.HomeScreen
import com.example.vocabularywallpaper.ui.theme.VocabularyWallpaperTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        setContent {
            VocabularyWallpaperTheme {
                HomeScreen()
            }
        }
    }
}
