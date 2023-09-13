package com.example.exampleapps

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    val loginButtonId= findViewById<Button>(R.id.buttonDark)
    val registerButtonId= findViewById<Button>(R.id.buttonRead)



    loginButtonId.setOnClickListener {
        intent= Intent(applicationContext, MainActivity2::class.java)
        startActivity(intent)
    }

    registerButtonId.setOnClickListener {
        intent= Intent(applicationContext, MainActivity3::class.java)
        startActivity(intent)
    }
        

    }
}