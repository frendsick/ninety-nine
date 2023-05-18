import language.deprecated.symbolLiterals
@main def p16 = {
  println(drop(3, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k)))
  println(drop(3, List.empty))
}

def drop(n: Int, ls: List[Any]): List[Any] = {
  ls.zipWithIndex
    .filter { (_, index) => (index + 1) % n != 0 }
    .map(_._1)
}
