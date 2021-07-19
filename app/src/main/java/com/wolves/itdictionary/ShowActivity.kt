package com.wolves.itdictionary

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_show.*

class ShowActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_show)

        val txt_wordEng = intent.getStringExtra("wordEnglish")
        val txt_wordUzb = intent.getStringExtra("wordUzbek")

        txt_wordEnglish.text = txt_wordEng
        txt_wordUzbek.text = txt_wordUzb
    }
}