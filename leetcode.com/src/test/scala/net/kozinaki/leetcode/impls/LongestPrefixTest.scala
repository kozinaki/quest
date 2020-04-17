package test.scala.net.kozinaki.leetcode.impls

import main.scala.net.kozinaki.leetcode.impls.LongestPrefix.longestCommonPrefix
import org.scalatest.funsuite.AnyFunSuite

class LongestPrefixTest extends AnyFunSuite{

  test("Longest prefix must be exist or not") {
    assert(longestCommonPrefix(Array("flower","flow","flight")) == "fl")
    assert(longestCommonPrefix(Array("dog","racecar","car")) == "")
    assert(longestCommonPrefix(Array("dog","dogville","dogma")) == "dog")
    assert(longestCommonPrefix(Array("rastaman","rasta","rastawarrior")) == "rasta")
    assert(longestCommonPrefix(Array("hello","hellicopter","hell")) == "hell")
    assert(longestCommonPrefix(Array("a", "b")) == "")
    assert(longestCommonPrefix(Array("","hellicopter","hell")) == "")
    assert(longestCommonPrefix(Array()) == "")
    assert(longestCommonPrefix(null) == "")
  }

}
