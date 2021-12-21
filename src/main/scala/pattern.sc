abstract class Currency

case class USD() extends Currency
case class CAD() extends Currency
case class NZD() extends Currency

val currency: Currency = CAD()
val amount = 100

currency match {
  case u: USD => println("USD " + amount)
  case c: CAD => println("USD " + amount * (1/1.30))
  case c: NZD => println("USD " + amount * (1/1.50))
  case _ => println("all money ain't good money " + amount)
}



