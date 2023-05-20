@main def p22 = println(range(4, 9))

// Builtin: List.range(start, end + 1)
def range(start: Int, end: Int): List[Int] =
  if (start > end) Nil
  else start :: range(start + 1, end)
