package com.Controller

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.RecyclerView
import android.widget.ArrayAdapter
import android.widget.Toast
import com.Adapters.CategoryAdapter
import com.Model.Category
import com.Services.DataService
import com.example.coderswag.R
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    lateinit var adapter : CategoryAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //initialise adapter
        adapter = CategoryAdapter(this, DataService.categories)

        list_view.adapter = adapter




    }
}
