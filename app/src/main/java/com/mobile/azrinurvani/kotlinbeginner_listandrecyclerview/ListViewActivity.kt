package com.mobile.azrinurvani.kotlinbeginner_listandrecyclerview

import android.os.Bundle
import android.widget.ArrayAdapter
import androidx.appcompat.app.AppCompatActivity
import com.mobile.azrinurvani.kotlinbeginner_listandrecyclerview.databinding.ActivityListViewBinding

class ListViewActivity : AppCompatActivity() {

    lateinit var binding: ActivityListViewBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityListViewBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val listFruit = arrayOf("Apple","Mangga","Rambutan","Manggis","Durian","Alpukat","Pisang")

        val arrayAdapter = ArrayAdapter(this@ListViewActivity,android.R.layout.simple_list_item_1,listFruit)

        binding.listView.adapter = arrayAdapter



    }
}