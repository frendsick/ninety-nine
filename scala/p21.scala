import language.deprecated.symbolLiterals
@main def p21 = println(insertAt('new, 7, List('a, 'b, 'c, 'd)))

def insertAt(element: Any, k: Int, ls: List[Any]): List[Any] = ls.splitAt(k) match {
  case (head, tail) => head ::: element :: tail
}
