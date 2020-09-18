package com.example.emergency_call

import android.content.Intent
import android.media.MediaPlayer
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        /** 누르면 음악 나오기 */
        emerg_btn.setOnClickListener {
            val soundFile = MediaPlayer.create(this, R.raw.sound)
            soundFile.start()
        }

        /** 누르면 전화 다이얼 나오기 */
        emerg_img.setOnClickListener {
            val intentVal = Intent(Intent.ACTION_DIAL)
            intentVal.data = Uri.parse("tel:112")
            startActivity(intentVal)
        }
    }
}