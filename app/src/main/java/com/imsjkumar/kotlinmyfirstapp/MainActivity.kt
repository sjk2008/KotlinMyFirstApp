package com.imsjkumar.kotlinmyfirstapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val wishButton: Button = findViewById(R.id.wish)
        wishButton.setOnClickListener {
            Toast.makeText(this,"Wish her ",Toast.LENGTH_LONG).show()
        }
        val roll : Button = findViewById(R.id.roll)
        roll.setOnClickListener {

            Toast.makeText(this,"You rolled the ball with full potential",Toast.LENGTH_LONG).show()
        }
    }
}