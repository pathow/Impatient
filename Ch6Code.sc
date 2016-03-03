object Accounts{
  private var lastNumber = 0
  def newUniqueNumber() = { lastNumber += 1; lastNumber}
}

Accounts.newUniqueNumber()
Accounts.newUniqueNumber()

object Account {
  private var lastNumber = 0
  private def newUniqueNumber() = { lastNumber += 1; lastNumber}
}

class Account {
  val id = Account.newUniqueNumber()
  private var balance = 0.0
  def deposit(amount: Double) { balance += amount}
}

class Account2 private (val id: Int, initialBalance: Double) {
  var balance = initialBalance
  def deposit(amount: Double) { balance += amount}
}

object Account2 {
  private var lastNumber = 0
  private def newUniqueNumber() = { lastNumber += 1; lastNumber}

  def apply(initialBalance: Double) = new Account2(newUniqueNumber(), initialBalance)
}

val acct = Account2(1000.0)
acct.balance
acct.id

object Hello extends App {
  println("Hello, World!")
}

object TrafficLightColor extends Enumeration {
  val Red,Yellow,Green = Value
}
TrafficLightColor.Red.id
TrafficLightColor.Red
TrafficLightColor.Yellow.id



