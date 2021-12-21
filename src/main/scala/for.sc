val amounts = Array(10, 24, 35, 23, 18)
val curriencies = Array("USD", "NZD")


val result: Array[String] = for {
  amount <- amounts
  currency <- curriencies
  if amount > 20 && (currency == "NZD" || currency == "USD")
} yield currency + " " + amount

// foreach is statement
amounts.foreach(amount => println(amount * 1000))
List(1,2,3,4).foreach(num => println(num * 200))












