/**
  * Created by cfang on 9/14/16.
  */
object ConditionalStatements {
  def main(args: Array[String]): Unit = {
    val n=9
    if(n%2!=0){
      println("Weird")
    }else if(n%2==0 && n>=2 && n<=5){
      println("Not Weird")
    }else if(n%2==0 && n>=6 && n<=20){
      println("Weird")
    }else if(n%2==0 && n>20){
      println("Not Weird")
    }
  }
}
