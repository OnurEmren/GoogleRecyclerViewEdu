package com.onuremren.dogglersmyseft

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.onuremren.dogglersmyseft.model.Dog

class DogCardAdapter(private val context: Context, private val dataSet: List<Dog>, private val layout: Int) :
    RecyclerView.Adapter<DogCardAdapter.DogViewHolder>() {

    class DogViewHolder(val view: View): RecyclerView.ViewHolder(view){

        val nameText: TextView = view.findViewById(R.id.nameGrid)
        val ageText: TextView = view.findViewById(R.id.ageGrid)
        val hobbiesText: TextView = view.findViewById(R.id.hobbiesGrid)
        val imageView: ImageView = view.findViewById(R.id.imageGrid)

    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): DogCardAdapter.DogViewHolder {

            val adapterLayout = LayoutInflater.from(parent.context).inflate(R.layout.grid_list_item,parent,false)
            return DogViewHolder(adapterLayout)

    }

    override fun onBindViewHolder(holder: DogCardAdapter.DogViewHolder, position: Int) {
        val item = dataSet[position]
        holder.nameText.text = dataSet[position].name
        holder.ageText.text = dataSet[position].age
        holder.hobbiesText.text = dataSet[position].hobbies
        holder.imageView.setImageResource(item.imageResourceId)
    }

    override fun getItemCount(): Int {
        return dataSet.size
    }
}