package com.example.jetpack18

import android.content.res.Configuration
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.windowsizeclass.ExperimentalMaterial3WindowSizeClassApi
import androidx.compose.material3.windowsizeclass.WindowSizeClass
import androidx.compose.material3.windowsizeclass.calculateWindowSizeClass
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.toComposeRect
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.platform.LocalDensity
import androidx.window.layout.WindowMetricsCalculator
import com.example.jetpack18.constraintlayoutviews.HomeConstraintLayout
import com.example.jetpack18.ui.theme.JetPack18Theme
import com.example.jetpack18.windowsizeclassviews.HomeSizeClass

class MainActivity : ComponentActivity() {
    @OptIn(ExperimentalMaterial3WindowSizeClassApi::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            //val metrics = WindowMetricsCalculator.getOrCreate().computeCurrentWindowMetrics(this)
            //val size = with(LocalDensity.current) { metrics.bounds.toComposeRect().size.toDpSize() }
            val windowSizeClass = calculateWindowSizeClass(activity = this)
            //
            //val windowSizeClass = WindowSizeClass.calculateFromSize(size)
            JetPack18Theme {
                Surface(modifier = Modifier.fillMaxSize(),color = MaterialTheme.colorScheme.background) {
                    HomeSizeClass(windowSizeClass)
                    //HomeConstraintLayout(windowSizeClass = windowSizeClass)
                }
            }
        }
    }
}




