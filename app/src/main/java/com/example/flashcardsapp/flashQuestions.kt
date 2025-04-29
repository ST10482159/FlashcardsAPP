package com.example.flashcardsapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.flashcardsapp.ui.theme.FlashcardsAPPTheme

class flashQuestions : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {

        var score = intent.getIntExtra("score",-1)

        super.onCreate(savedInstanceState)
        setContent{

            }
        }
    }


