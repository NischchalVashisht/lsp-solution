package com.knoldus

/**
 *
 * @param length length of rectangle
 * @param breadth breadth of rectangle
 */
class RectangleSecondExample(length:Double,breadth:Double) extends RectangleListener {
  override val height:Double=length
  override val width:Double=breadth

}

