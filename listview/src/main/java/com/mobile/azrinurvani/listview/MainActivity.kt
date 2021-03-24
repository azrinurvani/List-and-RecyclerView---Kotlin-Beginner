package com.mobile.azrinurvani.listview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Toast
import com.mobile.azrinurvani.listview.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val arrayListView = arrayOf(
            "Apel","Alpukat","Durian","Manggis","Jambu Air","Strawberry", "Ceru"
        )


        binding.listView.adapter = ArrayAdapter<String>(this@MainActivity,android.R.layout.simple_list_item_1,arrayListView)
        binding.listView.setOnItemClickListener{parent,view,position,id->
            Toast.makeText(this@MainActivity,"Anda memilih : ${arrayListView[position]}",Toast.LENGTH_SHORT).show()
        }

    }
}