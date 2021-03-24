package com.mobile.azrinurvani.kotlinbeginner_listandrecyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.mobile.azrinurvani.kotlinbeginner_listandrecyclerview.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding : ActivityMainBinding
    lateinit var recyclerAdapter : FruitAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val arrayFruitName = arrayListOf("Avocado","Apple","Cherry","Durian","Rose Apple","Strawberry")

        val arrayFruitImage = arrayListOf(
                R.drawable.alpukat,R.drawable.apel,R.drawable.ceri,R.drawable.durian,R.drawable.jambuair,R.drawable.manggis,R.drawable.strawberry)

        recyclerAdapter= FruitAdapter(arrayFruitName,arrayFruitImage)

        binding.rvFruit.apply {
            setHasFixedSize(true)
            layoutManager = LinearLayoutManager(this@MainActivity)
            adapter = recyclerAdapter
        }


    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_mode_recycler,menu)

        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {

        when(item.itemId){
            R.id.mode_list ->{
                binding.rvFruit.apply {
                    setHasFixedSize(true)
                    layoutManager = LinearLayoutManager(this@MainActivity)
                    adapter = recyclerAdapter
                }
            }
            R.id.mode_grid->{
                binding.rvFruit.apply {
                    setHasFixedSize(true)
                    layoutManager = GridLayoutManager(this@MainActivity,2)
                    adapter = recyclerAdapter
                }
            }
        }

        return super.onOptionsItemSelected(item)
    }
}