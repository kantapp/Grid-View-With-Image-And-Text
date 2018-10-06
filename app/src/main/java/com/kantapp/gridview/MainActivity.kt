package com.kantapp.gridview

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        grid_view_image_text.adapter=CustomGridviewAdapter(this,getTitles(),getImages())

        grid_view_image_text.onItemClickListener = AdapterView.OnItemClickListener {
            parent, view, position, id ->
            Toast.makeText(this@MainActivity, "GridView Item: $position", Toast.LENGTH_LONG).show()
        }
    }

    fun getImages(): ArrayList<Int> {
        val images=ArrayList<Int>()
        images.add(R.drawable.apple)
        images.add(R.drawable.blueopaque)
        images.add(R.drawable.call)
        images.add(R.drawable.html5)
        images.add(R.drawable.id)
        images.add(R.drawable.instagram)
        images.add(R.drawable.linkedin)
        images.add(R.drawable.linkedinblack)
        images.add(R.drawable.spotify)
        images.add(R.drawable.twitch)
        images.add(R.drawable.whatsapp)

        return images
    }
    fun getTitles(): ArrayList<String> {
        val titles=ArrayList<String>()
        titles.add("Apple")
        titles.add("blueopaque")
        titles.add("call")
        titles.add("Html5")
        titles.add("ID")
        titles.add("Instagram")
        titles.add("Linkedin")
        titles.add("Linkedin Black")
        titles.add("Spotify")
        titles.add("Twitch")
        titles.add("Whatsapp")
        return titles
    }
}
