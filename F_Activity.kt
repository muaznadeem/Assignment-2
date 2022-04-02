package com.example.muazass

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class F_Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_factivity)

        val F_Button: Button = findViewById(R.id.F_Button)

        F_Button.setOnClickListener {
            val intent = Intent(this, E_Activity::class.java)
            startActivity(intent)
        }
    }
}