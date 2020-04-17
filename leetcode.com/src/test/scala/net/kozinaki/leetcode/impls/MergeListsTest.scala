package test.scala.net.kozinaki.leetcode.impls

import main.scala.net.kozinaki.leetcode.impls.MergeLists
import main.scala.net.kozinaki.leetcode.impls.MergeLists.ListNode
import org.scalatest.funsuite.AnyFunSuite

class MergeListsTest extends AnyFunSuite {

  test("Merged list must be equals not-merged list but with same values") {
    var l1: ListNode = ListFactory.createListNode(Array(1, 2, 4))
    var l2: ListNode = ListFactory.createListNode(Array(1, 3, 4))
    var result: ListNode = ListFactory.createListNode(Array(1, 1, 2, 3, 4, 4))
    printListNode(MergeLists.mergeTwoLists(l1, l2))
    assert(MergeLists.mergeTwoLists(l1, l2).equals(result))

    l1 = ListFactory.createListNode(Array(1, 1, 1))
    l2 = ListFactory.createListNode(Array(5, 6, 7))
    result = ListFactory.createListNode(Array(1, 1, 1, 5, 6, 7))
    printListNode(MergeLists.mergeTwoLists(l1, l2))
    assert(MergeLists.mergeTwoLists(l1, l2).equals(result))

    l1 = ListFactory.createListNode(Array(-2, -1, 0))
    l2 = ListFactory.createListNode(Array(-1, 2, 7))
    result = ListFactory.createListNode(Array(-2, -1, -1, 0, 2, 7))
    printListNode(MergeLists.mergeTwoLists(l1, l2))
    assert(MergeLists.mergeTwoLists(l1, l2).equals(result))

    l2 = ListFactory.createListNode(Array(-1, 2, 7))
    result = ListFactory.createListNode(Array(-1, 2, 7))
    printListNode(MergeLists.mergeTwoLists(null, l2))
    assert(MergeLists.mergeTwoLists(null, l2).equals(result))

    l1 = ListFactory.createListNode(Array(-2, -1, 0))
    result = ListFactory.createListNode(Array(-2, -1, 0))
    printListNode(MergeLists.mergeTwoLists(l1, null))
    assert(MergeLists.mergeTwoLists(l1, null).equals(result))

    l1 = ListFactory.createListNode(Array(-2, -1))
    l2 = ListFactory.createListNode(Array(-1, 2, 7, 8, 10))
    result = ListFactory.createListNode(Array(-2, -1, -1, 2, 7, 8, 10))
    printListNode(MergeLists.mergeTwoLists(l1, l2))
    assert(MergeLists.mergeTwoLists(l1, l2).equals(result))

    l1 = ListFactory.createListNode(Array(-2, -1, 7, 8, 10))
    l2 = ListFactory.createListNode(Array(2))
    result = ListFactory.createListNode(Array(-2, -1, 2, 7, 8, 10))
    printListNode(MergeLists.mergeTwoLists(l1, l2))
    assert(MergeLists.mergeTwoLists(l1, l2).equals(result))

    assert(MergeLists.mergeTwoLists(null, null) == null)

    l1 = ListFactory.createListNode(Array(-2))
    l2 = ListFactory.createListNode(Array(-5))
    result = ListFactory.createListNode(Array(-5, -2))
    printListNode(MergeLists.mergeTwoLists(l1, l2))
    assert(MergeLists.mergeTwoLists(l1, l2).equals(result))
  }

  def printListNode(list: ListNode): Unit = {
    var l = list
    while (l != null) {
      print(l.x)
      l = l.next
      if (l != null) {
        print(" -> ")
      }
    }
    println()
  }

  object ListFactory {
    def createListNode(values: Array[Int]): ListNode = {
      val head: ListNode = new ListNode(values(0));
      values.drop(1).map(value => new ListNode(value)).fold(head)((nodeX, nodeY) => {
        nodeX.next = nodeY;
        nodeY;
      });
      head;
    }
  }

}