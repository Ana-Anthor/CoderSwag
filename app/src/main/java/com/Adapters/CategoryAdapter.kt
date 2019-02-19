package com.Adapters

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import com.Model.Category
import com.example.coderswag.R



class CategoryAdapter(context: Context, categories: List<Category>) : BaseAdapter(){ //exends the class "Base>Adapter"
    val context = context
    val categories = categories


    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val categoryView: View
        val holder : ViewHolder

        if (convertView == null){ //when we present it for the first time
            categoryView = LayoutInflater.from(context).inflate(R.layout.category_list_item, null)
            holder = ViewHolder()
            holder.categoryImgae = categoryView.findViewById(R.id.categoryImage)
            holder.categoryName = categoryView.findViewById(R.id.categoryName)
            println("I exist for the first time! ")
            categoryView.tag = holder
        } else { //if we allredy have created the number of views we are desplaing on the screen at any given time
            //we are goint to reuse that cell
            holder = convertView.tag as ViewHolder
            categoryView = convertView
            println("Go green, recycle!")
        }

        val category = categories[position]
        val resourceId = context.resources.getIdentifier(category.image, "drawable", context.packageName)
        holder.categoryImgae?.setImageResource(resourceId)
        holder.categoryName?.text = category.title

        return categoryView

    }

    override fun getItem(position: Int): Any {
        return categories[position]
    }

    override fun getItemId(position: Int): Long {
        return 0
    }

    override fun getCount(): Int {
        return categories.count()
    }

    private class ViewHolder {
        var categoryImgae: ImageView? = null
        var categoryName: TextView? = null

    }

}