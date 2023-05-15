import language.deprecated.symbolLiterals
@main def p08 = {
  val example = List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)
  println(compress(example))
}

def compress(list: List[Any]): List[Any] = list match {
  case Nil => Nil
  case head :: tail => head :: compress(tail.dropWhile(_ == head))
}
