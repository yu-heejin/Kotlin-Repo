package com.hygge.hygge.search

import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.hygge.hygge.R

class SerchActivity : AppCompatActivity() {
    var selectButton1 = findViewById<Button>(R.id.select_withkid)
    var selectButton2 = findViewById<Button>(R.id.select_with)
    var selectButton3 = findViewById<Button>(R.id.select_woman)
    var selectButton4 = findViewById<Button>(R.id.select_man)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.near_rest)
    }

    fun onClick(view: View) {
        when (view.id) {
            R.id.select_withkid -> {
                selectButton1.setBackgroundColor(getResources().getColor(R.color.black))
            }
        }
    }
}