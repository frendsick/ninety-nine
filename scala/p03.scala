@main def p03 = {
  val nth: Int = getNth(5, List(1, 1, 2, 3, 5, 8))
  println(nth)
}

def getNth[T](index: Int, list: List[T]): T = {
  // Guard clauses
  if (list.isEmpty) throw new NoSuchElementException("list is empty")
  if (index < 0) throw new IndexOutOfBoundsException("negative index")
  if (index >= list.length)
    throw new IndexOutOfBoundsException(
      s"cannot get item at index ${index} from a list with ${list.length} items"
    )

  // Recursively find the Nth value
  list match {
    case head :: _ if index == 0 => head
    case _                       => getNth(index - 1, list.tail)
  }
}
