package main.scala.net.kozinaki.leetcode.impls

/**
 * {@see <a href="https://leetcode.com/problems/implement-strstr">implement-strstr</a>}
 */
object ImplementStr {

  def strStr(haystack: String, needle: String): Int = {
    var i, j, k: Int = 0;
    var break: Boolean = true;
    if (needle.length == 0) return 0;
    while (i < haystack.length) {
      if (break) k = i;
      if (i < haystack.length && haystack.charAt(i) == needle.charAt(j)) {
        break = false;
        if (j == needle.length - 1) return i - j;
        i += 1; j += 1;
      } else {
        break = true;
        j = 0; i = k; i += 1;
      }
    }
    -1;
  }

}
