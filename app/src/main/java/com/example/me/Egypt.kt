package com.example.me

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class Egypt : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_egypt)
        supportActionBar?.hide()
    }
}