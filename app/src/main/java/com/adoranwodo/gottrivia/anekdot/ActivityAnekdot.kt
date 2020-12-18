package com.adoranwodo.gottrivia.anekdot

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.adoranwodo.gottrivia.R
import kotlinx.android.synthetic.main.activity_anekdot.*

class ActivityAnekdot : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_anekdot)
        btn_pengertian.setOnClickListener(){
            val intent = Intent(applicationContext, IsiAnekdot::class.java)
            intent.putExtra("layout", "1")
            startActivity(intent)
        }
        btn_ciri.setOnClickListener(){
            val intent = Intent(applicationContext, IsiAnekdot::class.java)
            intent.putExtra("layout", "3")
            startActivity(intent)
        }
        btn_struktur.setOnClickListener(){
            val intent = Intent(applicationContext, IsiAnekdot::class.java)
            intent.putExtra("layout", "2")
            startActivity(intent)
        }
    }
    fun onGoBack(view: View?) {
        finish()
    }
}