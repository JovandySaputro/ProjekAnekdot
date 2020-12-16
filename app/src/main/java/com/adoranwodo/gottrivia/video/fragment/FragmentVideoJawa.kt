package com.adoranwodo.gottrivia.video.fragment

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.adoranwodo.gottrivia.R
import com.adoranwodo.gottrivia.video.adapter.VideoIndoAdapter
import com.adoranwodo.gottrivia.video.adapter.VideoJawaAdapter
import com.adoranwodo.gottrivia.video.model.VideoDummyIndo
import com.adoranwodo.gottrivia.video.model.VideoJawaDummy
import kotlinx.android.synthetic.main.fragment_indo.*

class FragmentVideoJawa : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_jawa, container, false)
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        displayList()
    }
    @SuppressLint("WrongConstant")
    private fun displayList() {
        val video = ArrayList<VideoJawaDummy>()
        video.addAll(VideoJawaDummy.getList())
        val layoutManager = LinearLayoutManager(activity, LinearLayoutManager.VERTICAL, false)
        list_video.layoutManager = layoutManager
        list_video.adapter = VideoJawaAdapter(video,activity!!)
    }
}