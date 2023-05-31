import language.deprecated.symbolLiterals
object p20 {
  def main(args: Array[String]): Unit = println(
    removeAt(1, List('a, 'b, 'c, 'd))
  )

  def removeAt(k: Int, ls: List[Any]): Tuple2[List[Any], Option[Any]] = {
    if (k < 0 || k >= ls.length) then(ls, None)
    else (ls.take(k) ::: ls.drop(k + 1), Some(ls(k)))
  }
}
