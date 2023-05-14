@main def p01 = {
  val last = lastRecursive(List(1, 1, 2, 3, 5, 8))
  println(last)
}

def lastRecursive[T](list: List[T]): T = list match {
  case last :: Nil     => last
  case element :: tail => lastRecursive(tail)
  case _               => throw new NoSuchElementException("last of empty list")
}
