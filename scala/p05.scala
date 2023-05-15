@main def p05 = {
  val reversed: List[Int] = reverse(List(1, 1, 2, 3, 5, 8))
  println(reversed)
}

def reverse[T](list: List[T]): List[T] = list.foldLeft(List.empty[T]) {
  (acc, element) => { element :: acc }
}
