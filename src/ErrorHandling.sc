import scala.util.{Failure, Success, Try}

// Try, Success, Failure (Pattern matching)

val outcome = Try(10 / 0)
outcome.isSuccess
outcome.isFailure

Try(10/0) match {
  case Success(value) => println("It is ok")
  case Failure(exception) => println("Errores")
}

// Either

def stringToInt(in: String): Either[String, Int] = {
  try {
    Right(in.toInt)
  } catch {
    case e: NumberFormatException => Left("Casting error")
  }
}

val fiveToInt = stringToInt("5")
fiveToInt.isRight

val aToInt = stringToInt("a")
aToInt.isLeft
