package com.aniruddhambarkar.arcprogressview

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.aniruddhambarkar.arcprogressmeter.ArcProgressView
import com.aniruddhambarkar.arcprogressview.ui.theme.ArcProgressViewTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ArcProgressViewTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Greeting(
                        name = "Android",
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    ArcProgressView(
        modifier = Modifier,
        progress = 0.75f,
        gradientColors = listOf(
        Color(0xFF4C1D95),
        Color(0xFF7C3AED),
        Color(0xFFEC4899),
        Color(0xFF4C1D95)
    ),
    )

}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    ArcProgressViewTheme {
        Greeting("Android")
    }
}