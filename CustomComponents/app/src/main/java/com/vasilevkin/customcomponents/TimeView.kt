package com.vasilevkin.customcomponents

import android.content.Context
import android.graphics.Color
import android.icu.text.SimpleDateFormat
import android.icu.util.Calendar
import android.util.AttributeSet
import android.widget.TextView


/**
 * TODO: document your custom view class.
 */
class TimeView : TextView {
    private var titleText: String? = null
    private var color: Boolean = false

    constructor(context: Context) : super(context) {
        setTimeView()
    }

    constructor(context: Context, attrs: AttributeSet) : super(context, attrs) {
        // retrieved values correspond to the positions of the attributes
        val typedArray = context.obtainStyledAttributes(
            attrs,
            R.styleable.TimeView
        )
        val count = typedArray.indexCount
        try {

            for (i in 0 until count) {

                val attr = typedArray.getIndex(i)
                // the attr corresponds to the title attribute
                if (attr == R.styleable.TimeView_title) {

                    // set the text from the layout
                    titleText = typedArray.getString(attr)
                    setTimeView()
                } else if (attr == R.styleable.TimeView_setColor) {
                    // set the color of the attr "setColor"
                    color = typedArray.getBoolean(attr, false)
                    decorateText()
                }
            }
        } finally {
            // for reuse
            typedArray.recycle()
        }// the recycle() will be executed obligatorily
    }

    constructor(context: Context, attrs: AttributeSet, defStyle: Int) : super(
        context,
        attrs,
        defStyle
    ) {
        setTimeView()
    }

    private fun setTimeView() {
        // has the format hour.minuits am/pm
        val dateFormat = SimpleDateFormat("hh.mm aa")
        val time = dateFormat.format(Calendar.getInstance().getTime())

        if (this.titleText != null)
            text = this.titleText + " " + time
        else
            setText(time)
    }

    private fun decorateText() {
        // when we set setColor attribute to true in the XML layout
        if (this.color == true) {
            // set the characteristics and the color of the shadow
            setShadowLayer(4f, 2f, 2f, Color.rgb(250, 0, 250))
            setBackgroundColor(Color.CYAN)
        } else {
            setBackgroundColor(Color.RED)
        }
    }
}