// 0. Same benefits as Companion objects and apply() method
// 1. Immutable arguments in parameter list
// 2. Copy method to make modified copies
// 3. hashCode, equals, toString by default
// 4. Pattern matching

case class Course(title: String, author: String)

val second = new Course("The book", "Hogly Rubio")
val fourth = Course.apply("Other book", "Juan Camilo")
val first = Course("The book", "Hogly Rubio")

first.eq(second)
first.equals(second)
first == second
val third = first.copy(author = "Mimino")
first == third

