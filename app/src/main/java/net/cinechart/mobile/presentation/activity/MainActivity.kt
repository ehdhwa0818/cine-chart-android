package net.cinechart.mobile.presentation.activity

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import dagger.hilt.android.AndroidEntryPoint
import net.cinechart.mobile.presentation.ui.theme.CineChartTheme

@AndroidEntryPoint
class MainActivity: ComponentActivity() {
    // MainActivity
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CineChartTheme {

            }
        }
    }
}