package com.knoldus
/**
 * creating Lister trait which extend  common trait and add functionality
 */
trait RectangleListener extends Parallelogram {
  val width:Double
  override def getArea: Double = height*width
}
