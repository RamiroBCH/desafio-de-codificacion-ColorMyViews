package com.android.example.colormyviews

import android.graphics.Color
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setListeners()
    }
    private fun makeColored(view: View){
        val colores = listOf(Color.BLUE, Color.DKGRAY, Color.GREEN, Color.MAGENTA, Color.RED, Color.YELLOW)
        var x = (0 .. 5).random()
        when(view.id){
            R.id.box_one_text -> view.setBackgroundColor(colores[x])
            R.id.box_two_text -> view.setBackgroundColor(colores[x])
            R.id.box_three_text -> view.setBackgroundColor(colores[x])
            R.id.box_four_text -> view.setBackgroundColor(colores[x])
            R.id.box_five_text -> view.setBackgroundColor(colores[x])
            R.id.box_six_text -> view.setBackgroundColor(colores[x])

            else -> view.setBackgroundColor(colores[x])
        }
    }
    private fun setListeners() {

        val boxOneText = findViewById<TextView>(R.id.box_one_text)
        val boxTwoText = findViewById<TextView>(R.id.box_two_text)
        val boxThreeText = findViewById<TextView>(R.id.box_three_text)
        val boxFourText = findViewById<TextView>(R.id.box_four_text)
        val boxFiveText = findViewById<TextView>(R.id.box_five_text)
        val boxSixText = findViewById<TextView>(R.id.box_six_text)

        val rootConstraintLayout = findViewById<View>(R.id.constraint_layout)

        val clickableViews: List<View> =
            listOf(boxOneText, boxTwoText, boxThreeText,
                boxFourText, boxFiveText, rootConstraintLayout,
                boxSixText
            )
        for (item in clickableViews) {
            item.setOnClickListener { makeColored(it) }
        }
    }
}