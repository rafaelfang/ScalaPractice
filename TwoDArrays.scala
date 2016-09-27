/**
  * Created by cfang on 9/23/16.
  */
object TwoDArrays {
  def main(args: Array[String]) {
    val sc = new java.util.Scanner (System.in);
    var arr = Array.ofDim[Int](6,6);
    for(arr_i <- 0 to 6-1) {
      for(arr_j <- 0 to 6-1){
        arr(arr_i)(arr_j) = sc.nextInt();
      }
    }
    var result= Array.ofDim[Int](4,4)
    for(i <- 0 to 4-1) {
      for(j <- 0 to 4-1){
        result(i)(j) = getHourGlassValue(i,j,arr)
      }
    }
    var maxVal=(Int.MinValue)
    for(i <- 0 to 4-1) {
      for(j <- 0 to 4-1){
        if (result(i)(j) >maxVal){
          maxVal=result(i)(j)
        }
      }
    }
    println(maxVal)
  }

  def getHourGlassValue(x:Int,y:Int,arr:Array[Array[Int]]):Int={
    arr(x)(y)+arr(x)(y+1)+arr(x)(y+2)+arr(x+1)(y+1)+arr(x+2)(y)+arr(x+2)(y+1)+arr(x+2)(y+2)
  }
}
