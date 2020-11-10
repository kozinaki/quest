package main.scala.net.kozinaki.leetcode.impls

/**
 * {@see <a href="https://leetcode.com/problems/longest-substring-without-repeating-characters">longest-substring-without-repeating-characters</a>}
 */
object LongestSubstring {

  def lengthOfLongestSubstring(s: String): Int = {
    getMaxStr(s, "").length;
  }

  def getMaxStr(value: String, maxStr: String): String = {
    if (value.isEmpty()) {
      return maxStr;
    }
    var second: String = "";
    value.iterator
      .takeWhile(char => !second.contains(char))
      .foreach(char => second = second.concat(char.toString()))
    getMaxStr(value.substring(1, value.length()), if (maxStr.length() < second.length()) second else maxStr);
  }

}
