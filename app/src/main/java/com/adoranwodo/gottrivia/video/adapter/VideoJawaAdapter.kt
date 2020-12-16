package com.adoranwodo.gottrivia.video.adapter

import android.content.Context
import android.content.Intent
import android.net.Uri
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import com.adoranwodo.gottrivia.R
import com.adoranwodo.gottrivia.video.model.VideoDummyIndo
import com.adoranwodo.gottrivia.video.model.VideoJawaDummy
import com.bumptech.glide.Glide

class VideoJawaAdapter (private val videoDummyJawaInfos: ArrayList<VideoJawaDummy>, val context: Context) : RecyclerView.Adapter<VideoJawaAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.item_video, parent, false)
        )
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bindItems(videoDummyJawaInfos[position], context)
    }

    override fun getItemCount(): Int {
        return videoDummyJawaInfos.size
    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bindItems(videoDummyJawaInfos: VideoJawaDummy, context: Context) {
            val layVideo = itemView.findViewById<CardView>(R.id.card_view)
            val duration = itemView.findViewById<TextView>(R.id.duration)
            val video_title = itemView.findViewById<TextView>(R.id.video_title)
            val poster_name = itemView.findViewById<TextView>(R.id.poster_name)
            val post_time_stamp = itemView.findViewById<TextView>(R.id.post_time_stamp)
            val video_desc = itemView.findViewById<TextView>(R.id.video_desc)

            duration.text = videoDummyJawaInfos.duration
            video_title.text = videoDummyJawaInfos.video_title
            post_time_stamp.text = videoDummyJawaInfos.post_time_stamp
            poster_name.text = videoDummyJawaInfos.poster_name
            video_desc.text = videoDummyJawaInfos.video_desc

            layVideo.setOnClickListener() {
                context.startActivity(
                    Intent(
                        Intent.ACTION_VIEW,
                        Uri.parse(videoDummyJawaInfos.url)
                    )
                )
            }
        }
    }
}
