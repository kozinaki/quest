package test.scala.net.kozinaki.leetcode.impls

import main.scala.net.kozinaki.leetcode.impls.RomanConverter
import org.scalatest.funsuite.AnyFunSuite

class RomanConverterTest extends AnyFunSuite {

  test("Roman muerals must be equals arabic numerals"){
    println(RomanConverter.romanToInt("III"))
    assert(RomanConverter.romanToInt("III") == 3)

    println(RomanConverter.romanToInt("IV"))
    assert(RomanConverter.romanToInt("IV") == 4)

    println(RomanConverter.romanToInt("IX"))
    assert(RomanConverter.romanToInt("IX") == 9)

    println(RomanConverter.romanToInt("LVIII"))
    assert(RomanConverter.romanToInt("LVIII") == 58)

    println(RomanConverter.romanToInt("MCMXCIV"))
    assert(RomanConverter.romanToInt("MCMXCIV") == 1994)
  }

}
