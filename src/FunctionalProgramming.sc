case class Fruit(name: String)

val apple = Fruit("apple")
val mango = Fruit("mango")
val kiwi = Fruit("kiwi")

val basketFruit = List(apple, mango, kiwi, mango, apple)

def getApples(basket: List[Fruit])= for (fruit <- basket if fruit.name == "apple") yield fruit
def getKiwis(basket: List[Fruit])= for (fruit <- basket if fruit.name == "kiwi") yield fruit

getApples(basketFruit)
getKiwis(basketFruit)

// Now with high order functions

def getFruits(basket: List[Fruit], filterByFruit: Fruit => Boolean) =
  for (fruit <- basket if filterByFruit(fruit)) yield fruit

def getApple(basket: List[Fruit]) =
  getFruits(basket, (fruit: Fruit) => fruit.name == "apple")

def getKiwi(basket: List[Fruit]) =
  getFruits(basket, (fruit: Fruit) => fruit.name == "kiwi")

getApple(basketFruit)
getKiwi(basketFruit)