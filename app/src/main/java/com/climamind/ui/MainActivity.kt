package com.climamind.ui

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.climamind.R

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnExercises = findViewById<Button>(R.id.btn_exercises)
        val btnSupport = findViewById<Button>(R.id.btn_support)
        val btnCommunity = findViewById<Button>(R.id.btn_community)

        btnExercises.setOnClickListener {
            startActivity(Intent(this, ExercisesActivity::class.java))
        }

        btnSupport.setOnClickListener {
            startActivity(Intent(this, SupportActivity::class.java))
        }

        btnCommunity.setOnClickListener {
            startActivity(Intent(this, CommunityActivity::class.java))
        }
    }
}