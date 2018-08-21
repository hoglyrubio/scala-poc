/*
1. Same name as the class
2. Start with 'object' keyword
3. Live in the same source file as class
4. Access private methods
*/

object MathCompanion {
  def sum(a: Int, b: Int): Int = a + b
  def getPrivateMember: Int = new MathCompanion().max
}

class MathCompanion {
  private val max = 100
}

MathCompanion.getPrivateMember