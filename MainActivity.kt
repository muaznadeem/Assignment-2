package com.example.smdassignment2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val MainActivity: Button = findViewById(R.id.start_button)

        MainActivity.setOnClickListener{
            val intent = Intent(this, A_Activity::class.java)
            startActivity(intent)
        }

    }
}
