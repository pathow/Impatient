class Counter {
  private var value = 0
  def increment() {value += 1 }
  def current() = value

  // can access private variables of other object of same Class
  def isLess(other: Counter) = value < other.value
}

val myCounter = new Counter
myCounter.increment()
println(myCounter.current())
myCounter.current

class Person {
  private var privateAge = 0

  def age = privateAge
  def age_=(newValue: Int): Unit ={
    // only changes if increase
    if (newValue > privateAge) privateAge = newValue;
  }
}

val fred = new Person
fred.age = 30
fred.age = 21 // Fred still 30 because can't get younger


val myCounter2 = new Counter
myCounter2.increment()
myCounter2.increment()

myCounter.isLess(myCounter2)

// auxiliary constructors
class Person2 {
  private var name = ""
  private var age = 0

  def this(name: String){
    this()
    this.name = name
  }

  def this(name: String, age: Int){
    this(name)
    this.age = age
  }
}

val p1 = new Person2
val p2 = new Person2("Fred")
val p3 = new Person2("Fred", 42)

// primary constructor
class Person3(val name: String, val age: Int){
  println("Just constructed another person")
  def description = name + " is " + age + " years old."
}

val p4 = new Person3("Fred", 42)
p4.description
