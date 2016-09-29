/**
  * Created by cfang on 9/29/16.
  */

object QueuesATaleOfTwoStacks {
  def main(args: Array[String]): Unit = {
    val queue = new MyQueue[Int]()

    val scan = new java.util.Scanner (System.in)
    val n = scan.nextInt()

    for (i<-1 to n) {
      val operation = scan.nextInt()
      if (operation == 1) { // enqueue
        queue.enqueue(scan.nextInt())
      } else if (operation == 2) { // dequeue
        queue.dequeue()
      } else if (operation == 3) { // print/peek
        println(queue.peek())
      }
    }
    scan.close()
  }

}

class MyQueue[Int]{
  val in =new scala.collection.mutable.Stack[Int]
  val out = new scala.collection.mutable.Stack[Int]
  def enqueue(num:Int)={
    in.push(num)
  }
  def dequeue()={
    if(out.isEmpty){
      while(in.nonEmpty){
        out.push(in.pop())
      }
    }
    out.pop()
  }
  def peek():Int={
    if(out.isEmpty){
      while(in.nonEmpty){
        out.push(in.pop())
      }
    }
    out.top
  }
}