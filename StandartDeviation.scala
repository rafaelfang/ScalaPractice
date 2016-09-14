/**
  * Created by cfang on 9/14/16.
  */
object StandartDeviation {
  def main(args: Array[String]): Unit = {
    val N=5
    val arr=Array(10,40,30,50,20)
    val average=1.0*arr.foldRight(0)(_+_)/N
    val stdDev=Math.sqrt(arr.map(x=>(x-average)*(x-average)).foldRight(0.0)(_+_)/N)
    println(stdDev)
  }

}
