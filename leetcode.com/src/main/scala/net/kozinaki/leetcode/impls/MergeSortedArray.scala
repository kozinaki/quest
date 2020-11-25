package main.scala.net.kozinaki.leetcode.impls

import scala.annotation.tailrec

/**
 * {@see <a href="https://leetcode.com/problems/merge-sorted-array/">Merge Sorted Array</a>}
 */
object MergeSortedArray {

  @tailrec
  def merge(nums1: Array[Int], m: Int, nums2: Array[Int], n: Int): Unit = {
    if (n == 0) {
      return;
    }

    add(nums1, m, nums2(nums2.length - n));
    merge(nums1, m + 1, nums2, n - 1);
  }

  private def add(nums1: Array[Int], m: Int, element: Int): Unit = {
    var inserted: Boolean = false;
    var temp: Int = 0;
    for (i <- 0 until nums1.length) {
      if (inserted) {
        nums1(i) += temp;
        temp = nums1(i) - temp;
        nums1(i) -= temp;
      }
      if (nums1(i) > element && !inserted) {
        temp = nums1(i);
        nums1(i) = element;
        inserted = true;
      }
    }
    if (!inserted) {
      nums1(m) = element;
    }
  }

}
