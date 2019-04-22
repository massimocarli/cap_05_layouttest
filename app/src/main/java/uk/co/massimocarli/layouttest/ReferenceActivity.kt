package uk.co.massimocarli.layouttest

import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import android.view.View.MeasureSpec



class ReferenceActivity : AppCompatActivity() {

  companion object {
    const val TAG_LOG = "ReferenceActivity"
  }

  /**
   * We create a simple OnClickListener which prints a
   */
  val clickListener = { view: View ->
    if (view is TextView) {
      Log.d(TAG_LOG, " -> ${view.text}")
    }
  }


  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.buttons_layout)
    /*
    val button0 = findViewById<Button>(R.id.button0)
    val button1 = findViewById<Button>(R.id.button1)
    val button2 = findViewById<Button>(R.id.button2)
    button0.setOnClickListener(clickListener)
    button1.setOnClickListener(clickListener)
    button2.setOnClickListener(clickListener)
    */
    /*
    arrayOf(R.id.button0, R.id.button1, R.id.button2).forEach {
      val button: Button = findViewById(it)
      button.setOnClickListener(clickListener)
    }
    */
    arrayOf(R.id.button0, R.id.button1, R.id.button2).forEach {
      findViewById<View>(it).setOnClickListener(clickListener)
    }
  }




}
