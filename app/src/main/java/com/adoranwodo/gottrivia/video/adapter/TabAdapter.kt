package com.adoranwodo.gottrivia.video.adapter

import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.adoranwodo.gottrivia.video.fragment.FragmentVideoIndo
import com.adoranwodo.gottrivia.video.fragment.FragmentVideoJawa

class TabAdapter(fragmentManager: FragmentManager, private val count: Int) : FragmentPagerAdapter(fragmentManager) {

    override fun getItem(position: Int) = when (position) {
        0 -> FragmentVideoIndo()
        else -> FragmentVideoJawa()
    }

    override fun getCount() = count

    override fun getPageTitle(position: Int) = when (position) {
        0 -> "Indonesia"
        else -> "Jawa"
    }
}
