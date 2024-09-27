package com.example.musicappui

import android.os.Build
import android.os.Bundle
import android.view.View
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.annotation.RequiresApi
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import com.example.musicappui.ui.MainView
import com.example.musicappui.ui.theme.Home
import com.example.musicappui.ui.theme.MusicAppUITheme

class MainActivity : ComponentActivity() {
    @RequiresApi(Build.VERSION_CODES.P)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MusicAppUITheme {
                window.decorView.apply {
                    systemUiVisibility =
                        View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN or View.SYSTEM_UI_FLAG_LAYOUT_STABLE
                }

                window.statusBarColor = android.graphics.Color.TRANSPARENT
                window.navigationBarDividerColor=android.graphics.Color.BLACK
                window.navigationBarColor=android.graphics.Color.BLACK
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background

                ) {
                   MainView()
                }
            }
        }
    }
}
