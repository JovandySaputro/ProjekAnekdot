package com.adoranwodo.gottrivia.home

import android.app.Activity
import android.content.Context
import android.view.Display
import android.view.ViewGroup
import android.widget.ImageView
import androidx.fragment.app.FragmentActivity
import androidx.swiperefreshlayout.widget.CircularProgressDrawable
import com.adoranwodo.gottrivia.R
import com.bumptech.glide.Glide

import com.opensooq.pluto.base.PlutoAdapter
import com.opensooq.pluto.base.PlutoViewHolder
import com.opensooq.pluto.listeners.OnItemClickListener

class SliderAdapter(items: MutableList<Poster>, onItemClickListener: OnItemClickListener<Poster>) : PlutoAdapter<Poster, SliderAdapter.ViewHolder>(items, onItemClickListener) {

    override fun getViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(parent, R.layout.item_poster)
    }

    class ViewHolder(parent: ViewGroup, itemLayoutId: Int) : PlutoViewHolder<Poster>(parent, itemLayoutId) {
        private var ivPoster: ImageView = getView(R.id.imageSlider)
        val circularProgressDrawable = CircularProgressDrawable((itemView.context as FragmentActivity?)!!)

        override fun set(item: Poster, position: Int) {
            circularProgressDrawable.strokeWidth = 5f
            circularProgressDrawable.centerRadius = 30f
            circularProgressDrawable.start()
            val display: Display = (itemView.context as FragmentActivity?)!!.getWindowManager().getDefaultDisplay()
            val orgWidth: Int = 1456
            val orgHeight: Int = 818
            val adjustedWidth = display.width

            val aspectRatio = orgWidth.toFloat() / orgHeight
            val adjustedHeight = Math.round(adjustedWidth / aspectRatio)

            ivPoster.getLayoutParams().height = adjustedHeight
            ivPoster.getLayoutParams().width = adjustedWidth
            Glide.with((itemView.context as FragmentActivity?)!!)
                .load(item.posterId)
                .placeholder(circularProgressDrawable)
                .into(ivPoster)
        }
    }
}
