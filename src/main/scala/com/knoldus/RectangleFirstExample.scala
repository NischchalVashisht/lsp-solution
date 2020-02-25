package com.knoldus

/**
 *
 * @param length length is the length of Rectangle
 * @param breadth breadth is the breath of rectangle
 */
class RectangleFirstExample(length:Double,breadth:Double) extends FourSideFigure {
  override val height:Double = length
  override val width :Double = breadth

}

