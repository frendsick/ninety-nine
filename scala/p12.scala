/* Modify the result of problem P10 in such a way that if an element has no duplicates it is simply copied into the result list.
 * Only elements with duplicates are transferred as (N, E) terms.
 */

import language.deprecated.symbolLiterals
@main def p12 =
  println(decode(List((4, 'a), (1, 'b), (2, 'c), (2, 'a), (1, 'd), (4, 'e))))
  println(decode(List()))

def decode(encoded: List[Tuple2[Int, Any]]): List[Any] = {
  encoded.flatMap { (count, element) => List.fill(count)(element) }
}
