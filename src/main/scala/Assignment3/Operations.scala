package Assignment3

class Operations {
  def sumOfLists(list1: List[Int],list2: List[Int]): List[Int] = {
if(list1.length == list2.length) {
  val sum = for (i <- 0 until list1.length)
    yield list1(i) + list2(i)

  val newList = sum.toList

  newList
}


  }
  def doubleElements(list: List[Int]): List[Int] = {

    list.map(x => x + x)
  }
  /*
  def area(shape: String, first: Int, second: Int, f:(Int,Int) => Int): String = {

    /*val shapeName= if(!shape.isEmpty) shape
    else {
      println("please provide the shape name")
    }*/


    shape match {
      case "rectangle" => println(s"Area of $shape is ${f(first*second)}")
      case "square" => println("not defined yet for square")
      case _  => println("wrong")
    }

  }
  */

  def listLength(list1:List[Int]): Int = {
    list1 match {
      case Nil => 0
      case head::Nil => 1
      case head::tail => 1 + listLength(tail)
    }
  }

  def elemPosition(num:Int,list1:List[Int]): Int = {
    list1(num)
  }

  def reverseList(list1:List[Int]): List[Int] = {


    val result = for (i <- list1.last to list1.head by -1) yield (i)
    val resultReverse = result.toList
    resultReverse

  }



}


object UsingOperations extends App {
  //def main(args: Array[String]): Unit = {
  val one = 1
  val two = 2
  val three = 3
  val first = 5
  val second = 4
  val third = 7
  val obj=new Operations
  val newList = println("sumOfList"+ obj.sumOfLists(List(one,two,three),List(first,second,third)))
  val listDouble = println("DoubleElemets" + obj.doubleElements(List(one,two,three)))
  //val shape = rectangle

 val positionElement = println("ElementPosition"+ obj.elemPosition(2,(List(one,two,three))))
  // val areaResult = println((obj.area(shape,first,second,(5,4)))
  val listLength = println("ListLength"+ obj.listLength(List(one,two,three)))
  val reverse = println("ListReverse"+ obj.reverseList(List(one,two,three)))


}
