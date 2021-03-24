package com.mobile.azrinurvani.kotlinbeginner_listandrecyclerview

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.mobile.azrinurvani.kotlinbeginner_listandrecyclerview.databinding.ItemRecyclerViewBinding

class FruitAdapter(val fruitName:ArrayList<String>,val fruitImage:ArrayList<Int>) : RecyclerView.Adapter<FruitAdapter.FruitViewHolder>() {
    lateinit var itemRecyclerViewBinding : ItemRecyclerViewBinding

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FruitViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        itemRecyclerViewBinding = ItemRecyclerViewBinding.inflate(layoutInflater,parent, false)
        return FruitViewHolder(itemRecyclerViewBinding)
    }

    override fun getItemCount(): Int {
        return fruitName.size;
    }

    override fun onBindViewHolder(holder: FruitViewHolder, position: Int) {
        holder.fName.text = fruitName[position]
        holder.fImage.setImageResource(fruitImage[position])

        holder.itemView.setOnClickListener {
            Toast.makeText(holder.itemView.context, "Anda memilih : ${fruitName[position]}", Toast.LENGTH_SHORT).show()
        }
    }

    class FruitViewHolder(itemRecyclerViewBinding: ItemRecyclerViewBinding): RecyclerView.ViewHolder(itemRecyclerViewBinding.root) {
        private var binding: ItemRecyclerViewBinding = itemRecyclerViewBinding

        val fName = this.binding.txtRecycler
        val fImage = this.binding.imgRecycler
    }
}