package com.example.custom_demo

import android.content.Context
import android.content.res.TypedArray
import android.graphics.Color
import android.util.AttributeSet
import kotlinx.android.synthetic.main.activity_customcolor.view.*

class CustomFontTextView : androidx.appcompat.widget.AppCompatTextView {

    var customColor: String? = null

    constructor(context: Context, attrs: AttributeSet?) : super(context, attrs) {
        style(context, attrs)
    }

    constructor(context: Context, attrs: AttributeSet?, defStyle: Int) : super(
        context,
        attrs,
        defStyle
    ) {
        style(context, attrs)
    }

    private fun style(context: Context, attrs: AttributeSet?) {

        val a: TypedArray = context.obtainStyledAttributes(
            attrs, R.styleable.CustomFontTextView
        )
        val cf = a.getInteger(R.styleable.CustomFontTextView_color, 0)
        var colorName = 0
        when (cf) {
            1 -> colorName = R.string.pink
            2 -> colorName = R.string.yellow
            3 -> colorName = R.string.black
            4 -> colorName = R.string.orange
            5 -> colorName = R.string.white

            else -> colorName = R.string.orange
        }
        customColor = resources.getString(colorName)
//        val tf = Typeface.createFromAsset(
//            context.getAssets(),
//            "color/$customColor"
//        )
//        setTypeface(tf)
         a.recycle()
    }
}
