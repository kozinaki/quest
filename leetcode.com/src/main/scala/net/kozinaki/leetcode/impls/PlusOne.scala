package main.scala.net.kozinaki.leetcode.impls

object PlusOne {

  def plusOne(digits: Array[Int]): Array[Int] = {
    if (digits.length == 0) {
      return Array[Int]();
    }
    val temp: Array[Int] = new Array[Int](digits.length)
    var remain: Int = checkOverFlow(digits(digits.length - 1) + 1, temp, temp.length - 1);
    for (i <- digits.length - 2 to 0 by -1) {
      remain = checkOverFlow(digits(i) + remain, temp, i);
    }
    var result: Array[Int] = null;
    if (remain == 1) {
      result = new Array[Int](temp.length + 1)
      for (i <- temp.length to 1 by -1) {
        result(i) = temp(i - 1)
      }
      result(0) = remain;
    } else {
      result = temp;
    }
    result;
  }

  def checkOverFlow(element: Int, array: Array[Int], index: Int): Int = {
    if (element > 9) {
      array(index) = element % 10
      1
    } else {
      array(index) = element
      0
    }
  }
}
