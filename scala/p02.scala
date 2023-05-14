@main def p02 = {
  val penultimate: Int = penultimateRecursive(List(1, 1, 2, 3, 5, 8))
  println(penultimate)
}

def penultimateRecursive[T](list: List[T]): T = list match {
  case penultimate :: _ :: Nil => penultimate
  case _ :: tail               => penultimateRecursive(tail)
  case _ =>
    throw new NoSuchElementException(
      s"penultimate element in list with ${list.length} items"
    )
}
