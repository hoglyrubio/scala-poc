// Function definition
// def functionName(argument: Type): ReturnType = { body }

def plusOneOrZero(number: Int): Int = {
  if (number < 0) 0
  else number + 1
}

plusOneOrZero(-1)
plusOneOrZero(99)

def product(a: Int, b: Int) = {
  if (a == 0 || b == 0) 0
  else a * b
}

product(2, 10)
product(2, 0)

def product2(a: Int, b: Int) = a * b
product(2, 10)
product(2, 0)

// Anonymous function

// Function literals

val myFunc = (a: Int, b: Int) => a * b
myFunc(2, 10)
myFunc(2, 0)

// High order functions
case class Fruit(name: String)
val fruitBasket = List(Fruit("apple"), Fruit("kiwi"))

fruitBasket.filter((fruit: Fruit) => fruit.name == "apple")
fruitBasket.filter((fruit) => fruit.name == "apple")
fruitBasket.filter(fruit => fruit.name == "kiwi")
fruitBasket.filter(_.name == "kiwi")
