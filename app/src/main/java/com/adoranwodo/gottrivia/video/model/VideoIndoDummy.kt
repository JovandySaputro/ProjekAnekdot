package com.adoranwodo.gottrivia.video.model

class VideoDummyIndo (val url: String,
                  val video_title: String,
                  val poster_name: String,
                  val post_time_stamp: String,
                  val video_desc: String,
                  val duration: String) {

    companion object {

        fun getList(): List<VideoDummyIndo> {
            val versionList = ArrayList<VideoDummyIndo>()
            versionList.clear()
            versionList.add(VideoDummyIndo("https://youtu.be/m4W_iS3v7Rc",
                "KOCAK !!! Video anekdot bahasa Indonesia 5 orang",
                "Nabil MM",
                "2 tahun yang lalu",
                "43.067 x ditonton",
                "3:50"))
            versionList.add(VideoDummyIndo("https://youtu.be/13K5yyf1wGI",
                "Video ANEKDOT lucu mengkritik bikin ngakak parah \uD83D\uDE39\uD83D\uDE39",
                "SHENBY CHANNEL",
                "1 tahun yang lalu",
                "4.668 x ditonton",
                "3:21"))
            versionList.add(VideoDummyIndo("https://youtu.be/joyrFCbgN4w",
                "SAMPAH MASYARAKAT??? | Video Anekdot",
                "Sonia Zaleha",
                "4 tahun yang lalu",
                "56.487 x ditonton",
                "4:12"))
            versionList.add(VideoDummyIndo("https://youtu.be/WLZvx9D1eQs",
                "Vidio anekdot lucu\uD83D\uDE02\uD83D\uDE02bikin ngakak",
                "El tubs",
                "2 tahun yang lalu",
                "36.476 x ditonton",
                "5:38"))
            versionList.add(VideoDummyIndo("https://youtu.be/wmBhI6QpAY0",
                "TEKS ANEKDOT \"GURU SELALU BENAR\"",
                "MURSHE",
                "1 bulan yang lalu",
                "737 x ditonton",
                "8:32"))
            versionList.add(VideoDummyIndo("https://youtu.be/51CMnUtJspw",
            "Drama anekdot (tugas B. Indo)",
            "Rifda",
            "1 tahun yang lalu",
            "304 x ditonton",
            "7:10"))

            return versionList
        }
    }
}