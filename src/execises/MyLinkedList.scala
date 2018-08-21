package execises

case class MyLinkedList(var value: String, var next: MyLinkedList) {
  override def toString: String = {
    var current = this
    val sb = StringBuilder.newBuilder
    while (current != null) {
      sb.append(current.value)
      sb.append("->")
      current = current.next
    }
    sb.toString
  }

  def reverse(): MyLinkedList = {
    var current = this
    var newCurrent: MyLinkedList = null
    while (current != null) {
      val oldNext = current.next
      current.next = newCurrent
      newCurrent = current
      current = oldNext
    }
    return newCurrent
  }
}
