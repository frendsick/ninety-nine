@main def p06 = {
  println(isPalindrome(List(1, 2, 3, 4, 5)))
  println(isPalindrome(List(1, 2, 3, 2, 1)))
  println(isPalindrome(List(1, 2, 3, 3, 2, 1)))
}

def isPalindrome[T](list: List[T]): Boolean = list == list.reverse
