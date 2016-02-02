/**
 * Created by patrick on 1/30/16.
 */


import scala.collection.mutable.ArrayBuffer
import scala.util.Random
import java.awt.datatransfer._
import collection.JavaConversions._
import collection.mutable._

// Exercise 1

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


// Exercise 4

def posNeg(input: Array[Int]): Array[Int] = {
  input.filter(_ > 0) ++ input.filter(_ <= 0)
}


// Exercise 5
def mean(inArray: Array[Double]): Double ={
  inArray.sum / inArray.size
}


// Exercise 6
val a = Array(3,4,6,-2,1,-2,7,-4,3,7,1,1,6,-5)
a.sortWith(_ > _)

val b = ArrayBuffer(3,4,6,1,7)
b.sorted.reverse


// Exercise 7
a.distinct

// Exercise 8
/*
Rewrite the example at the end of Section 3.4, “Transforming Arrays,” on page 32.
Collect indexes of the negative elements, reverse the sequence, drop the last index, and call a.remove(i) for each index.
Compare the efficiency of this approach with the two approaches in Section 3.4.

var first = true
val indexes = for (i <- 0 until a.length if first || a(i) >= 0) yield {
if (a(i) < 0) first = false; i }

for (j <- 0 until indexes.length) a(j) = a(indexes(j))
  a.trimEnd(a.length - indexes.length)
 */
val a2 = ArrayBuffer(3,4,6,-2,1,-2,7,-4,3,7,1,1,6,-5)


val negIndexes = for (i <- 0 until a2.length if a2(i) < 0) yield i
val removed = negIndexes.reverse.dropRight(1).foreach(a2.remove(_))
a2

// Exercise 9
val times = java.util.TimeZone.getAvailableIDs
  .filter(_.startsWith("America/"))
  .map(_.stripPrefix("America/"))


// Exercise 10

val flavors = SystemFlavorMap.getDefaultFlavorMap().asInstanceOf[SystemFlavorMap]

val javaList = flavors.getNativesForFlavor(DataFlavor.imageFlavor).toBuffer

