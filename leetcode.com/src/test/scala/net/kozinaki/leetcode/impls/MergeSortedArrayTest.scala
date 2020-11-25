package test.scala.net.kozinaki.leetcode.impls

import main.scala.net.kozinaki.leetcode.impls.MergeSortedArray
import org.scalatest.funsuite.AnyFunSuite

class MergeSortedArrayTest extends AnyFunSuite {

  test("Merge sorted arrays") {
    var nums1: Array[Int] = Array(3, 5, 6, 8, 0, 0, 0, 0);
    var nums2: Array[Int] = Array(1, 2, 3, 4);
    MergeSortedArray.merge(nums1, 4, nums2, 4);
    assert(nums1 sameElements Array(1, 2, 3, 3, 4, 5, 6, 8));

    nums1 = Array(1, 2, 3, 0, 0, 0);
    nums2 = Array(2, 5, 6);
    MergeSortedArray.merge(nums1, 3, nums2, 3);
    assert(nums1 sameElements Array(1, 2, 2, 3, 5, 6));

    nums1 = Array(1, 2, 3, 4, 5, 6, 7, 8, 9, 0, 0, 0);
    nums2 = Array(2, 5, 6);
    MergeSortedArray.merge(nums1, 9, nums2, 3);
    assert(nums1 sameElements Array(1, 2, 2, 3, 4, 5, 5, 6, 6, 7, 8, 9));

    nums1 = Array(10, 11, 12, 13, 14, 15, 16, 0, 0, 0);
    nums2 = Array(2, 5, 6);
    MergeSortedArray.merge(nums1, 7, nums2, 3);
    assert(nums1 sameElements Array(2, 5, 6, 10, 11, 12, 13, 14, 15, 16));

    nums1 = Array(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 0, 0, 0);
    nums2 = Array(22, 25, 26);
    MergeSortedArray.merge(nums1, 15, nums2, 3);
    assert(nums1 sameElements Array(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 22, 25, 26));

    nums1 = Array(-100, 100, 200, 0, 0, 0, 0);
    nums2 = Array(-2, 5, 6, 1000000);
    MergeSortedArray.merge(nums1, 3, nums2, 4);
    assert(nums1 sameElements Array(-100, -2, 5, 6, 100, 200, 1000000));
  }

}
