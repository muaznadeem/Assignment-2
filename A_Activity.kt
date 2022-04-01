package com.example.assignment2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class A_Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val a_activity: Button = findViewById(R.id.a_button)

        a_activity.setOnClickListener{
            val intent = Intent(this, B_Activity::class.java)
            startActivity(intent)
        }

    }
}
