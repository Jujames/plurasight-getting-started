def square(x: Int): Int = x * x
val sq_2 = square(2)

def multiply(x: Int, y: Int) = x * y
val mul_10_30 = multiply(10, 30)

def multiply(nums: Int*): Int = {
 var product = 1
  for (num <- nums) product = product * num
  product
}
val mul_10_20_30 = multiply(10, 20, 30)
val mul_x_y = multiply(10, 20)
val mul_multiple = multiply(10, 20, 30, 40, 50)



def sumOdd(n: Int): Int = {
  def getOdd(x: Int): Array[Int] = {
    var result = Array[Int] (0)
    var current = 1
    while (current <= x) {
      if (current % 2 == 1) result = result :+ current
      current = current + 1
    }
    result
  }

  val odds = getOdd(n)
  println(odds.mkString(","))
  odds.sum
}
sumOdd(20)

def greet( first: String, last: String): Unit = {
  println("Hello!, " + first + ", " + last)
}
greet("Tony", "Stark")
greet("Stark", "Tony")
greet(last = "Stark", first = "Tony")

def logTransaction(amount: Double,
                   debit: Boolean = true,
                   currency: String = "USD"): Unit = {
  val symbol = if(debit) "-" else "+"
  println(symbol + currency + amount)
}
logTransaction(100.25)
logTransaction(23.15)
logTransaction(89.33)
logTransaction(89.33, false, "NZD")
logTransaction(89.33, currency = "CAD", debit = false)

def square(n: Int): Int = n * n // Int => Int
def cube(n: Int): Int = n * n * n // Int => Int
def sum (a: Int, b: Int): Int = a + b // (Int, Int) => Int
def length(a: String): Int = a.length // String => Int

def transform(f: Int => Int, numbers: Int*): Seq[Int] = numbers.map(f)

transform(square, 1, 2, 3, 4)
transform(cube, 1, 2, 3, 4, 5)

transform(n => n * n * n, 1, 2, 3)
transform(x => 2 * x, 1, 2, 3)

val numbers = Array(1, 2, 3, 4, 5, 6, 7)
numbers.map(num => num * 2)
numbers.filter(num => num % 2 == 0)
numbers.filter(num => num % 2 == 1)

import Implicits.stringToCurrency
val cad: Currency = "CAD 100"

























