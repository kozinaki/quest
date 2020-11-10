package main.scala.net.kozinaki.leetcode.impls

/**
 * {@see <a href="https://leetcode.com/problems/longest-common-prefix">longest-common-prefix</a>}
 */
object LongestPrefix {

  def longestCommonPrefix(strs: Array[String]): String = {
    val prefix: String = ""
    if (strs == null || strs.length == 0) {
      return prefix
    }
    recursively(strs, prefix, 0);
  }

  def recursively(strs: Array[String], prefix: String, index: Int): String = {
    if (strs.apply(0).length - 1 < index) {
      return prefix
    }
    val element: String = strs.apply(0).charAt(index).toString;
    for (str <- strs) {
      if (str.length - 1 < index || !element.equals(str.charAt(index).toString)) {
        return prefix
      }
    }
    recursively(strs, prefix.concat(element), index + 1)
  }
}