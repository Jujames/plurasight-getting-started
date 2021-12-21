val anArray = Array(100, 200, 300)

anArray match {
  case Array(_, _, third) => println("third = " + third)
}

val aTuple = ("USD", 100)
aTuple match {
  case (currency, amount) if currency == "USD" => println("USD " + amount)
  case (currency, amount) if currency == "NZD" => println("USD " + amount * (1/1.50))

}









