package com.kantapp.gridview

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import kotlinx.android.synthetic.main.gridview_layout.view.*

class CustomGridviewAdapter(
        private val context:Context,
        private val titles:ArrayList<String>,
        private val images:ArrayList<Int>):BaseAdapter()
{
    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val view=LayoutInflater.from(context).inflate(R.layout.gridview_layout,parent,false)
        view.android_gridview_image.setImageResource(images[position])
        view.android_gridview_text.text = titles[position]
        return view
    }

    override fun getItem(position: Int): Any? {
        return null
    }

    override fun getItemId(position: Int): Long {
        return 0
    }

    override fun getCount(): Int {
        return titles.size
    }

}