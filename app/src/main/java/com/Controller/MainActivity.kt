package com.Controller

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.widget.ArrayAdapter
import android.widget.Toast
import com.Adapters.CategoryAdapter
import com.Adapters.CategoryRecyclerAdapter
import com.Model.Category
import com.Services.DataService
import com.example.coderswag.R
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    lateinit var adapter : CategoryRecyclerAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //initialise adapter
        adapter = CategoryRecyclerAdapter(this, DataService.categories)

        list_view.adapter = adapter

        val layoutManager = LinearLayoutManager(this)
        list_view.layoutManager = layoutManager
        list_view.setHasFixedSize(true)


    }
}
