package com.example.drawableimages_asbackground_onitem_statechange_drawable_selector

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        switch1.setOnCheckedChangeListener { _, isChecked ->
            if(!isChecked){
                button.isEnabled = false
                Toast.makeText(this,"button Enabled = false",Toast.LENGTH_LONG).show()
            }else{
                button.isEnabled = true
            }
        }
        button.setOnClickListener {
            Toast.makeText(this,"state_pressed",Toast.LENGTH_LONG).show()
        }

    }
}
