package com.example.tugas_rizki_infinitelearning

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.example.tugas_rizki_infinitelearning.navigation.Navigations
import com.example.tugas_rizki_infinitelearning.ui.theme.TugasRizkiInfiniteLearningTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            TugasRizkiInfiniteLearningTheme {
               Navigations()
            }
        }
    }
}
