package com.adoranwodo.gottrivia.contoh

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.adoranwodo.gottrivia.R
import com.adoranwodo.gottrivia.anekdot.IsiAnekdot
import kotlinx.android.synthetic.main.activity_detail_contoh.*
import kotlinx.android.synthetic.main.layout_pengertian.*
import kotlinx.android.synthetic.main.layout_pengertian.layIsiAnekdot

class DetailContoh : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_contoh)
        val id = getIntent().getStringExtra("layout")
        if(id.equals("1")){
            txtHeader.setText("Politik")
            btn_gambar.setOnClickListener(){
                val intent = Intent(applicationContext, IsiAnekdot::class.java)
                intent.putExtra("layout", "4")
                startActivity(intent)
            }
            btn_Dialog.setOnClickListener() {
                val intent = Intent(applicationContext, ActivityIsiContoh::class.java)
                intent.putExtra("layout2", "1")
                startActivity(intent)
            }
            btn_cerpen.setOnClickListener() {
                val intent = Intent(applicationContext, ActivityIsiContoh::class.java)
                intent.putExtra("layout2", "2")
                startActivity(intent)
            }
        }else if(id.equals("2")){
            txtHeader.setText("Singkat")
            btn_Dialog.setOnClickListener() {
                val intent = Intent(applicationContext, ActivityIsiContoh::class.java)
                intent.putExtra("layout2", "3")
                startActivity(intent)
            }
            btn_cerpen.setOnClickListener() {
                val intent = Intent(applicationContext, ActivityIsiContoh::class.java)
                intent.putExtra("layout2", "4")
                startActivity(intent)
            }
            btn_gambar.setOnClickListener(){
                val intent = Intent(applicationContext, IsiAnekdot::class.java)
                intent.putExtra("layout", "5")
                startActivity(intent)
            }
        }else if(id.equals("3")){
            txtHeader.setText("Lucu")
            btn_Dialog.setOnClickListener() {
                val intent = Intent(applicationContext, ActivityIsiContoh::class.java)
                intent.putExtra("layout2", "5")
                startActivity(intent)
            }
            btn_cerpen.setOnClickListener() {
                val intent = Intent(applicationContext, ActivityIsiContoh::class.java)
                intent.putExtra("layout2", "6")
                startActivity(intent)
            }
            btn_gambar.setOnClickListener(){
                val intent = Intent(applicationContext, IsiAnekdot::class.java)
                intent.putExtra("layout", "6")
                startActivity(intent)
            }
        }else if(id.equals("4")){
            txtHeader.setText("B. Daerah")
            btn_Dialog.setOnClickListener() {
                val intent = Intent(applicationContext, ActivityIsiContoh::class.java)
                intent.putExtra("layout2", "7")
                startActivity(intent)
            }
            btn_cerpen.setOnClickListener() {
                val intent = Intent(applicationContext, ActivityIsiContoh::class.java)
                intent.putExtra("layout2", "8")
                startActivity(intent)
            }
            btn_gambar.setOnClickListener(){
                val intent = Intent(applicationContext, IsiAnekdot::class.java)
                intent.putExtra("layout", "7")
                startActivity(intent)
            }
        }else if(id.equals("5")){
            txtHeader.setText("Kesehatan")
            btn_Dialog.setOnClickListener() {
                val intent = Intent(applicationContext, ActivityIsiContoh::class.java)
                intent.putExtra("layout2", "9")
                startActivity(intent)
            }
            btn_cerpen.setOnClickListener() {
                val intent = Intent(applicationContext, ActivityIsiContoh::class.java)
                intent.putExtra("layout2", "10")
                startActivity(intent)
            }
            btn_gambar.setOnClickListener(){
                val intent = Intent(applicationContext, IsiAnekdot::class.java)
                intent.putExtra("layout", "8")
                startActivity(intent)
            }
        }else if(id.equals("6")){
            txtHeader.setText("Sekolah")
            btn_Dialog.setOnClickListener() {
                val intent = Intent(applicationContext, ActivityIsiContoh::class.java)
                intent.putExtra("layout2", "11")
                startActivity(intent)
            }
            btn_cerpen.setOnClickListener() {
                val intent = Intent(applicationContext, ActivityIsiContoh::class.java)
                intent.putExtra("layout2", "12")
                startActivity(intent)
            }
            btn_gambar.setOnClickListener(){
                val intent = Intent(applicationContext, IsiAnekdot::class.java)
                intent.putExtra("layout", "9")
                startActivity(intent)
            }
        } else{
            finish()
        }
    }
    fun onGoBack(view: View?) {
        finish()
    }
}