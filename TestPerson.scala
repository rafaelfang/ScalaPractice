/**
  * Created by cfang on 9/15/16.
  */
object TestPerson {
  def main(args: Array[String]) {
    var T=scala.io.StdIn.readInt()
    var i=0
    for(i<-1 to T){
      var age=scala.io.StdIn.readInt()
      var p=new Person(age)
      p.amIOld()
      var j=0
      for(j<-1 to 3){
        p.yearPasses()
      }
      p.amIOld()
      System.out.println()

    }


  }
}
