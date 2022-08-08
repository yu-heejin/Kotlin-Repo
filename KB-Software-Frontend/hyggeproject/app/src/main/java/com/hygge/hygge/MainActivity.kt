package com.hygge.hygge

import android.os.Bundle
import android.widget.SeekBar
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.hygge.hygge.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.near_rest)

        var seek = findViewById<SeekBar>(R.id.days)
        var v = findViewById(R.id.viewDays) as TextView

        seek.setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener{
            override fun onProgressChanged(seekBar: SeekBar, progress: Int, fromUser: Boolean) {
                // here, you react to the value being set in seekBar
                //값이 변경되었을 때 구현
                v.setText(progress.toString())
            }

            override fun onStartTrackingTouch(seekBar: SeekBar) {
                // you can probably leave this empty
                //값을 변경하기 위해 유저가 터치했을 때
            }

            override fun onStopTrackingTouch(seekBar: SeekBar) {
                // you can probably leave this empty
                //값을 변경한 후 터치를 떼었을 때
            }
        })

    }
}