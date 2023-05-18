import language.deprecated.symbolLiterals
@main def p18 = {
  println(slice(3, 7, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k)))
  println(slice(3, 7, List.empty))
}

// Builtin solution: ls.slice(3, 7)
def slice(from: Int, until: Int, ls: List[Any]): List[Any] = {
  if (ls.isEmpty || from >= until || from >= ls.length) then List ()
  else
    (from, until, ls) match {
      case _ if from <= 0 => ls.take(until)
      case _              => slice(from - 1, until - 1, ls.tail)
    }
}
