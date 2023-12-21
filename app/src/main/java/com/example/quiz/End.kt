package com.example.quiz

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class End : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_end)

        val shw: TextView = findViewById((R.id.fs))
        val receivedIntent = intent
        val nrand = receivedIntent.getIntExtra("jumeng",0)

        shw.setText("$nrand")

    }
}