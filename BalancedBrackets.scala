/**
  * Created by cfang on 9/29/16.
  */
object BalancedBrackets {
  def main(args: Array[String]) {
    val sc = new java.util.Scanner (System.in)
    val t = sc.nextInt()
    var a0 = 0;
    while(a0 < t){
      val expression = sc.next()
      if(isBalanced(expression)){
        println("YES")
      }else{
        println("NO")
      }
      a0+=1
    }
  }
  def isBalanced(expression:String):Boolean= {
    val s = new scala.collection.mutable.Stack[Char]
    val openBrackets = List('{', '[', '(')
    val closeBrackets = List('}', ']', ')')
    expression.toArray.foreach(x=>{
      if(openBrackets.contains(x)){
        s.push(x)
      }else if(s.isEmpty&&closeBrackets.contains(x)){
        return false
      }else if(s.nonEmpty&&closeBrackets.contains(x))
        if(closeBrackets.indexOf(x)!=openBrackets.indexOf(s.pop())){
          return false
        }
    })
    if(s.nonEmpty){
      false
    }else{
      true
    }

  }
}
