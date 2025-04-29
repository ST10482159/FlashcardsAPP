package com.example.flashcardsapp

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.flashcardsapp.ui.theme.FlashcardsAPPTheme

class Flashcards : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            var questions = arrayOf("question 1 - The pyramids of egypt were built as tombs for pharaoh",
                " question 2- The roman empire was known for its advanced engineering and infrastructure",
                "question 3- The russian revolution led to establishment of a communist  goverment in Russia   ",
                "question 4-The cold war was a geopolitical conflict between the united states and the sovient union  ",
                "question 5- World war I was a global conflict that began at 1914")

            var answers = arrayOf("true" ,"false","true","true","true")
            var index = 0
            var score = 0
            var display by remember{
                mutableStateOf(questions[index])
            }
            var currentQuestion by remember {
                mutableStateOf(questions[index])
            }
            var feedback by remember {
                mutableStateOf("")
            }




            Column {
                Text(text = "Flashcards")

                Text(text = display)

                Text(text = "Score: "+ score)

                Row {
                    Button(onClick =
                    {


                    }) {
                        Text(text = "TRUE")



                    }
                    Button(onClick = {

                    }) {

                        Text(text = "FALSE")

                    }

                }
                Button(
                    onClick = {

                        if (index < questions.size-1){
                            index++
                            currentQuestion =questions[index]
                            feedback= ""
                        }else{
                            val next =Intent(this@Flashcards, flashQuestions::class.java)
                            next.putExtra("score",score)
                            startActivity(next)
                        }

                }) {
                    Text(text = "NEXT")



                }




            }
            
        }
    }
}


        