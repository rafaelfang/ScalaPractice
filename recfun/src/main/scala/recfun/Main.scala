package recfun

object Main {
  def main(args: Array[String]) {
    println("Pascal's Triangle")
    for (row <- 0 to 10) {
      for (col <- 0 to row)
        print(pascal(col, row) + " ")
      println()
    }
  }

  def pascal(c:Int,r:Int):Int={
    if(c==0 ){
      return 1
    }else if(r==c){
      return 1
    }else{
      return pascal(c-1,r-1)+pascal(c,r-1)
    }
  }

  def balance(chars:List[Char]):Boolean={
    val charStack=new scala.collection.mutable.Stack[Char]
    for (c<-chars){
      if (c=='('){
        charStack.push(c)
      }else if(c==')'){
        if (charStack.isEmpty) {
          return false
        }
        charStack.pop()

      }
    }
    if (charStack.isEmpty){
      return true
    }else{
      return false
    }

  }

  def countChange(money:Int,coins:List[Int]):Int={
    if (money==0){
      return 1
    }else if(money<0){
      return 0
    }else if(money>0 && coins.isEmpty){
      return 0
    }else{
      return countChange(money,coins.tail)+countChange(money-coins.head,coins)
    }

  }

}
