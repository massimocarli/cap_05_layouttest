package uk.co.massimocarli.layouttest.layout


import android.content.Context
import android.util.AttributeSet
import android.view.View
import android.view.ViewGroup
import uk.co.massimocarli.layouttest.forEach

/**
 * Example of a simple Custom Layout implementation
 */
class CustomLayout : ViewGroup {

  /*
   * The Width of each View in this Layout
   */
  private var mViewWidth: Int = 0

  constructor(context: Context, attrs: AttributeSet, defStyle: Int) : super(context, attrs, defStyle) {}

  constructor(context: Context, attrs: AttributeSet) : super(context, attrs) {}

  constructor(context: Context) : super(context) {}


  override fun onMeasure(widthMeasureSpec: Int, heightMeasureSpec: Int) {
    if (childCount == 0) {
      super.onMeasure(widthMeasureSpec, heightMeasureSpec)
    } else {
      // We share the space with the contained View
      val widthSize = View.MeasureSpec.getSize(widthMeasureSpec)
      // We use only the information about the width
      mViewWidth = widthSize / childCount
      // We calculate the dimension of the layout component base on the contained components
      val measuredWidth = View.MeasureSpec.makeMeasureSpec(
        widthSize,
        View.MeasureSpec.EXACTLY
      )
      // We set the dimension for this layout
      setMeasuredDimension(measuredWidth, heightMeasureSpec)
    }
  }

  /* (non-Javadoc)
   * @see android.view.ViewGroup#onLayout(boolean, int, int, int, int)
   */
  override fun onLayout(changed: Boolean, left: Int, top: Int, right: Int, bottom: Int) {
    // If layout is changed we recalculate it
    if (changed) {
      childCount.forEach { childIndex ->
        val viewLeft = childIndex * mViewWidth
        getChildAt(childIndex).run {
          layout(viewLeft, top, viewLeft + mViewWidth, bottom)
        }
      }
    }
  }
}
