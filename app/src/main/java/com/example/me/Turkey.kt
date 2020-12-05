package com.example.me

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class Turkey : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_turkey)
        supportActionBar?.hide()
    }
}