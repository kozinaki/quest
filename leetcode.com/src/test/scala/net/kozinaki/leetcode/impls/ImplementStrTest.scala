package test.scala.net.kozinaki.leetcode.impls

import main.scala.net.kozinaki.leetcode.impls.ImplementStr._
import org.scalatest.funsuite.AnyFunSuite

class ImplementStrTest extends AnyFunSuite {

  test("Return right index of substring form string") {
    assert(strStr("mississippi", "issip") == 4)
    assert(strStr("hello", "ll") == 2)
    assert(strStr("hello", "o") == 4)
    assert(strStr("he", "hello") == -1)
    assert(strStr("hello World", " ") == 5)
    assert(strStr("aaaaa", "bba") == -1)
    assert(strStr("aaaaa", "a") == 0)
    assert(strStr("abaaa", "b") == 1)
    assert(strStr("abaaa", "ba") == 1)
    assert(strStr("abaaa", "baaa") == 1)
    assert(strStr("abaaa", "baaaa") == -1)
    assert(strStr("", "") == 0)
    assert(strStr("text", "") == 0)
  }

}
