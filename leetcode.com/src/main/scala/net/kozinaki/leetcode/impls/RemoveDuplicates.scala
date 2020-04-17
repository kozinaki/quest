package main.scala.net.kozinaki.leetcode.impls

//TODO
object RemoveDuplicates {

  def removeDuplicates(nums: Array[Int]): Int = {
    var dublicate: Int = Int.MaxValue;
    for (num <- nums) {
      if (dublicate != num) {

      }
      dublicate = num
    }
    0;
  }

}
