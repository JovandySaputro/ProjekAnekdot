package com.adoranwodo.gottrivia.contoh

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.adoranwodo.gottrivia.R
import com.adoranwodo.gottrivia.anekdot.IsiAnekdot
import kotlinx.android.synthetic.main.activity_anekdot.*
import kotlinx.android.synthetic.main.activity_contoh_anekdot.*

class ActivityContoh : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_contoh_anekdot)
        txtPolitik.setOnClickListener(){
            val intent = Intent(applicationContext, DetailContoh::class.java)
            intent.putExtra("layout", "1")
            startActivity(intent)
        }
        txtsingkat.setOnClickListener(){
            val intent = Intent(applicationContext, DetailContoh::class.java)
            intent.putExtra("layout", "2")
            startActivity(intent)
        }
        txtlucu.setOnClickListener(){
            val intent = Intent(applicationContext, DetailContoh::class.java)
            intent.putExtra("layout", "3")
            startActivity(intent)
        }
        txtbahasa.setOnClickListener(){
            val intent = Intent(applicationContext, DetailContoh::class.java)
            intent.putExtra("layout", "4")
            startActivity(intent)
        }
        txtkesehatan.setOnClickListener(){
            val intent = Intent(applicationContext, DetailContoh::class.java)
            intent.putExtra("layout", "5")
            startActivity(intent)
        }
        txtsekolah.setOnClickListener(){
            val intent = Intent(applicationContext, DetailContoh::class.java)
            intent.putExtra("layout", "6")
            startActivity(intent)
        }
    }
    fun onGoBack(view: View?) {
        finish()
    }
}