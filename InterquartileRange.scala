/**
  * Created by cfang on 9/14/16.
  */
object InterquartileRange {
  def main(args: Array[String]): Unit = {
    val size = 9
    val arr:List[Int]=List(3,7,8,5,12,14,21,13,18)
    val sortedArr=arr.sortWith((a,b)=>a<b)
    //println(sortedArr)

    if(size%2==0) {
      val left = sortedArr.take(size / 2)
      //println(left)
      println(getMedian(left))
      println(getMedian(sortedArr))
      val right = sortedArr.takeRight(size / 2)
      //println(right)
      println(getMedian(right))
    }
    else{
      val left = sortedArr.take((size-1) / 2)
      //println(left)
      println(getMedian(left))
      println(getMedian(sortedArr))
      val right = sortedArr.takeRight((size-1) / 2)
      //println(right)
      println(getMedian(right))
    }

  }

  def getMedian(arr:List[Int]):Int={
    if(arr.size%2==0)
      (arr(arr.size/2-1)+arr(arr.size/2))/2
    else
      arr((arr.size-1)/2)
  }

}
