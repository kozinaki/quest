package main.scala.net.kozinaki.leetcode.impls

object RomanConverter {

  var romans: Map[String, Int] = Map("I" -> 1, "V" -> 5, "X" -> 10, "L" -> 50, "C" -> 100, "D" -> 500, "M" -> 1000);

  def romanToInt(s: String): Int = {
    var next: Int = 0; var last: Int = 0; var sum: Int = 0;
    for (i <- s.toCharArray) {
      next = romans(i.toString);
      if (next > last) {
        last = next - last;
      } else {
        sum += last;
        last = next;
      }
    }
    sum + last;
  }
}