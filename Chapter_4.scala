/**
 * Created by patrick on 2/2/16.
 */

import scala.collection.mutable._


// Exercise 1
val gizmos = Map("Game" -> 60.00, "AppleTV" -> 200.00, "Kindle" -> 120.00)
val discounted = for ((k,v) <- gizmos) yield (k,v*.9)


// Exercise 2
var wordCount = Map[String, Int]()
val in = new java.util.Scanner(new java.io.File("/Users/patrick/IdeaProjects/Scala/Impatient/myfile.txt"))
while (in.hasNext()) {
  val word = in.next().toLowerCase
  if (wordCount.contains(word))
    wordCount(word) += 1
  else
    wordCount(word) = 1
}
wordCount

// Exercise 3
var freq = new scala.collection.immutable.HashMap[String, Int]

val in2 = new java.util.Scanner(new java.io.File("/Users/patrick/IdeaProjects/Scala/Impatient/myfile.txt"))
while (in2.hasNext()) {
  val word = in2.next().toLowerCase
  freq = freq + (word -> (freq.getOrElse(word, 0) + 1))
}
freq

// Exercise 4
var sorted = new scala.collection.immutable.TreeMap[String, Int]

val in3 = new java.util.Scanner(new java.io.File("/Users/patrick/IdeaProjects/Scala/Impatient/myfile.txt"))
while (in3.hasNext()) {
  val word = in3.next().toLowerCase
  sorted = sorted + (word -> (sorted.getOrElse(word, 0) + 1))
}
sorted


// Exercise 8
val test = Array(1,5,3,2,3,6,9,-1,-3)

def minmax(values: Array[Int]): Tuple2[Int, Int] = {
  (values.max, values.min)
}

minmax(test)

// Exercise 9
def lteqgt(values: Array[Int], v: Int): Tuple3[Int, Int, Int] = {
  val lt = values.filter(_ < v).length
  val eq = values.filter(_ == v).length
  val gt = values.filter(_ > v).length
  (lt, eq, gt)
}

lteqgt(test,2)

// Exercise 10
/*
Zips them together into (c,c) tuples based on character indexes, the entire array truncated by whichever of the strings is shortest
Maybe useful for spelling difference detection (i.e. if one character in a string is often replaced by another)?
 */