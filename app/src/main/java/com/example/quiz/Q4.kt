package com.example.quiz

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Q4 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_q4)

        val q1: Button = findViewById(R.id.q1)
        val q2: Button = findViewById(R.id.q2)
        val q3: Button = findViewById(R.id.q3)
        val q4: Button = findViewById(R.id.q4)

        val receivedIntent = intent
        val numrand = receivedIntent.getIntExtra("jumeng",0)

        q1.setOnClickListener { //เปลี่ยนหน้า
            val intent = Intent(this, Q5::class.java)
            intent.putExtra("jumeng", numrand )

            startActivity(intent)
        }
        q2.setOnClickListener { //เปลี่ยนหน้า
            val intent = Intent(this, Q5::class.java)
            intent.putExtra("jumeng", numrand+1)

            startActivity(intent)
        }
        q3.setOnClickListener { //เปลี่ยนหน้า
            val intent = Intent(this, Q5::class.java)
            intent.putExtra("jumeng", numrand )

            startActivity(intent)
        }
        q4.setOnClickListener { //เปลี่ยนหน้า
            val intent = Intent(this, Q5::class.java)
            intent.putExtra("jumeng", numrand)

            startActivity(intent)
        }
    }
}