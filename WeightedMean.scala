/**
  * Created by cfang on 9/12/16.
  */
object WeightedMean {
  def main(args: Array[String]): Unit = {
    val xs=List(10,40 ,30, 50, 20, 10, 40, 30, 50, 20)
    val ws=List(1, 2 ,3 ,4, 5, 6 ,7 ,8 ,9 ,10)

    val result=1.0*(for(x<-xs.zip(ws)) yield x._1*x._2).foldRight(0)(_+_)/ws.foldRight(0)(_+_)
    println(f"$result%1.1f")
  }
}
