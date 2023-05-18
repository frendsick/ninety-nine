@main def p14 = {
  println(duplicate(List.empty))
  println(duplicate(List(1, 2, 3, 3, 4)))
}

def duplicate(ls: List[Any]): List[Any] = ls.flatMap { e =>
  List(e, e)
}
