package com.example.viewrecycler

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.OrientationHelper
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val exampleList = generateDummyList(50)
        recycler_view.adapter = ExampleAdapter(exampleList)
        recycler_view.layoutManager = GridLayoutManager(this,1,GridLayoutManager.HORIZONTAL,false)
        recycler_view.setHasFixedSize(true)
    }



    private fun generateDummyList(size: Int): List<ExampleItem> {
        val list = ArrayList<ExampleItem>()

        for (i in 0 until size){
            val drawable = when (i % 3){
                0 -> R.drawable.notime
                1 -> R.drawable.notime
                else -> R.drawable.notime
            }

            val item = ExampleItem(drawable, "Item $i")
            list += item
        }

        return list
    }
}