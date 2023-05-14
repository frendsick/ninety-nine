@main def p03 = {
  val nth: Int = getNth(5, List(1, 1, 2, 3, 5, 8))
  println(nth)
}

// Recursively find the Nth value
def getNth[T](index: Int, list: List[T]): T = (index, list) match {
  case (0, head :: _)     => head
  case (index, _ :: tail) => getNth(index - 1, tail)
  case (n, _) if n < 0 =>
    throw new IndexOutOfBoundsException("negative index")
  case (n, l) if n >= l.length =>
    throw new IndexOutOfBoundsException(
      s"cannot get item at index ${index} from a list with ${list.length} items"
    )
  case (_, Nil) => throw new NoSuchElementException("list is empty")
  case _        => throw new UnknownError
}
