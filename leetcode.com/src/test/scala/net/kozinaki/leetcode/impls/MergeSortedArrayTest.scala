package test.scala.net.kozinaki.leetcode.impls

import main.scala.net.kozinaki.leetcode.impls.MergeSortedArray
import org.scalatest.funsuite.AnyFunSuite

class MergeSortedArrayTest extends AnyFunSuite {

  test("Merge sorted arrays") {
    var nums1: Array[Int] = Array(3, 5, 6, 8, 0, 0, 0, 0);
    var nums2: Array[Int] = Array(1, 2, 3, 4);
    MergeSortedArray.merge(nums1, 4, nums2, 4);
    println(nums1.mkString(" "))
    assert(nums1 sameElements Array(1, 2, 3, 3, 4, 5, 6, 8));

    nums1 = Array(1, 2, 3, 0, 0, 0);
    nums2 = Array(2, 5, 6);
    MergeSortedArray.merge(nums1, 3, nums2, 3);
    println(nums1.mkString(" "))
    assert(nums1 sameElements Array(1, 2, 2, 3, 5, 6));
  }

}
