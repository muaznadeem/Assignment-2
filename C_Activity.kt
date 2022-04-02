package com.example.muazass

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class C_Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cactivity)

        val C_Button: Button = findViewById(R.id.C_Button)

        C_Button.setOnClickListener {
            val intent = Intent(this, D_Activity::class.java)
            startActivity(intent)
        }
    }
}