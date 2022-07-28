package com.onuremren.dogglersmyseft.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.onuremren.dogglersmyseft.DogCardAdapter
import com.onuremren.dogglersmyseft.R
import com.onuremren.dogglersmyseft.databinding.ActivityHorizontalBinding
import com.onuremren.dogglersmyseft.datasource.DataSource

class HorizontalActivity : AppCompatActivity() {

    private lateinit var binding: ActivityHorizontalBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHorizontalBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val myDataset = DataSource.loadDogs()
        val recyclerView = binding.horizontalRecyclerView

        recyclerView.adapter = DogCardAdapter(this,myDataset,3)
        recyclerView.setHasFixedSize(true)

    }
}