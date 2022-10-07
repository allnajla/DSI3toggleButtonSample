package com.example.radiobutton

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.CompoundButton
import android.widget.ImageView
import android.widget.TextView
import android.widget.ToggleButton

class MainActivity : AppCompatActivity() {
    lateinit var text :TextView;
    lateinit var img:ImageView;
    lateinit var toggleBt:ToggleButton
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        text=findViewById(R.id.text)
        img =findViewById(R.id.img)
        toggleBt=findViewById(R.id.toggleButton)
        toggleBt.isChecked = true

        toggleBt.setOnCheckedChangeListener { buttonView, isChecked ->
            if(isChecked){
                img.visibility = View.VISIBLE
                text.setText("The image is visible")
            }

                else{
                img.visibility = View.INVISIBLE
                text.setText("The image is invisible")

                }
        }

    }
}

