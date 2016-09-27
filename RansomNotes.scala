/**
  * Created by cfang on 9/27/16.
  */
import scala.util.control.Breaks._
object RansomNotes {
  def main(args: Array[String]): Unit = {
    val sc = new java.util.Scanner (System.in);
    var m = sc.nextInt();
    var n = sc.nextInt();
    val magazine = scala.collection.mutable.HashMap.empty[String,Int]
    var flag = true
    breakable {
      for (magazine_i <- 0 to m - 1) {
        val word = sc.next()
        if (magazine.contains(word)) {
          magazine(word) = magazine(word) + 1
        } else {
          magazine += (word -> 1)
        }

      }

      for (ransom_i <- 0 to n - 1) {
        val word = sc.next()
        if (!magazine.contains(word)) {
          flag = false
          break
        } else if (magazine.contains(word) && magazine(word) > 0) {
          magazine(word) = magazine(word) - 1
        } else if (magazine.contains(word) && magazine(word) == 0) {
          flag = false
          break
        }
      }
    }
    if(flag==true){
      println("Yes")
    }else{
      println("No")
    }
  }
}
