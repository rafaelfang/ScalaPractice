/**
  * Created by cfang on 9/13/16.
  */
object Operators {
  def main(args: Array[String]): Unit = {
    val mealCost=12
    val tipPercent=20
    val taxPercent=8
    val totalCost=mealCost*(1+(1.0*tipPercent/100)+(1.0*taxPercent/100))
    println(Math.round(totalCost))
  }
}
