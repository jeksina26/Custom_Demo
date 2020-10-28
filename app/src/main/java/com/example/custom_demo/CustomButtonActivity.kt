package com.example.custom_demo

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_custombutton.*

class CustomButtonActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_custombutton)

        btnnext.setOnClickListener {
            var intent = Intent(this,CustomTextviewActivity::class.java)
            startActivity(intent)
        }
    }
}