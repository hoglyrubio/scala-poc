object Person {
  def apply(firstName: String, lastName: String): Person = new Person(firstName, lastName)
}

class Person(firstName: String, lastName: String) {
  def getName: String = lastName + ", " + firstName
}