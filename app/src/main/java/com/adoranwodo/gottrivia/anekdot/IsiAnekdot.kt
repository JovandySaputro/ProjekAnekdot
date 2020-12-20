package com.adoranwodo.gottrivia.anekdot

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.adoranwodo.gottrivia.R
import kotlinx.android.synthetic.main.layout_pengertian.*

class IsiAnekdot: AppCompatActivity() {

    @SuppressLint("ResourceAsColor")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.layout_pengertian)
        val id = getIntent().getStringExtra("layout")
        if(id.equals("1")){
            layIsiAnekdot.setBackgroundResource(R.drawable.pengertian)
        }else if(id.equals("2")){
            layIsiAnekdot.setBackgroundResource(R.drawable.sturtur)
        }else if(id.equals("3")){
            layIsiAnekdot.setBackgroundResource(R.drawable.ciri)
        }else if(id.equals("4")){
            layIsiAnekdot.setBackgroundResource(R.drawable.politik)
        }else if(id.equals("5")){
            layIsiAnekdot.setBackgroundResource(R.drawable.singkat)
        }else if(id.equals("6")){
            layIsiAnekdot.setBackgroundResource(R.drawable.lucu)
        }else if(id.equals("7")){
            layIsiAnekdot.setBackgroundResource(R.drawable.bdaerah)
        }else if(id.equals("8")){
            layIsiAnekdot.setBackgroundResource(R.drawable.kesehatan)
        }else if(id.equals("9")){
            layIsiAnekdot.setBackgroundResource(R.drawable.sekolah)
        }else{
            layIsiAnekdot.setBackgroundColor(R.color.purple_dark)
        }
    }

    fun onGoBack(view: View?) {
        finish()
    }
}
