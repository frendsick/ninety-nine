import language.deprecated.symbolLiterals
@main def p17 = {
  println(split(3, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k)))
  println(split(3, List.empty))
}

// Buildin solution: ls.splitAt(n)
def split(n: Int, ls: List[Any]): Tuple2[List[Any], List[Any]] = (n, ls) match {
  case (_, Nil) => (Nil, Nil)
  case (0, ls)  => (Nil, ls)
  case (n, head :: tail) => {
    val (left, right) = split(n - 1, tail)
    (head :: left, right)
  }
}
