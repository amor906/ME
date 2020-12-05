package com.example.me

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class email_class : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_email_class)
        supportActionBar?.hide()

        val button3 = findViewById<Button>(R.id.button3)
        val button2 = findViewById<Button>(R.id.button2)

    }
}