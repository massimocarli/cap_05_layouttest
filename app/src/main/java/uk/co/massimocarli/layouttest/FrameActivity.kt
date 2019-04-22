package uk.co.massimocarli.layouttest

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity


class FrameActivity : AppCompatActivity() {

  companion object {
    private val TAG_LOG = "FrameActivity"
  }

  /*
   * The Blue View
   */
  private lateinit var mBlueView: View

  /*
   * The Green View
   */
  private lateinit var mGreenView: View


  public override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.frame_layout)
    mBlueView = findViewById(R.id.blueFrame)
    mGreenView = findViewById(R.id.greenFrame)
  }

  /**
   * Called when the button is selected
   */
  fun changeColor(buttonSelected: View) {
    when (buttonSelected.getId()) {
      R.id.toGreenButton -> {
        mGreenView.visible()
        mBlueView.gone()
      }
      R.id.toBlueButton -> {
        mGreenView.gone()
        mBlueView.visible()
      }
      else -> {
      }
    }
  }
}