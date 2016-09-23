/**
  * Created by cfang on 9/23/16.
  */

import java.util.HashMap
object TestDictionariesAndMaps {
  def main(args: Array[String]): Unit = {

    val totalNum=scala.io.StdIn.readLine().toInt
    var A = new HashMap[String,String]()
    for (i<-1 to totalNum){
      val line=scala.io.StdIn.readLine()
      val arr=line.split(" ")
      A.put(arr(0),arr(1))
    }
    var flag=true
    while (flag){
      val tempName=scala.io.StdIn.readLine()
      if (tempName==null){
        flag=false
      }
      else{
        if(A.containsKey(tempName)){
          println(tempName+"="+A.get(tempName))
        }else{
          println("Not found")
        }
      }

    }

  }
}
