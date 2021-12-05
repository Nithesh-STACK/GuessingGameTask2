package com.example.task4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class CorrectAnsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_correct_ans)
        val answer=intent.getStringExtra("Ans")
        findViewById<TextView>(R.id.CorrectAnswerView).text="$answer"
    }
}