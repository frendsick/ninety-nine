import language.deprecated.symbolLiterals
@main def p09 = {
  val example = List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)
  println(pack(example))
}

def pack(list: List[Any]): List[List[Any]] = {
  if (list.isEmpty) List(List.empty)
  val (packed, rest) = list.span { _ == list.head }
  if (rest == Nil) return List(packed)
  packed :: pack(rest)
}
