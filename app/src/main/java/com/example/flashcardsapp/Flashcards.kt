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
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.flashcardsapp.ui.theme.FlashcardsAPPTheme

class Flashcards : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {

        var questions = arrayOf("question 1 - south Africa is the only country in the world that has the national flower ,the king protea",
            " question 2- The great wall of china is located in south africa ",
            "question 3- The san people were early inhabitants of south africa and they are famous for their rock art  ",
            "question 4-The apartheid era in south africa lasted from 1948 to 1994 ",
            "question 5- Julius caesar was the first emperor of Rome")

        // Array of correct answers for each questions

        var answers = arrayOf("true" ,"false","true","true","false")

        var index = 0
        var score = 0

        super.onCreate(savedInstanceState)
        setContent {



            var questionDisplay by remember {
                mutableStateOf(questions[0])
            }
            //feedback for user responses
            var feedback by remember {
                mutableStateOf("")
            }




            Column(modifier = Modifier.fillMaxSize(),
                horizontalAlignment = Alignment.CenterHorizontally) {
                Text(text = "Flashcards")

                //display current questions

                Text(text = questionDisplay)

                Text(text = feedback)

                Text(text = "Score: $score /5")

                Row {
                    Button(onClick ={
                        if (answers[index]=="True") {
                            score++
                            feedback=  "Correct"

                        }
                        else{
                            feedback= "Incorrect"
                        }





                    }) {
                        Text(text = "TRUE")



                    }
                    Button(onClick = {
                        if (answers[index]=="false") {
                            score++
                            feedback="correct"

                        }
                        else{
                            feedback="Incorrect"
                        }


                    }) {

                        Text(text = "FALSE")

                    }

                    //Button move to the next question

                }
                Button(
                    onClick = {

                        if (index < questions.size-1){
                            index++
                            // Update the current question being displayed
                            questionDisplay =questions[index]
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


        