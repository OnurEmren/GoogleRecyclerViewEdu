package com.onuremren.dogglersmyseft.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.onuremren.dogglersmyseft.DogCardAdapter
import com.onuremren.dogglersmyseft.R
import com.onuremren.dogglersmyseft.databinding.ActivityGridLayoutBinding
import com.onuremren.dogglersmyseft.datasource.DataSource

class GridLayoutActivity : AppCompatActivity() {

    private lateinit var binding: ActivityGridLayoutBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityGridLayoutBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val myDataset = DataSource.loadDogs()
        val recyclerView = binding.gridRecyclerView

        recyclerView.adapter = DogCardAdapter(this,myDataset,3)
        recyclerView.setHasFixedSize(true)
    }
}