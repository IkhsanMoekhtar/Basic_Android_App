// File: ContentAdapter.kt
package com.example.finalprojectkotlin

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ContentAdapter(
    private val items: List<ContentModel>,
    private val listener: (ContentModel) -> Unit
): RecyclerView.Adapter<ContentAdapter.ViewHolder>() {

    class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
        val image = itemView.findViewById<ImageView>(R.id.image)
        val title = itemView.findViewById<TextView>(R.id.title)
        val overview = itemView.findViewById<TextView>(R.id.overview)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) = ViewHolder(
        LayoutInflater.from(parent.context).inflate(R.layout.adapter_content,parent,false)
    )

    override fun getItemCount() = items.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = items[position]
        holder.image.setImageResource(item.image)
        holder.title.text = item.title
        holder.overview.text = item.overview
        holder.itemView.setOnClickListener {
            listener(item)
        }
    }
}
