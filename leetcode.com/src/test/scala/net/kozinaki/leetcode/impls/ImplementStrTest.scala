package test.scala.net.kozinaki.leetcode.impls

import main.scala.net.kozinaki.leetcode.impls.ImplementStr
import org.scalatest.funsuite.AnyFunSuite

class ImplementStrTest extends AnyFunSuite {

  test("Return right index of substring form string") {
    assert(ImplementStr.strStr("mississippi", "issip") == 4)
    assert(ImplementStr.strStr("hello", "ll") == 2)
    assert(ImplementStr.strStr("hello", "o") == 4)
    assert(ImplementStr.strStr("he", "hello") == -1)
    assert(ImplementStr.strStr("hello World", " ") == 5)
    assert(ImplementStr.strStr("aaaaa", "bba") == -1)
    assert(ImplementStr.strStr("aaaaa", "a") == 0)
    assert(ImplementStr.strStr("abaaa", "b") == 1)
    assert(ImplementStr.strStr("abaaa", "ba") == 1)
    assert(ImplementStr.strStr("abaaa", "baaa") == 1)
    assert(ImplementStr.strStr("abaaa", "baaaa") == -1)
    assert(ImplementStr.strStr("", "") == 0)
    assert(ImplementStr.strStr("text", "") == 0)
  }

}
