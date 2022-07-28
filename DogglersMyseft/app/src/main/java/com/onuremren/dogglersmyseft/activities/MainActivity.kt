package com.onuremren.dogglersmyseft.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.onuremren.dogglersmyseft.R
import com.onuremren.dogglersmyseft.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var listIntent: Intent

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.gridBtn.setOnClickListener { intentToGrid() }
        binding.verticalBtn.setOnClickListener { intentToVertical() }
        binding.horizontalBtn.setOnClickListener { intentToHorizontal() }
    }

    private fun intentToHorizontal() {
        listIntent = Intent(this,HorizontalActivity::class.java)
        startActivity(listIntent)
    }

    private fun intentToVertical() {
        listIntent = Intent(this, VerticalActivity::class.java)
        startActivity(listIntent)
    }

    private fun intentToGrid() {
        listIntent = Intent(this, GridLayoutActivity::class.java)
        startActivity(listIntent)
    }
}