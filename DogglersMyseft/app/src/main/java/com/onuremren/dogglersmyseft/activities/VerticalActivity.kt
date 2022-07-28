package com.onuremren.dogglersmyseft.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.onuremren.dogglersmyseft.DogCardAdapter
import com.onuremren.dogglersmyseft.R
import com.onuremren.dogglersmyseft.databinding.ActivityVerticalBinding
import com.onuremren.dogglersmyseft.datasource.DataSource

class VerticalActivity : AppCompatActivity() {
    private lateinit var binding: ActivityVerticalBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityVerticalBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val myDataset = DataSource.loadDogs()
        val recyclerView = binding.verticalRecyclerView

        recyclerView.adapter = DogCardAdapter(this,myDataset,3)
        recyclerView.setHasFixedSize(true)
    }

}