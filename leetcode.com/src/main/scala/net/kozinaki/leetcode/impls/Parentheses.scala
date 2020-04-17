package main.scala.net.kozinaki.leetcode.impls

object Parentheses {

  val ERROR: String = "ERROR"
  var round = Array('(', ')');
  var brace = Array('{', '}');
  var square = Array('[', ']');

  def isValid(s: String): Boolean = {
    s.length == 0 ||
      (round(0).equals(s.charAt(0)) || brace(0).equals(s.charAt(0)) || square(0).equals(s.charAt(0))) &&
        s.length % 2 == 0 &&
        !validation(s).equals(ERROR);
  }

  def validation(s: String): String = {
    if (s.length == 0) {
      return ERROR;
    }
    if (round(0).equals(s.charAt(0))) {
      var temp:String = validation(s.substring(1));
      if (round(1).equals(temp.charAt(0))) {
        return if (temp.length > 1) validation(temp.substring(1)) else s;
      }
    } else if (brace(0).equals(s.charAt(0))) {
      var temp:String = validation(s.substring(1));
      if (brace(1).equals(temp.charAt(0))) {
        return if (temp.length > 1) validation(temp.substring(1)) else s;
      }
    } else if (square(0).equals(s.charAt(0))) {
      var temp:String = validation(s.substring(1));
      if (square(1).equals(temp.charAt(0))) {
        return if (temp.length > 1) validation(temp.substring(1)) else s;
      }
    } else {
      return s;
    }
    ERROR;
  }

}
