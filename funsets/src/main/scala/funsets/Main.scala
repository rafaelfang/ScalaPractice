package funsets

object Main{
  import FunSets._

  def main(args: Array[String]): Unit = {
    val s1 = singletonSet(1)
    val s2 = singletonSet(2)
    val s3 = singletonSet(3)
    val s4 = singletonSet(4)
    val s5=union(union(union(s1,s2),s3),s4)
    println(contains(s1, 1))
    printSet(filter(s5,x=>x%2==0))
    printSet(map(s5,x=>x*2))
  }

}
