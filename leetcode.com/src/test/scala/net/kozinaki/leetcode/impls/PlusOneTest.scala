package test.scala.net.kozinaki.leetcode.impls

import main.scala.net.kozinaki.leetcode.impls.PlusOne
import org.scalatest.funsuite.AnyFunSuite

class PlusOneTest extends AnyFunSuite {

  test("Number in array view must be equals just number") {
    var plusOne: Array[Int] = PlusOne.plusOne(Array[Int](1,2,3,4));
    printArray(plusOne);
    assert(toJustNumber(plusOne) == 1235)
    plusOne = PlusOne.plusOne(Array[Int](1,2,3,9));
    printArray(plusOne);
    assert(toJustNumber(plusOne) == 1240)
    plusOne = PlusOne.plusOne(Array[Int](9,2,9,9));
    printArray(plusOne);
    assert(toJustNumber(plusOne) == 9300)
    plusOne = PlusOne.plusOne(Array[Int](9,9,9,9));
    printArray(plusOne);
    assert(toJustNumber(plusOne) == 10000)
    plusOne = PlusOne.plusOne(Array[Int](9,2,0,9));
    printArray(plusOne);
    assert(toJustNumber(plusOne) == 9210)
  }

  def printArray(array: Array[Int]): Unit = {
    print("[ ")
    for (element <- array) {
      print(element + " ")
    }
    print("]")
    println()
  }

  def toJustNumber(number: Array[Int]): Int = {
    var t: Int = 1
    var sum: Int = 0
    for (i <- number.length-1 to 0 by -1) {
      sum += number(i) * t
      t *= 10
    }
    sum
  }
}