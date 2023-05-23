package com.example.tapcolor

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setListeners()
    }
    private fun setListeners(){
        val boxMerah = findViewById<TextView>(R.id.box_merah)
        val boxBiru = findViewById<TextView>(R.id.box_biru)
        val boxKuning = findViewById<TextView>(R.id.box_kuning)
        val boxHijau = findViewById<TextView>(R.id.box_hijau)
        val boxOrange = findViewById<TextView>(R.id.box_orange)
        val boxClear = findViewById<TextView>(R.id.box_clear)

        val rootConstrainLayout = findViewById<View>(R.id.constrain_layout)

        val clickableView: List<View> =
            listOf(boxMerah, boxBiru, boxKuning, boxHijau, boxOrange, boxClear, rootConstrainLayout)

        for (item in clickableView){
            item.setOnClickListener { makeColored(it) }
        }
    }
    private fun makeColored(view: View){
        val boxMerah = findViewById<TextView>(R.id.box_merah)
        val boxBiru = findViewById<TextView>(R.id.box_biru)
        val boxKuning = findViewById<TextView>(R.id.box_kuning)
        val boxHijau = findViewById<TextView>(R.id.box_hijau)
        val boxOrange = findViewById<TextView>(R.id.box_orange)
        val boxClear = findViewById<TextView>(R.id.box_clear)
        when (view.id) {
            R.id.box_merah -> {
                boxMerah.setBackgroundResource(R.id.box_merah)
                boxBiru.setBackgroundResource(R.id.box_biru)
                boxKuning.setBackgroundResource(R.id.box_kuning)


            }
        }
    }
}