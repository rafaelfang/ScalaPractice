/**
  * Created by cfang on 9/20/16.
  */
object OddEvenIndex {
  def main(args: Array[String]): Unit = {
    val sc = new java.util.Scanner (System.in)
    val N = sc.nextInt()
    val wordList:List[String]=(1 to N).map(_=> sc.next()).toList
    wordList.foreach(
      s=>println(oddEvenIndex(s))
    )

  }

  def oddEvenIndex(word:String):String={
    val wordCharArray=word.toCharArray
    val frontPart=wordCharArray.toList.zipWithIndex.filter(_._2%2==0).map(_._1).mkString
    val rearPart=wordCharArray.toList.zipWithIndex.filter(_._2%2==1).map(_._1).mkString
    frontPart+" "+rearPart
  }
}
