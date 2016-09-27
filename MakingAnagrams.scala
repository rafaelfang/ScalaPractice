/**
  * Created by cfang on 9/27/16.
  */
object MakingAnagrams {

    def main(args: Array[String]) {
      val sc = new java.util.Scanner (System.in)
      var a = sc.next()
      var b = sc.next()
      val commonPart=a.intersect(b)
      println(a.length+b.length-2*commonPart.length)
    }

}
