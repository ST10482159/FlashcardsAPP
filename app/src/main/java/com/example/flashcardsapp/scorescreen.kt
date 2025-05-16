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
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.flashcardsapp.ui.theme.FlashcardsAPPTheme

class scorescreen : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {

        var questions = arrayOf("question 1 - south Africa is the only country in the world that has the national flower ,the king protea",
            " question 2- The great wall of china is located in south africa ",
            "question 3- The san people were early inhabitants of south africa and they are famous for their rock art  ",
            "question 4-The apartheid era in south africa lasted from 1948 to 1994 ",
            "question 5- Julius caesar was the first emperor of Rome")

        // Array of correct answers for each questions

        var answers = arrayOf("true" ,"false","true","true","false")

        var score = intent.getIntExtra("score",-1)

        super.onCreate(savedInstanceState)
          setContent {

            Column (
                modifier = Modifier . fillMaxSize(),
                horizontalAlignment = Alignment.CenterHorizontally) {


                Text(
                    text = "Flashcards",
                    modifier = Modifier ,
                    fontSize =   30.sp,
                    fontWeight =FontWeight.Black
                )
                Spacer(modifier = Modifier.size(30.dp))

             Text(
                 text="score",
                 modifier =Modifier,
                 fontSize = 20.sp
             )

                Spacer(modifier = Modifier.size(30.dp))

                Text(text = "question 1")
                Text(text = questions[0])
                Text(text = "  "+ answers[0])
                Spacer(modifier = Modifier.size(30.dp))

                Text(text="question 2")
                Text(text = questions[1])
                Text(text ="  "+ answers[1])
                Spacer(modifier = Modifier.size(30.dp))

                Text(text = "question 3")
                Text(text = questions[2])
                Text(text = " "+ answers[2])
                Spacer(modifier = Modifier.size(30.dp))

                Text(text = "question 4")
                Text(text = questions [3])
                Text(text =" "+ answers[3])
                Spacer(modifier = Modifier.size(30.dp))

                Text(text =" question 5")
                Text(text =questions[4])
                Text(text =" "+ answers[4])
                Spacer(modifier =Modifier.size(30.dp))


                Button(
                    onClick = {
                        finishAffinity()
                        


                    }) {
                    Text(text = " EXIT")
                }


            }







              




                }
            }
        }


