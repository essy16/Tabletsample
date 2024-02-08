package com.essycynthia.tabletinterview.adaapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.essycynthia.tabletinterview.R
import com.essycynthia.tabletinterview.data.Icons
import com.essycynthia.tabletinterview.data.SecondRecyclerData
import com.essycynthia.tabletinterview.data.ThirdRecyclerData

class ThirdAdapter(private val secondList: ArrayList<ThirdRecyclerData>) :
    RecyclerView.Adapter<ThirdAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {

        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.third_list_item, parent, false)

        return ViewHolder(view)
    }


    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val currentItem = secondList[position]
        holder.foodImageView.setImageResource(currentItem.foodImage)
        holder.foodName.text = currentItem.foodName
        holder.numberOfTimes.text = currentItem.numberOfTimes
        holder.bigAmount.text = currentItem.bigAmount
        holder.smallAmount.text = currentItem.smallAmount
        holder.size.text = currentItem.size
    }


    override fun getItemCount(): Int {
        return secondList.size
    }


    class ViewHolder(ItemView: View) : RecyclerView.ViewHolder(ItemView) {
        val foodImageView: ImageView = itemView.findViewById(R.id.thirdFoodImage)
        val foodName: TextView = itemView.findViewById(R.id.thirdFoodName)
        val bigAmount: TextView = itemView.findViewById(R.id.thirdFoodAmount)
        val smallAmount: TextView = itemView.findViewById(R.id.anotherFoodAmount)
        val numberOfTimes: TextView = itemView.findViewById(R.id.timesOfOrder)
        val size: TextView = itemView.findViewById(R.id.sizeOfFood)
    }
}
