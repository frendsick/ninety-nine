@main def p04 = {
  val length: Int = lengthRecursive(List(1, 1, 2, 3, 5, 8))
  println(length)
}

def lengthRecursive[T](list: List[T]): Int = list match {
  case Nil => 0
  case _ :: tail => 1 + lengthRecursive(tail)
}
