package com.example.smarthomecontrollerapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val getStartedButton: Button = findViewById(R.id.startbtn)


        // Set a click listener for the get started button
        getStartedButton.setOnClickListener {
            Toast.makeText(this@MainActivity, "Get Started Button Clicked", Toast.LENGTH_SHORT).show()
            // Navigate to DashboardActivity
            val intent = Intent(this@MainActivity, HomeActivity::class.java)
            startActivity(intent)
        }
    }
}
