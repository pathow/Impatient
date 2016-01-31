/**
 * Created by patrick on 8/29/15.
 */

// Note: import io.StdIn._ for any readLine now, due to deprecation
// Note: use scala -Xnojline in terminal REPL to see inputs (but disables arrow key command cycling)

// Exercise 1
def signum(x: Int): Int = {
  if (x > 0) 1
  else if (x < 0) -1
  else 0
}

// Exercise 2
/*
Type is Unit, value is ()
 */

// Exercise 3


// Exercise 4
var i: Int = 10
while (i >= 0) {
  println(i)
  i = i -1
}


// Exercise 5
def countdown(n: Int) = {
  var i = n
  while (i >= 0){
    println(i)
    i = i - 1
  }
}

// Exercise 6

{for(x <- "Hello") yield BigInt(x)}.product

// Exercise 7
val hi = "Hello"
hi.foldLeft(1L)(_ * _)

// Exercise 8

def product(s: String): BigInt = {
  {for(x <- s) yield BigInt(x)}.product
}

// Exercise 9

def productRecursive(s: String): BigInt = {
  if (s.length() == 1){
    s.takeRight(1).foldLeft(1L)(_ * _.toInt)
  }
  else{
    var new_s = s.dropRight(1)
    productRecursive(new_s) * (s.takeRight(1).foldLeft(1L)(_ * _.toInt))
  }
}


// Exercise 10

def power(x: Double, n: Integer): Double = {
  if (n == 0){
    1
  } else if (n < 0){
    1 / power(x, -n)
  } else if (n % 2 == 0){
    power(x, n/2) * power(x, n/2)
  } else {
    x * power(x, n-1)
  }
}
