package com.knoldus

class SquareFirstExample(val side:Double) extends FourSideFigure {
 override val height:Double=side
  override val width :Double=side
}

object SquareFirstExample extends  App{
  val abc:FourSideFigure=new SquareFirstExample(10)
  val abb:FourSideFigure=new RectangleFirstExample(10,3)
  println(abc.getArea)
  println(abb.getArea)
}