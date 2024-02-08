package com.essycynthia.tabletinterview.adaapters
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.essycynthia.tabletinterview.R
import com.essycynthia.tabletinterview.data.Icons

class FirstAdapter(private val iconsList: ArrayList<Icons>) : RecyclerView.Adapter<FirstAdapter.ViewHolder>() {

    // create new views
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {

        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.second_list_item, parent, false)

        return ViewHolder(view)
    }


    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val currentItem = iconsList[position]
        holder.imageView.setImageResource(currentItem.icons)

    }

    // return the number of the items in the list
    override fun getItemCount(): Int {
        return iconsList.size
    }


    class ViewHolder(ItemView: View) : RecyclerView.ViewHolder(ItemView) {
        val imageView: ImageView = itemView.findViewById(R.id.icon)
    }
}
