import execises._

val list = MyLinkedList.apply("A", MyLinkedList.apply("B", MyLinkedList.apply("C", null)))
list.reverse()