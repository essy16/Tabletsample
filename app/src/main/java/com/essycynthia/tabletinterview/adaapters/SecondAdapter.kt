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

class SecondAdapter(private val secondList: ArrayList<SecondRecyclerData>) :
    RecyclerView.Adapter<SecondAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {

        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.first_list_item, parent, false)

        return ViewHolder(view)
    }


    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val currentItem = secondList[position]
        holder.imageView.setImageResource(currentItem.image)
        holder.foodAmount.text = currentItem.foodAmount
        holder.statusOfPayment.text = currentItem.statusOfPayment
        holder.time.text = currentItem.time
        holder.numberOfSeats.text = currentItem.numberOfSeats
        holder.tableNumber.text = currentItem.tableNumber
    }

    // return the number of the items in the list
    override fun getItemCount(): Int {
        return secondList.size
    }


    class ViewHolder(ItemView: View) : RecyclerView.ViewHolder(ItemView) {
        val imageView: ImageView = itemView.findViewById(R.id.foodImage)
        val numberOfSeats: TextView = itemView.findViewById(R.id.numberOfPeople)
        val time: TextView = itemView.findViewById(R.id.time)
        val tableNumber: TextView = itemView.findViewById(R.id.circleBackgroundText)
        val statusOfPayment: TextView = itemView.findViewById(R.id.statusOfPayment)
        val foodAmount: TextView = itemView.findViewById(R.id.amount)
    }
}
