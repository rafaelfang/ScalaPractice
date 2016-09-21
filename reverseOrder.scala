/**
  * Created by cfang on 9/21/16.
  */
object reverseOrder {
  def main(args: Array[String]) {
    val sc = new java.util.Scanner (System.in);
    var n = sc.nextInt();
    var arr = new Array[Int](n);
    for(arr_i <- 0 to n-1) {
      arr(arr_i) = sc.nextInt();
    }
    arr.toList.reverse.foreach(x=>print(x+" "))
  }

}
