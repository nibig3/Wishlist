package com.example.project2.item_wishlist

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.view.menu.MenuView.ItemView
import androidx.recyclerview.widget.RecyclerView
import com.example.project2.R
import com.example.project2.WishlistItem

class WishlistAdapter(private val items: List<WishlistItem>) : RecyclerView.Adapter<wishlistadapter.viewholder>() {
    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        val nameTextView: TextView = itemView.findViewById(R.id.itemName)
        val priceTextView: TextView = itemView.findViewById(R.id.itemPrice)
        val imageView: ImageView = itemView.findViewById(R.id.itemImage)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_wishlist, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: viewholder, position: Int) {
       val item = items[position]
        holder.nameTextView.text = item.name
        holder.priceTextView.text = item.price.toString()
        holder.imageView.setImageResource(item.imageResId)
    }

    class viewholder {

        val nameTextView: Any
            get() {
                TODO()
            }
    }

    override fun getItemCount()= items.size

}