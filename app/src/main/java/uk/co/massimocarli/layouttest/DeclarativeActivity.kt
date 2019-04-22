package uk.co.massimocarli.layouttest

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity


class DeclarativeActivity : AppCompatActivity() {

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.buttons_layout)
  }
}