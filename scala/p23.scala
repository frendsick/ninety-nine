import language.deprecated.symbolLiterals
import p20.removeAt
@main def p23 = println(randomSelect(3, List('a, 'b, 'c, 'd, 'f, 'g, 'h)))

def randomSelect(count: Int, ls: List[Any]): List[Any] = {
  def randomSelectR(
      count: Int,
      ls: List[Any],
      random: util.Random
  ): List[Any] = {
    if (count <= 0 || ls.isEmpty) then Nil
    else if (count >= ls.length) then ls
    else {
      val randomIndex = random.nextInt(ls.length)
      val (rest, removed) = removeAt(randomIndex, ls)
      removed :: randomSelect(count - 1, rest)
    }
  }
  // Only instantiate Random once
  randomSelectR(count, ls, util.Random())
}
