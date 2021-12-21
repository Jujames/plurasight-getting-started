import java.util.Currency


case class Currency(code: String, amount: Double, toUSD: Double)

object Implicits extends App {
  // money "USD 100"
  implicit def stringToCurrency(money: String): Currency = {
    val Array(code: String, value: String) = money.split("\\s")
    val amountAsDouble = value.toDouble
    code match {
      case "USD" => Currency("USD", amountAsDouble, amountAsDouble)
      case "NZD" => Currency("USD", amountAsDouble, amountAsDouble * (1/1.50))
      case "CAD" => Currency("USD", amountAsDouble, amountAsDouble * (1/1.30))
    }
  }
  println(stringToCurrency("USD 100"))
  println(stringToCurrency("NZD 100"))
  println(stringToCurrency("CAD 100"))


 val cad: Currency = "CAD 100"
 val nzd: Currency = "NZD 100"
  println(cad)
  println(nzd)
}

