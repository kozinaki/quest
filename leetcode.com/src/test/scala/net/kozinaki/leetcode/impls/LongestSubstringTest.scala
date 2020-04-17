package test.scala.net.kozinaki.leetcode.impls

import main.scala.net.kozinaki.leetcode.impls.LongestSubstring.lengthOfLongestSubstring
import org.scalatest.funsuite.AnyFunSuite

class LongestSubstringTest extends AnyFunSuite {

  test("Longest substring must be some fixed length") {
    assert(lengthOfLongestSubstring("abcabcbb") == 3);
    assert(lengthOfLongestSubstring("bbbbbb") == 1);
    assert(lengthOfLongestSubstring("asdasddsaz") == 4);
    assert(lengthOfLongestSubstring("1234566543") == 6);
    assert(lengthOfLongestSubstring("tyuiop") == 6);
    assert(lengthOfLongestSubstring("qwertgfdzzz") == 9);
    assert(lengthOfLongestSubstring("zzzzz3231") == 3);
    assert(lengthOfLongestSubstring("abacd") == 4);
    assert(lengthOfLongestSubstring("banviajz") == 6);
    assert(lengthOfLongestSubstring("klvqkpqivdcrpgkcttmkrgtekiclinf") == 9);
  }

}
