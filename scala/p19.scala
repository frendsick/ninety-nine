import language.deprecated.symbolLiterals
@main def p19 = {
  println(rotate(3, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k)))
  println(rotate(-2, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k)))
}

def rotate(n: Int, ls: List[Any]): List[Any] = {
    val places: Int = (n % ls.length + ls.length)
    ls.drop(places) ::: ls.take(places)
}
