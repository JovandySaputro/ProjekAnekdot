package com.adoranwodo.gottrivia.video

import android.graphics.Color
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import com.adoranwodo.gottrivia.R
import com.adoranwodo.gottrivia.video.adapter.TabAdapter
import kotlinx.android.synthetic.main.activity_video.*

class ActivityVideo : AppCompatActivity(){

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_video)

        playTabLayout.colors = intArrayOf(
            R.color.purple_dark,
            R.color.purple_dark)

        viewPager.adapter = TabAdapter(supportFragmentManager,playTabLayout.colors.size)

        with(playTabLayout.tabLayout) {
            setupWithViewPager(viewPager)
            setSelectedTabIndicatorHeight(7)
            setSelectedTabIndicatorColor(Color.WHITE)
            setTabTextColors(ContextCompat.getColor(this@ActivityVideo, R.color.gray_b9), Color.WHITE)
        }
    }

    fun onGoBack(view: View?) {
        finish()
    }
}