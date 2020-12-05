package com.example.me

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivityA : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_activity)
        supportActionBar?.hide()

        // val button = findViewById<Button>(R.id.bYe)
        val bYe = findViewById<Button>(R.id.bYe)
        val buUa = findViewById<Button>(R.id.buUa)
        val buTu = findViewById<Button>(R.id.buTu)
        val buSy = findViewById<Button>(R.id.buSy)
        val buSa = findViewById<Button>(R.id.buSa)
        val buQa = findViewById<Button>(R.id.buQa)
        val buPa = findViewById<Button>(R.id.buPa)
        val buOm = findViewById<Button>(R.id.buOm)
        val buLe = findViewById<Button>(R.id.buLe)
        val buKu = findViewById<Button>(R.id.buKu)
        val buJo = findViewById<Button>(R.id.buJo)
        val buIr = findViewById<Button>(R.id.buIr)
        val buIran = findViewById<Button>(R.id.buIran)
        val buEg = findViewById<Button>(R.id.buEg)
        val buCy = findViewById<Button>(R.id.buCy)
        val buBa = findViewById<Button>(R.id.buBa)


//        button.setOnClickListener {
//            val intent = Intent(this, MainActivityA::class.java)
//            startActivity(intent)
//        }

        bYe.setOnClickListener {
            val intent = Intent(this, Yemen::class.java)
            startActivity(intent)
        }


        buUa.setOnClickListener {
            val intent = Intent(this, UAE::class.java)
            startActivity(intent)
        }


        buTu.setOnClickListener {
            val intent = Intent(this, Turkey::class.java)
            startActivity(intent)
        }


        buSy.setOnClickListener {
            val intent = Intent(this, Syria::class.java)
            startActivity(intent)
        }


        buSa.setOnClickListener {
            val intent = Intent(this, KSA::class.java)
            startActivity(intent)
        }


        buQa.setOnClickListener {
            val intent = Intent(this, Qatar::class.java)
            startActivity(intent)
        }


        buPa.setOnClickListener {
            val intent = Intent(this, Palestine::class.java)
            startActivity(intent)
        }


        buOm.setOnClickListener {
            val intent = Intent(this, Oman::class.java)
            startActivity(intent)
        }


        buLe.setOnClickListener {
            val intent = Intent(this, Lebanon::class.java)
            startActivity(intent)
        }


        buKu.setOnClickListener {
            val intent = Intent(this, Kuwait::class.java)
            startActivity(intent)
        }


        buJo.setOnClickListener {
            val intent = Intent(this, Jordan::class.java)
            startActivity(intent)
        }


        buIr.setOnClickListener {
            val intent = Intent(this, Iraq::class.java)
            startActivity(intent)
        }


        buIran.setOnClickListener {
            val intent = Intent(this, Iran::class.java)
            startActivity(intent)
        }


        buEg.setOnClickListener {
            val intent = Intent(this, Egypt::class.java)
            startActivity(intent)
        }


        buCy.setOnClickListener {
            val intent = Intent(this, Cyprus::class.java)
            startActivity(intent)
        }

        buBa.setOnClickListener {
            val intent = Intent(this, Bahrain::class.java)
            startActivity(intent)
        }



    }
}