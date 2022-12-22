package com.example.colormyviews

import android.annotation.SuppressLint
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setListeners()
    }

    private fun setListeners() {
        val clickableViews: List<View> = listOf(
            box_one_text, box_two_text, box_three_text, box_four_text, box_five_text, constraint_layout,
            red_boutton, yellow_boutton, green_boutton
        )
        for (item in clickableViews){
            item.setOnClickListener{makeColored(it)}
        }
    }

    @SuppressLint("ResourceAsColor")
    private fun makeColored(view: View) {
        when(view.id){
            R.id.box_one_text -> view.setBackgroundColor(Color.DKGRAY)
            R.id.box_two_text -> view.setBackgroundColor(Color.GRAY)

            R.id.box_three_text -> view.setBackgroundColor(android.R.color.holo_green_light)
            R.id.box_four_text -> view.setBackgroundColor(android.R.color.holo_green_dark)
            R.id.box_five_text -> view.setBackgroundColor(android.R.color.holo_green_light)

            R.id.red_boutton -> box_three_text.setBackgroundResource(R.color.my_red)
            R.id.yellow_boutton -> box_three_text.setBackgroundResource(R.color.my_yellow)
            R.id.green_boutton -> box_three_text.setBackgroundResource(R.color.my_green)



            else -> view.setBackgroundColor(Color.LTGRAY)


        }

    }
}