/**
  * Created by cfang on 9/30/16.
  */

import scala.collection.mutable.PriorityQueue
object HeapsFindTheRunningMedian {
  def main(args: Array[String]) {
    val sc = new java.util.Scanner (System.in)
    val n = sc.nextInt()


    object MinOrder extends Ordering[Int] {
      def compare(x:Int, y:Int) = y compare x
    }

    val upper=new PriorityQueue[Int]()(MinOrder)

    val lower=new PriorityQueue[Int]()
    for(i<- 0 until n) {
      val temp = sc.nextInt()
      add(temp,lower,upper)
      balance(lower,upper)
      println(getMedian(lower,upper))
    }
  }
  def add(num:Int,lower:PriorityQueue[Int],
          upper:PriorityQueue[Int]):Unit={
    if(lower.isEmpty||num<lower.head){
      lower.enqueue(num)
    }else{
      upper.enqueue(num)
    }
  }

  def balance(lower:PriorityQueue[Int],
              upper:PriorityQueue[Int]):Unit={
    if(lower.size-upper.size>=2){
      upper.enqueue(lower.dequeue())
    }else if(upper.size-lower.size>=2){
      lower.enqueue(upper.dequeue())
    }
  }
  def getMedian(lower:PriorityQueue[Int],
                upper:PriorityQueue[Int]):Double={
    if(lower.size==upper.size){
      1.0*(lower.head+upper.head)/2
    }else if (lower.size>upper.size){
      lower.head
    }else{
      upper.head
    }

  }
}
