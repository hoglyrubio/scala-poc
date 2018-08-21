val number = 5

number match {
  case 0 => "zero"
  case 1 => "one"
  case 3 => "five"
  case _ => "none of values"
}

0 match {
  case _ => "whatever"
  case 1 => "one"
  case 3 => "five"
}

// Patten Matching on case classes

case class Book(title: String, yeahPublished: Int, author: String, isbn: String)

val progInScala = Book("Programming in Scala", 2003, "Martin Odersky", "1233")
val funcProgInScala = Book("Functional Programming in Scala", 2004, "Ktoso", "7457646")

progInScala match {
  case Book(title, yearPublished, author, isbn) => println(s"$title <=> $yearPublished <=> $author <=> $isbn")
  case _ => println("Didn't match anything")
}

funcProgInScala match {
  case Book(_, _, author, _) => println(s"$author")
  case _ => println("No author")
}

// Patten Matching on Sequences

val myList = List(1,2,3)

myList match {
  case List(_, second, _) => second
  case _ => -1
}

myList match {
  case List(_, second) => second
  case _ => -1
}

List(1,2) match {
  case List(_, second, _*) => second
  case _ => -1
}