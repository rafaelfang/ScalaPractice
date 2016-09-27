/**
  * Created by cfang on 9/27/16.
  */
import scala.collection.mutable.Queue
object LeftRotation {
  def main(args: Array[String]) {
    val sc = new java.util.Scanner (System.in)
    var n = sc.nextInt()
    var k = sc.nextInt()
    var a = Queue[Int]()
    for(a_i <- 0 to n-1) {
      a.enqueue(sc.nextInt())
    }

    for(i<-1 to k){
      a.enqueue(a.dequeue())
    }
    a.foreach(x=>print(x+" "))
  }
}
