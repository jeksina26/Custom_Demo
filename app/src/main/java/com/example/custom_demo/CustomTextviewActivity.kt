package com.example.custom_demo

import android.content.Intent
import android.graphics.Color
import android.graphics.Typeface
import android.os.Bundle
import android.text.Spannable
import android.text.SpannableString
import android.text.Spanned
import android.text.style.*
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_customtextview.*

class CustomTextviewActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_customtextview)


        var title = "Android is an open source and Linux-based operating system for mobile devices such as smartphones and tablet computers. " +
                "Android was developed by the Open Handset Alliance, led by Google, and other companies. " +
                "This tutorial will teach you basic Android programming " +
                "and will also take you through some advance concepts related to Android application development." +
                " This tutorial has been prepared for the beginners to help them understand basic Android programming. After completing this tutorial you will find yourself " +
                "at a moderate level of expertise in Android programming from where you can take yourself to next levels."

        var str = SpannableString(title)

        var textcolor1 = ForegroundColorSpan(Color.GREEN)
        var textcolor2 = ForegroundColorSpan(Color.RED)
        var textcolor3 = ForegroundColorSpan(Color.LTGRAY)

        var textstrike = StrikethroughSpan()
        var textbold = StyleSpan(Typeface.BOLD)
        var textitalic = StyleSpan(Typeface.ITALIC)
        var textunderline = UnderlineSpan()
        val backgroundcolor = BackgroundColorSpan(Color.RED)
        val backgroundcolor1 = BackgroundColorSpan(Color.BLUE)

        str.setSpan(textcolor1,30,63,Spanned.SPAN_EXCLUSIVE_EXCLUSIVE)
        str.setSpan(textcolor2,63,119,Spanned.SPAN_EXCLUSIVE_EXCLUSIVE)
        str.setSpan(textcolor3,244,264,Spanned.SPAN_EXCLUSIVE_EXCLUSIVE)
        str.setSpan(textstrike,269,301,Spanned.SPAN_EXCLUSIVE_EXCLUSIVE)
        str.setSpan(textbold,301,329,Spanned.SPAN_EXCLUSIVE_EXCLUSIVE)
        str.setSpan(textitalic,329,361,Spanned.SPAN_EXCLUSIVE_EXCLUSIVE)
        str.setSpan(textunderline,463,531,Spanned.SPAN_EXCLUSIVE_EXCLUSIVE)
        str.setSpan(backgroundcolor,149,207,Spanned.SPAN_EXCLUSIVE_EXCLUSIVE)
        str.setSpan(backgroundcolor1,398,462,Spanned.SPAN_EXCLUSIVE_EXCLUSIVE)

        tvtext.text = str
    }
}