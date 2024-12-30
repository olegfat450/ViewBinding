package com.example.viewbinding

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView

class WidgetAdapter( val list: List<Int>,val context: Context): BaseAdapter() {

    private var layoutInflater: LayoutInflater? = null

    override fun getCount() = list.size

    override fun getItem(position: Int) = null

    override fun getItemId(position: Int): Long = 0

    override fun getView(position: Int, convertView1: View?, parent: ViewGroup?): View? {

        var convertView = convertView1

        if (layoutInflater == null) layoutInflater = context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater

        if (convertView == null) convertView = layoutInflater!!.inflate(R.layout.widget_item,null)

           convertView?.findViewById<ImageView>(R.id.image_widget)?.setImageResource(list[position])

        return convertView
    }


}