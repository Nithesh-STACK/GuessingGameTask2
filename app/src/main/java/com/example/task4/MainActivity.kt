package com.example.task4

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.google.android.material.textfield.TextInputLayout
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
       var count=0;
        var limitNum:Int=12;
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var randomNo = Random.nextInt(0, 1000)
        val msg = findViewById<TextView>(R.id.answer)
        findViewById<TextView>(R.id.submit).setOnClickListener {
            val input = findViewById<TextInputLayout>(R.id.textInputLayout)
            val guessNo = input.editText?.text?.toString()?.toInt()
            count++;
            when {
              count<limitNum &&   randomNo > guessNo!! -> {
                    msg.text = "No:) My number is bigger"

                }
                count<limitNum && randomNo < guessNo!! -> {
                    msg.text = "No:) My number is smaller"
                }

                count<limitNum &&  randomNo == guessNo!! -> {
                        val newScreenIntent = Intent(this, CorrectAnsActivity::class.java)
                        newScreenIntent.putExtra("Ans", "$randomNo")
                        startActivity(newScreenIntent)
                        randomNo = Random.nextInt(0, 1000)
                        count=0
                    }

                count == limitNum!! -> {
                        val newScreenIntent = Intent(this, WrongAnswerActivity::class.java)
                        newScreenIntent.putExtra("Ans", "$randomNo")
                        startActivity(newScreenIntent)
                    randomNo = Random.nextInt(0, 1000)
                    count=0
                    }


            }
        }
        }
    }
