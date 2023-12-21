package com.example.quiz

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val st: Button = findViewById(R.id.st)
        var numrand:Int = 0

        st.setOnClickListener { //เปลี่ยนหน้า
            val intent = Intent(this, Q1::class.java)
            intent.putExtra("jumeng", numrand)

            startActivity(intent)
        }
    }
}