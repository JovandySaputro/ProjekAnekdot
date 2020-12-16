package com.adoranwodo.gottrivia.video.model

class VideoJawaDummy (val url: String,
                      val video_title: String,
                      val poster_name: String,
                      val post_time_stamp: String,
                      val video_desc: String,
                      val duration: String) {

    companion object {

        fun getList(): List<VideoJawaDummy> {
            val versionList = ArrayList<VideoJawaDummy>()
            versionList.clear()
            versionList.add(VideoJawaDummy("https://youtu.be/hKy6-koe9RM",
                "Contoh Anekdot \"GURU MAH BEBAS\" SMKN1 GOMBONG ngapak version",
                "jefry WAP",
                "1 tahun yang lalu",
                "8.009 x ditonton",
                "5:41"))
            versionList.add(VideoJawaDummy("https://youtu.be/Puc1KYzOfk4",
                "KOCAK !!! Drama Bahasa Jawa Di Jamin NGAKAK !!!~Maling",
                "Nabil MM",
                "2 tahun yang lalu",
                "17.095 x ditonton",
                "4:25"))
            versionList.add(VideoJawaDummy("https://youtu.be/EfW2r7GKSMA",
                "Anekdot Pendek Bahasa Jawa",
                "Ade Lisa",
                "2 tahun yang lalu",
                "2.265 x ditonton",
                "5:41"))
            versionList.add(VideoJawaDummy("https://youtu.be/PeM3GZ8KpzE ",
                "ANEKDOT BAHASA JAWA",
                "Dinda Aprilia Mutiara Sari",
                "1 tahun yang lalu",
                "368 x ditonton",
                "5:08"))
            versionList.add(VideoJawaDummy("https://www.youtube.com/watch?v=r3yr7xKJUps",
                "ANEKDOT BASA JAWA LUCU - KLAMBI LARANG",
                "Azzahra Aski",
                "1 bulan yang lalu",
                "814 x ditonton",
                "3:22"))

            return versionList
        }
    }
}