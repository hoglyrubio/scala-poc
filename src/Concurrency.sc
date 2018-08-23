import scala.concurrent.Future
import scala.concurrent.ExecutionContext.Implicits.global
import scala.util.{Failure, Success}

val future = Future {Thread.sleep(1000); 21 + 22 }
future.isCompleted
future.value
future.onComplete({
  case Success(result) => println(s"got: $result")
  case Failure(e) => println(s"Failed: $e")
})
Thread.sleep(1000)

// Futures transformation

val productPrice = Future {Thread.sleep(1000); 150 }
val productTax = Future {Thread.sleep(1000); 8.95 }
val finalPrice = for {
  price <- productPrice
  tax <- productTax
} yield price + tax
Thread.sleep(2000)
finalPrice.value

// Futures filtering

val salary = Future { Thread.sleep(1000); 7000}
val salaryLarge = salary.filter(s => s < 5000)
Thread.sleep(1000)
salaryLarge