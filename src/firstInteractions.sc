// FOR LOOP

val numbers = List(1,2,3,4)
val letters = List("a", "b", "c")

// ---------------------------
// Functional For-Loops
// for clause yield body

val a = for (number <- numbers) yield number * 2
println(a)

for (number <- numbers) yield {
  number * 2
}

for {
  number <- numbers
  letter <- letters
} yield number + " => " + letter

// ---------------------------
// Imperative For-Loops

// Using generator expression
for (letter <- letters) {
  println(letter)
}

for (number <- numbers) {
  if (number % 2 == 0) {
    println(number)
  }
}

// The conditions can be replaced with this:
for (number <- numbers if (number % 2 == 0) ) {
  println(number)
}

// Multiple conditions
for (number <- numbers
     if (number % 2 == 0)
     if (number > 2)
) println(number)

// Multiple iterations
for (number <- numbers) {
  for (letter <- letters) {
    println(number + " => " + letter)
  }
}

// The same as before bu changing to curly braces
for {
  number <- numbers
  letter <- letters
} println(number + " => " + letter)


