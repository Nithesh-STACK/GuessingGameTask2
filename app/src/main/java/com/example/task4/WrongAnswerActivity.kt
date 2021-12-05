package com.example.task4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class WrongAnswerActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_wrong_answer)
        val answer=intent.getStringExtra("Ans")
        findViewById<TextView>(R.id.WrongAnswerView).text="$answer"
    }
}