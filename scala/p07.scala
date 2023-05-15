@main def p07 = {
  val example = List(List(1, 1), 2, List(3, List(5, 8)))
  println(flattenRecursive(example))
}

def flattenRecursive(list: List[Any]): List[Any] = list flatMap {
  case nested: List[_] => flattenRecursive(nested)
  case flat => List(flat)
}
