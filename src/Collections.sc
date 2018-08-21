// LISTS
val numbers = List(3,2,5,4,1)
numbers.head
numbers.tail
numbers.tail.head
numbers.init
numbers.last

// Adding a value
numbers :+ 888
888 +: numbers
numbers

// Adding a List
numbers
numbers ++ List(111, 222)
List(111, 222) ++ numbers
numbers

// Dropping items
val digits = List(0,1,2,3,4,5,6,7,8,9)
digits.drop(2) // Drop two first
digits.dropRight(2) // drop two last
digits.dropWhile(_ < 5)

// Adding items to the list
digits ::: List(99,88)
List(99,88) ::: digits

// Methods in numeric collections
val nums = List(1,2,3,4,5,6,7,8,9)
nums.sum
nums.min
nums.max
nums.product

// SETs
val mySet = Set("A","A","B","B","C","C","D","D")
mySet + "E"
mySet - "A"
mySet - "C"
mySet ++ Set("E", "F")

// MAPs
val weekDays = Map(
  1 -> "Sunday",
  2 -> "Monday",
  3 -> "Tuesday"
)
weekDays(2)
weekDays + (4 -> "Wednesday")
weekDays - 2
weekDays.foreach(entry => println(s"day: ${entry._1} => ${entry._2}"))
weekDays ++ Map(4 -> "Wednesday", 5 -> "Thursday", 6 -> "Friday", 7 -> "Saturday")

val tuple = (10, 20, 30)
tuple._1
tuple._2
tuple._3

val times = List(2,1,5,9,14,22,45,2,4,23)
times.filter(seconds => seconds >= 10)
times.filter(_ >= 10)
times.filter(_ >= 10).min
times.filter(_ >= 10).max