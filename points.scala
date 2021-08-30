object points {
  def main(args: Array[String]): Unit = {
    val p1 = Point(1,2)
    val p2 = Point(2,4)
    val p3 = p1+p2
    val p4 = p1.move(3,5)
    val p5 = p2.distance(p1)
    val p6=p2.invert()

    println("The addition of 2 points p1,p2 is: " + p3)
    println("The point after moved by given x and y value is: "+ p4)
    println("The distance between 2 points p1 and p2 is: "+p5)
    print("the inverted point of p2 is: "+p6)
  }


}

case class Point(a: Int, b: Int) {
  def x: Int = a
  def y: Int = b

  def +(p:Point) = Point(this.x+p.x,this.y+p.y)
  def move(dx:Int,dy:Int)=Point(this.x+dx,this.y+dy)
  def distance(p:Point)=(this.x-p.x,this.y-p.y)
  def invert()=Point(this.y,this.x)



}
