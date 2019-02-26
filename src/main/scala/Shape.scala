abstract class Shape {
  def name: Unit
  def area: Double
}

trait Rectangle extends Shape {
  val x: Double
  val y: Double
  override def name = println("Rectangle")
  def area: Double = x * y
}

class Circle(r: Double) extends Shape {
  override def name = println("Circle")
  def area: Double = r * r * math.Pi
}

trait Square extends Rectangle {
  override def name = println("Square")
  override def area: Double = super.area
}

class Parallelogram(override val x: Double, override val y: Double) extends Rectangle {
  override def name = println("Parallelogram")
  override def area: Double = super.area
}

class Rhombus(override val x: Double, override val y: Double) extends Square {
  override def name = println("Rhombus")
  override def area: Double = super.area/2
}

object Shape {

  def main(args: Array[String]): Unit = {
    var shape: Shape = new Rhombus(2.0, 4.0)
    println(shape.area)
    shape = new Parallelogram(5.0, 10.0)
    println(shape.area)
    shape = new Circle(2.0)
    println(shape.area)
    shape = new Square {val x = 2.0; val y = 4.0}
    println(shape.area)
    shape = new Rectangle {val x = 3.0; val y = 4.0}
    println(shape.area)
  }
}