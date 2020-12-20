package com.adoranwodo.gottrivia.contoh

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.adoranwodo.gottrivia.R
import kotlinx.android.synthetic.main.activity_isi_contoh.*
import kotlinx.android.synthetic.main.layout_pengertian.*

class ActivityIsiContoh: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_isi_contoh)
        val id = getIntent().getStringExtra("layout2")
        if(id.equals("1")){
            judul_isi_contoh.setText("MEMBUAT UNDANG-UNDANG SENDIRI")
            txt_isi_contoh.setText(R.string.dialog_politik)
        }else if(id.equals("2")){
            judul_isi_contoh.setText("PRESIDEN KETIKA BERDOA UNTUK NEGARA")
            txt_isi_contoh.setText(R.string.cerpen_politik)
        }else if(id.equals("3")){
            judul_isi_contoh.setText("Pesan di Online Shop")
            txt_isi_contoh.setText(R.string.dialog_singkat)
        }else if(id.equals("4")){
            judul_isi_contoh.setText("Penjual Roti ")
            txt_isi_contoh.setText(R.string.cerpen_singkat)
        }else if(id.equals("5")){
            judul_isi_contoh.setText("KECOA ")
            txt_isi_contoh.setText(R.string.dialog_lucu)
        }else if(id.equals("6")){
            judul_isi_contoh.setText("Tanda-Tanda Orang Pintar")
            txt_isi_contoh.setText(R.string.cerpen_lucu)
        }else if(id.equals("7")){
            judul_isi_contoh.setText("Salah Persepsi")
            txt_isi_contoh.setText(R.string.dialog_daerah)
        }else if(id.equals("8")){
            judul_isi_contoh.setText("Ora Adil")
            txt_isi_contoh.setText(R.string.cerpen_daerah)
        }else if(id.equals("9")){
            judul_isi_contoh.setText("Obat Sakit Kepala")
            txt_isi_contoh.setText(R.string.dialog_kesehatan)
        }else if(id.equals("10")){
            judul_isi_contoh.setText("Test Mata")
            txt_isi_contoh.setText(R.string.cerpen_kesehatan)
        }else if(id.equals("11")){
            judul_isi_contoh.setText("Perpustakaan dan kantin")
            txt_isi_contoh.setText(R.string.dialog_sekolah)
        }else if(id.equals("12")){
            judul_isi_contoh.setText("Pelajaran Biologi tentang Binatang")
            txt_isi_contoh.setText(R.string.cerpen_sekolah)
        }else{
         finish()
        }
    }
    fun onGoBack(view: View?) {
        finish()
    }
}