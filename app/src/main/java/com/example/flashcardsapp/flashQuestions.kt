package com.example.flashcardsapp

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalHapticFeedback
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.flashcardsapp.ui.theme.FlashcardsAPPTheme

class flashQuestions : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {

        var score = intent.getIntExtra("score",-1)


        super.onCreate(savedInstanceState)
        setContent{
            var feedback by remember {
                mutableStateOf("")

            }
            Column (modifier = Modifier.fillMaxSize(),
                horizontalAlignment = Alignment.CenterHorizontally){
                if (score ==0) {
                    feedback = "you did not try"
                }
                if (score < 3) {
                    feedback = "You have failed "
                }else{
                    feedback = "Good "

                }


                Text(text = feedback)

                Spacer(modifier = Modifier.size(30.dp))

                Text(text = "Press the button to review your mark")

                Spacer(modifier = Modifier.size(30.dp))

                Button(
                    onClick = {val next = Intent(this@flashQuestions, scorescreen::class.java)
                        next.putExtra("score",score)
                        startActivity(next)


                    })
                {
                 Text(text ="REVIEW")
                }
            }







        }
    }
}

