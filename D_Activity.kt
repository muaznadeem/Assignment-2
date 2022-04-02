package com.example.muazass

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class D_Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dactivity)

        val D_Button: Button = findViewById(R.id.D_Button)

        D_Button.setOnClickListener {
            val intent = Intent(this, E_Activity::class.java)
            startActivity(intent)
        }
    }
}