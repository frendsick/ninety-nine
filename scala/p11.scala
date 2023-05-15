/* Modify the result of problem P10 in such a way that if an element has no duplicates it is simply copied into the result list.
 * Only elements with duplicates are transferred as (N, E) terms.
 */

import language.deprecated.symbolLiterals
import p09.pack
@main def p11 = {
  val example = List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)
  println(encode(example))
}

def encode(list: List[Any]): List[Tuple2[Int, Any]] | Any = {
  pack(list).map {
    _ match {
      case single :: Nil => single
      case multiple      => (multiple.length, multiple.head)
    }
  }
}
