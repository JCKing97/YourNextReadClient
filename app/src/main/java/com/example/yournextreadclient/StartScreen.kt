package com.example.yournextreadclient

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class StartScreen : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.start_screen)
        val loginTxt = findViewById<TextView>(R.id.loginTxt)
        val userId = findViewById<EditText>(R.id.userId)
        val loginButton = findViewById<Button>(R.id.loginButton)
        loginButton.setOnClickListener{
            loginTxt.text = userId.text
        }
    }
}