package uk.co.massimocarli.layouttest

import android.os.Bundle
import android.widget.Button
import android.widget.LinearLayout
import androidx.appcompat.app.AppCompatActivity


class ImperativeActivity : AppCompatActivity() {

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    // We define a LinearLayout
    val parentLayout = LinearLayout(this).apply {
      layoutParams = LinearLayout.LayoutParams(
        LinearLayout.LayoutParams.MATCH_PARENT,
        LinearLayout.LayoutParams.WRAP_CONTENT
      )
      orientation = LinearLayout.VERTICAL
    }
    // We define 3 Button
    3.forEach { index ->
      Button(this@ImperativeActivity).apply {
        layoutParams = LinearLayout.LayoutParams(
          LinearLayout.LayoutParams.MATCH_PARENT,
          LinearLayout.LayoutParams.WRAP_CONTENT
        )
        text = "Button #$index"
        parentLayout.addView(this)
      }
    }
    // We set the content view
    setContentView(parentLayout)
  }
}