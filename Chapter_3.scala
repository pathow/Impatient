/**
 * Created by patrick on 1/30/16.
 */

// Exercise 1

import scala.util.Random

val a1 = Seq.fill(10)(Random.nextInt)

// Exercise 2

val test = Array(1,2,3,4,5)

def swipswap(x: Array[Int]): Array[Int] = {
  for (i <- x.indices) {
    if (i % 2 != 0) {
      val a = x(i - 1)
      val b = x(i)
      x(i - 1) = b
      x(i) = a
    }
  }
  x
}

swipswap(test)

// Exercise 3

for (i <- test.indices) yield { if (i % 2 == 1) test(i-1) else if (i+1 <= test.length-1) test(i+1) else test(i)}


