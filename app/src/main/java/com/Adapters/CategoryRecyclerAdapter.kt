package com.Adapters

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import com.Model.Category
import com.Services.DataService.categories
import com.example.coderswag.R

class CategoryRecyclerAdapter(val context: Context, val categories: List<Category>) : RecyclerView.Adapter<CategoryRecyclerAdapter.Holder>() {

    override fun onCreateViewHolder(p0: ViewGroup, p1: Int): Holder {
        val view = LayoutInflater.from(context)
            .inflate(R.layout.category_list_item, p0, false)
        return Holder(view)
    }

    override fun getItemCount(): Int {
        return categories.count()
    }

    override fun onBindViewHolder(holder: Holder, position: Int) {
       holder.bindCategory(categories[position], context)
    }

    inner class Holder(itemView: View) : RecyclerView.ViewHolder(itemView){
        val categoryImage = itemView.findViewById<ImageView>(R.id.categoryImage)
        val categoryName = itemView.findViewById<TextView>(R.id.categoryName)

        fun bindCategory(category: Category, context: Context){
            val resourseId = context.resources.getIdentifier(category.image,
                "drawable", context.packageName)
            categoryImage?.setImageResource(resourseId)
            categoryName?.text = category.title
        }
    }
}