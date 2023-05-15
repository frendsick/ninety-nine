import language.deprecated.symbolLiterals
import p09.pack
@main def p10 = {
  val example = List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)
  println(encode(example))
}

def encode(list: List[Any]): List[Tuple2[Int, Any]] = {
  pack(list).map { element => (element.length, element.head) }
}
