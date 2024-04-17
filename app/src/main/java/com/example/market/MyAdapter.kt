package com.example.market

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.market.databinding.ItemLayoutBinding


class MyAdapter(val itemList : List<Item>) : RecyclerView.Adapter<MyAdapter.Holder>() {
    interface ItemClick {
        fun onClick(view: View, position: Int)
    }

    var itemClick: ItemClick? = null
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Holder {
        val binding = ItemLayoutBinding.inflate(LayoutInflater.from(parent.context), parent,false)
        return Holder(binding)
    }

    override fun onBindViewHolder(holder: Holder, position: Int) {
        holder.itemView.setOnClickListener{
            itemClick?.onClick(it,position)
        }

    }

    override fun getItemCount(): Int {
        return itemList.size
    }

    override fun getItemViewType(position: Int): Int {
        return itemList[position].viewtype
    }
    inner class Holder(private val binding: ItemLayoutBinding) : RecyclerView.ViewHolder(binding.root){
        fun bind(item: Item) {
            binding.title.text = item.title
            binding.place.text = item.place
            binding.price.maxLines = item.price
            binding.chatN.maxLines = item.chat
        }
    }
}