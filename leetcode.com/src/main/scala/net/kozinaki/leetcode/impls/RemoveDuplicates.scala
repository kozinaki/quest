package main.scala.net.kozinaki.leetcode.impls

/**
 * {@see <a href="https://leetcode.com/problems/remove-duplicates-from-sorted-array">remove-duplicates-from-sorted-array</a>}
 */
object RemoveDuplicates {

  def removeDuplicates(nums: Array[Int]): Int = {
    if (nums.length <= 1) {
      return nums.length
    }
    var j: Int = 0;
    for (i <- 1 to nums.length - 1) {
      if (nums(i) != nums(j)) {
        j += 1;
        nums.update(j, nums(i))
      }
    }
    j + 1
  }

}
