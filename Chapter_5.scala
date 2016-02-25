/**
 * Created by patrick on 2/24/16.
 */

// Exercise 1
class Counter(private var value: Int) {

  def increment() {if (value < Int.MaxValue) value += 1}
  def current = value
}

// Exercise 2
class BankAccount(private var amount: Double) {

  def deposit(inflow: Double) { amount += inflow }

  def withdraw(outflow: Double) = {
    if (amount-outflow >= 0 ) { amount -= outflow }
    else {println("Error: Overdrawn! 10% Fee Assessed.")
      amount -= (outflow * 1.1) }
  }

  def balance = amount
}

// Exercise 3
class Time(private var hrs:Int, private var min:Int){
  if (hrs > 23 || hrs < 0 || min < 0 || min > 59){
    println("Inputted time is impossible")
  }

  def hours = hrs
  def minutes = min

  def before(other: Time): Boolean = hrs*60 + min < other.hrs*60 + other.min

}

// Exercise 4
class Midnight(var hrs:Int, var min:Int){

  private var minutes = hrs*60 + min
  if (minutes < 0 || minutes > 1439){
    println("Inputted time is impossible")
  }

  def before(other: Midnight): Boolean = minutes < other.minutes

}


// Exercise 5
import scala.beans.BeanProperty

class Student(@BeanProperty var name: String, @BeanProperty var id: Long)