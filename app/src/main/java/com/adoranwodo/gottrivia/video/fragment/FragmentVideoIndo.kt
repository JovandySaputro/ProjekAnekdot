package com.adoranwodo.gottrivia.video.fragment

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.Gravity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.adoranwodo.gottrivia.R
import com.adoranwodo.gottrivia.video.adapter.VideoIndoAdapter
import com.adoranwodo.gottrivia.video.adapter.VideoJawaAdapter
import com.adoranwodo.gottrivia.video.model.VideoDummyIndo
import kotlinx.android.synthetic.main.fragment_indo.*

class FragmentVideoIndo : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_indo, container, false)
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        displayList()
    }
    @SuppressLint("WrongConstant")
    private fun displayList() {
        val video = ArrayList<VideoDummyIndo>()
        video.addAll(VideoDummyIndo.getList())
        val layoutManager = LinearLayoutManager(activity, LinearLayoutManager.VERTICAL, false)
        list_video.layoutManager = layoutManager
        list_video.adapter = VideoIndoAdapter(video,activity!!)
    }
}