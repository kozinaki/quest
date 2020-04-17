package test.scala.net.kozinaki.leetcode.impls

import main.scala.net.kozinaki.leetcode.impls.RemoveDuplicates
import org.scalatest.funsuite.AnyFunSuite

class RemoveDuplicatesTest extends AnyFunSuite {

  test ("Array with moved duplicates in-place must be equals array without duplicates") {
    var arr: Array[Int] = Array(1, 2, 2, 3, 4);
    var length: Int = RemoveDuplicates.removeDuplicates(arr)
    assert(arr.take(length).sameElements(Array(1, 2, 3, 4)))

    arr = Array(1, 1, 1, 2, 2, 2, 3, 4, 4, 4, 4, 4, 5);
    length = RemoveDuplicates.removeDuplicates(arr)
    assert(arr.take(length).sameElements(Array(1, 2, 3, 4, 5)))

    arr = Array(1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 3, 6, 9, 12, 13, 13, 13, 13);
    length = RemoveDuplicates.removeDuplicates(arr)
    assert(arr.take(length).sameElements(Array(1, 3, 6, 9, 12, 13)))

    arr = Array(0, 1, 1, 1, 1, 1, 1, 1, 1, 3, 6, 9, 12, 13, 13, 13, 13);
    length = RemoveDuplicates.removeDuplicates(arr)
    assert(arr.take(length).sameElements(Array(0, 1, 3, 6, 9, 12, 13)))

    arr = Array(1, 1, 2);
    length = RemoveDuplicates.removeDuplicates(arr)
    assert(arr.take(length).sameElements(Array(1, 2)))

    arr = Array(0, 0, 1, 1, 1, 2, 2, 3, 3, 4);
    length = RemoveDuplicates.removeDuplicates(arr)
    assert(arr.take(length).sameElements(Array(0, 1, 2, 3, 4)))
  }

}
