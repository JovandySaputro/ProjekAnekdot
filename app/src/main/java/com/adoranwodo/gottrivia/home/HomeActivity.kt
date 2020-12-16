package com.adoranwodo.gottrivia.home

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.adoranwodo.gottrivia.MainActivity
import com.adoranwodo.gottrivia.R
import com.adoranwodo.gottrivia.anekdot.Pengertian
import com.adoranwodo.gottrivia.video.ActivityVideo
import com.opensooq.pluto.base.PlutoAdapter
import com.opensooq.pluto.listeners.OnItemClickListener
import com.opensooq.pluto.listeners.OnSlideChangeListener
import kotlinx.android.synthetic.main.activity_home.*

class HomeActivity: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?){
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        btn_video.setOnClickListener(){
            val intent = Intent(applicationContext, ActivityVideo::class.java)
            startActivity(intent)
        }
        btn_anekdot.setOnClickListener(){
            val intent = Intent(applicationContext, Pengertian::class.java)
            startActivity(intent)
        }
        btn_Permainan.setOnClickListener(){
            val intent = Intent(applicationContext, MainActivity::class.java)
            startActivity(intent)
        }
        poster()
    }
    fun poster(){
        val adapter = SliderAdapter(
           getPoster(),
            object : OnItemClickListener<Poster> {
                override fun onItemClicked(item: Poster?, position: Int) {
                    Toast.makeText(applicationContext, item!!.link, Toast.LENGTH_LONG).show()
                }
            }
        )
        slider_view.create(adapter, lifecycle = lifecycle)
        slider_view.setOnSlideChangeListener(object : OnSlideChangeListener {
            override fun onSlideChange(adapter: PlutoAdapter<*, *>, position: Int) {
                //                Log.d(TAG, "on slide change $position ")
            }
        })
    }
    private fun getPoster(): MutableList<Poster> {
        val items = mutableListOf<Poster>()
        items.add(Poster("https://images.app.goo.gl/1YR729g1zHfYCNcC9", R.drawable.poster1))
        items.add(Poster("https://images.app.goo.gl/TtxU7TsjsbQdBai19", R.drawable.poster2))
        items.add(Poster("https://images.app.goo.gl/SB7ip7tavZvTydAdA", R.drawable.poster3))
        items.add(Poster("https://images.app.goo.gl/ADJfZ1NCCZVwgABf6", R.drawable.poster4))
        items.add(Poster("https://images.app.goo.gl/jr4XjHWYoV9VSouw9", R.drawable.poster5))
        return items
    }
}