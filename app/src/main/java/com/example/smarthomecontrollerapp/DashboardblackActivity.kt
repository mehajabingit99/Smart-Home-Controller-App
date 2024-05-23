package com.example.smarthomecontrollerapp

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView

class DashboardblackActivity : AppCompatActivity() {

    private lateinit var airConditioner: CardView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dashboard_lite)

        airConditioner = findViewById(R.id.airconditioner)

        airConditioner.setOnClickListener {
            Toast.makeText(this@DashboardblackActivity, "Selected", Toast.LENGTH_SHORT).show()
            val intent = Intent(this@DashboardblackActivity, AirConditionerActivity::class.java)
            startActivity(intent)
        }
    }
}
