package com.example.me

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Window
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        supportActionBar?.hide()

        val button = findViewById<Button>(R.id.button)

        button.setOnClickListener {
            val intent = Intent(this, email_class::class.java)
           startActivity(intent)


        }

    }
}