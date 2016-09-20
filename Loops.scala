/**
  * Created by cfang on 9/20/16.
  */
object Loops {
  def main(args: Array[String]) {
    val sc = new java.util.Scanner (System.in)
    var N = sc.nextInt()
    for (i<-1 to 10){
      println(N+" x "+i+" = "+N*i)
    }
  }
}
