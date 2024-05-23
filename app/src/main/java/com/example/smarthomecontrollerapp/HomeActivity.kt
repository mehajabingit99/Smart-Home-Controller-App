package com.example.smarthomecontrollerapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        val dl: Button = findViewById(R.id.dashboardLite)
        val db: Button = findViewById(R.id.dashboardBlack)

        dl.setOnClickListener {
            Toast.makeText(this@HomeActivity, "Dashboard Lite Successful", Toast.LENGTH_SHORT).show()
            val intent = Intent(this@HomeActivity, DashboardLite::class.java)
            startActivity(intent)
        }

        db.setOnClickListener {
            Toast.makeText(this@HomeActivity, "Dashboard Black Successful", Toast.LENGTH_SHORT).show()
            val intent = Intent(this@HomeActivity, DashboardblackActivity::class.java)
            startActivity(intent)
        }
    }
}
