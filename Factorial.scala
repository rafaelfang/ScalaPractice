/**
  * Created by cfang on 9/23/16.
  */
object Factorial {
  def main(args: Array[String]): Unit = {
    val num=scala.io.StdIn.readLine().toInt
    println(factorial((num)))
  }

  def factorial(i:Int):Int={
    if (i==0 || i==1){
      1
    }else{
      i*factorial(i-1)
    }
  }
}
