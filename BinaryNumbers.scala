/**
  * Created by cfang on 9/23/16.
  */
object BinaryNumbers {
  def main(args: Array[String]): Unit = {
    val sc = new java.util.Scanner (System.in)
    val n = sc.nextInt()
    val nBinary=Integer.toBinaryString(n)
    //println(nBinary)

    println(findMaxNumOfConsecutive(nBinary))
  }

  def findMaxNumOfConsecutive(input:String):Int={
    val arr=input.toArray.toList.map(_.toString.toInt)
    val arrSum=Array.fill(arr.length)(0)
    var currentMax=0
    for (i<-arrSum.indices){
      if (arr(i)==0){
        currentMax=0
      }else{
        currentMax=currentMax+1
      }
      arrSum(i)=currentMax

    }
    arrSum.max
  }
}
