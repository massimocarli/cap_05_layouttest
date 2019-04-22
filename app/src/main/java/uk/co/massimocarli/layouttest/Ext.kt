package uk.co.massimocarli.layouttest

import android.view.View

fun Int.forEach(inclusive: Boolean = false, block: (Int) -> Unit) {
  if (inclusive) {
    (0..this).forEach { block(it) }
  } else {
    (0 until this).forEach { block(it) }
  }
}


fun View.visible() {
  this.visibility = View.VISIBLE
}

fun View.gone() {
  this.visibility = View.GONE
}
