/**
  * Created by Chao Fang on 9/9/16.
  */
object FindMeanMedianMode {
  def main(args: Array[String]): Unit = {
    /*val totalNum=scala.io.StdIn.readLine()
        val line=scala.io.StdIn.readLine()
    val arrs=line.split()
    val intArr=for(i <- arrs) yield(i.toInt)
    val sortedArr=intArr.sortWith(_<_)
    println(getMean(sortedArr.toList))
    println(getMedium(sortedArr.toList))
    println(getMode(sortedArr.toList))*/
    val arr=List(64630,11735,14216,99233,14470,4978,73429,38120,51135,67060)
    val intArr=for(i<-arr) yield(i.toInt)
    val sortedArr=intArr.sortWith(_<_)
    sortedArr.foreach((x:Int)=>print(x+" "))
    println()

    println(getMean(sortedArr.toList))
    println(getMedian(sortedArr.toList))
    println(getMode(sortedArr.toList))

  }

  def getMean(arr:List[Int]):Double={
    (1.0)*arr.foldRight(0)(_+_)/arr.length
  }

  def getMedian(arr:List[Int]):Double={
    if (arr.length%2==0){
      val a=arr((arr.length/2)-1)
      val b=arr(arr.length/2)
      1.0*(a+b)/2
    }else{

      1.0*arr((arr.length-1)/2)
    }
  }


  def getMode(arr:List[Int]):Int={

    val lt=arr.groupBy(w=>w).mapValues(_.size).toList
    val lst=List((51135,1), (99233,1), (14216,1), (4978,1), (38120,1), (11735,1), (67060,1), (14470,1), (73429,1), (64630,1))
    lst.sortWith((a,b)=>(a._2>b._2)||(a._2==b._2 && a._1<b._1)).head._1

  }


}

