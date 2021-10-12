package com.example.mynewjetpackproject

import android.R
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Colors
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import java.lang.reflect.Modifier

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Demo()
        }
    }
}


@Composable
fun Demo() {
    Text(text = "My Name is Aamir Khan")
}

@Preview(showBackground = true)
@Composable
fun MyPreview() {
    Surface(androidx.compose.ui.Modifier.fillMaxSize()) {
        Demo()
    }

}