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


// Exercise 6
class Person(private var privateAge: Int) {
  if (privateAge < 0) {privateAge = 0}

  // Make private and rename
  def age = privateAge

  def age_=(newValue: Int) {
    if (newValue > privateAge) privateAge = newValue; // Can’t get younger }
  }
}


// Exercise 7
class Person2(val name: String) {
  val splitted = name.split(" ")

  def firstName = splitted.head
  def lastName = splitted.last
}


// Exercise 8
// Note: Could do this with all four as inputs to class, but I wanted to make it flexible enough to handle adding License Plate
// without adding a Model Year (slightly changes question, though, since then modelYear needs to have both get/set)
class Car(val manufacturer: String, val model: String) {
  var modelYear: Int = -1
  var licensePlate: String = ""

  def this(manufacturer: String, model: String, modelYear: Int){
    this(manufacturer, model)
    this.modelYear = modelYear
  }


  def this(manufacturer: String, model: String, licensePlate: String){
    this(manufacturer, model)
    this.licensePlate = licensePlate
  }

  def this(manufacturer: String, model: String, modelYear: Int, licensePlate: String){
    this(manufacturer, model)
    this.modelYear = modelYear
    this.licensePlate = licensePlate
  }
}


// Exercise 10
class Employee(val name: String = "John Q. Public", var salary: Double = 0.0){
  override def toString = "Employee: %s, Salary: %f".format(name, salary)
}
// Answer = this is cleaner and more flexible, in my opinion, as it allows user to enter name, but not salary