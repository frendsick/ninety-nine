@main def p15 = {
  println(duplicateN(4, List.empty))
  println(duplicateN(3, List(1, 2, 3, 3, 4)))
}

def duplicateN(n: Int, ls: List[Any]): List[Any] = ls.flatMap { element =>
  List.fill(n)(element)
}
