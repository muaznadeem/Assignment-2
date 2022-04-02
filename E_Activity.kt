package com.example.muazass

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class E_Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_eactivity)

        val E_Button: Button = findViewById(R.id.E_Button)

        E_Button.setOnClickListener {
            val intent = Intent(this, F_Activity::class.java)
            startActivity(intent)
        }
    }
}