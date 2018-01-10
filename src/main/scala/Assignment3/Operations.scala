package Assignment3

class Operations {
  def sumOfLists(list1: List[Int],list2: List[Int]): List[Int] = {

  val sum = for (i <- 0 until list1.length)
    yield list1(i) + list2(i)

  val newList = sum.toList

  newList
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
  /*def fibonacci(first:Int,second:Int,n:Int):List[Int] = {
    n match {
      case 0 => 1
      case 1 => 2
      case _ => fibonacci(second,first + second,n-1)
    }
  }*/

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

  def limitFib(n: Int) = {
     def acc(list: List[Int], i: Int): List[Int] = {
       if (i >= n || n < 2) list
       else {
         val newList = list ::: List(list(i-1)+list(i-2))
         acc(newList, i+1)
       }
     }
     acc(List(0, 1), 2)
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
  val num =5
  val obj=new Operations
  val newList = print("sumOfList:" + obj.sumOfLists(List(one,two,three),List(first,second,third)) + "\n")
  val listDouble = print("DoubleElemets:" + obj.doubleElements(List(one,two,three)) + "\n")
  //val shape = rectangle
 val fibonacci = print("fibonacci" + obj.limitFib(num) + "\n")
 val positionElement = print("ElementPosition:" + obj.elemPosition(2,(List(one,two,three))) + "\n")
  // val areaResult = print((obj.area(shape,first,second,(5,4)) + "\n")
  val listLength = print("ListLength:" + obj.listLength(List(one,two,three)) + "\n")
  val reverse = print("ListReverse:" + obj.reverseList(List(one,two,three)) + "\n")


}
