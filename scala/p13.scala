import language.deprecated.symbolLiterals
@main def p13 = {
  println(encode(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)))
  println(encode(List.empty))
}

def encode(list: List[Any]): List[Tuple2[Int, Any]] = {
  if (list.isEmpty) return List.empty
  val (packed, rest) = list.span { _ == list.head }
  val encoded: Tuple2[Int, Any] = (packed.length, packed.head)
  if (rest == Nil) return List(encoded)
  encoded :: encode(rest)
}
