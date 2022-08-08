package com.hygge.hygge

import android.os.Bundle
import android.widget.SeekBar
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

public class SearchActivity : AppCompatActivity() {
        override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.near_rest)

        var seek = findViewById<SeekBar>(R.id.days)
        var v = findViewById(R.id.viewDays) as TextView

        v.setText("휴식기간을 선택해주세요.")

        seek.setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener{
        override fun onProgressChanged(seekBar: SeekBar, progress: Int, fromUser: Boolean) {
        // here, you react to the value being set in seekBar
        //값이 변경되었을 때 구현
        var dayVal = 0
        var yearVal = 0
        if (progress >= 365) {
        dayVal = progress % 365
        yearVal = progress / 365
        } else {
        dayVal = progress
        }
        v.setText(yearVal.toString() + "년 " + dayVal.toString() + "일")
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