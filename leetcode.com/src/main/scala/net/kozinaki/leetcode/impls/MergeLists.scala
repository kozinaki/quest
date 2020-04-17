package main.scala.net.kozinaki.leetcode.impls


object MergeLists {

  class ListNode(var _x: Int = 0) {
    var next: ListNode = null
    var x: Int = _x

    override def equals(obj: Any): Boolean = {
      if (obj == null || !obj.isInstanceOf[ListNode]) {
        return false
      }
      val that: ListNode = obj.asInstanceOf[ListNode];
      if (x != that.x) {
        return false;
      }
      if (next == null && that.next == null) {
        return true;
      }
      if (next == null) {
        return false;
      }
      next.equals(that.next);
    }
  }

  def mergeTwoLists(l1: ListNode, l2: ListNode): ListNode = {
    if (l1 != null && l2 != null) {
      createListNode(l1, l2, l1.x < l2.x)
    } else {
      createListNode(l1, l2, l1 != null && l2 == null)
    }
  }

  def createListNode(listNodeFirst: ListNode, listNodeSecond: ListNode, first: Boolean):ListNode = {
    if (listNodeFirst == null && listNodeSecond == null) {
      return null
    }
    val result: ListNode = new ListNode();
    if (first) {
      result.x = listNodeFirst.x;
      result.next = mergeTwoLists(listNodeFirst.next, listNodeSecond)
    } else {
      result.x = listNodeSecond.x
      result.next = mergeTwoLists(listNodeFirst, listNodeSecond.next)
    }
    result
  }

}
