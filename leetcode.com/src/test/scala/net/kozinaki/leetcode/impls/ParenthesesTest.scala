package test.scala.net.kozinaki.leetcode.impls

import main.scala.net.kozinaki.leetcode.impls.Parentheses
import org.scalatest.funsuite.AnyFunSuite

class ParenthesesTest extends AnyFunSuite{

  test ("Parentheses must be closed") {
    assert(Parentheses.isValid("(({[]})())"))
    assert(Parentheses.isValid("(([({})]){}([{}]))"))
    assert(Parentheses.isValid(""))
    assert(!Parentheses.isValid("(("))
    assert(Parentheses.isValid("()"))
    assert(!Parentheses.isValid("){"))
    assert(Parentheses.isValid("()[]{}"));
    assert(!Parentheses.isValid("(]"));
    assert(!Parentheses.isValid("([)]"));
    assert(Parentheses.isValid("{[]}"));
    assert(Parentheses.isValid("(()())"));
    assert(Parentheses.isValid("(()()()()()()()()()()()()()()()()()())"));
    assert(Parentheses.isValid("(()()(){}[])"));
    assert(Parentheses.isValid("{()()(){}[]}"));
    assert(Parentheses.isValid("{()[](){}[]}"));
    assert(!Parentheses.isValid("{()[](){][]}"));
  }

}
