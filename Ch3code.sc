val nums = new Array[Int](10)
val a = new Array[String](10)
val s = Array("Hello", "World")
s(0) = "Goodbye"
s

import scala.collection.mutable.ArrayBuffer

val b = ArrayBuffer[Int]()
b += 1
b += (1,2,3,5)
b ++= Array(8, 13, 21)

b.trimEnd(5)
b.insert(2, 6)
b.insert(2, 7, 8, 9)
b.remove(2)
b.remove(2, 3)

b.toArray
a.toBuffer

0 until 10
0 until (a.length, 2)
(a.indices).reverse

val a2 = ArrayBuffer(2,3,-4,9,-13,5,7,11)
val result = for (elem <- a2 if elem % 2 == 0) yield 2 * elem
a2 filter { _ % 2 == 0} map { 2 * _}


// Getting only first negative value, removing all others
var first = true
val indexes = for (i <- a2.indices if first || a2(i) >= 0) yield {
  if (a2(i) < 0) first = false; i
}

for (j <- indexes.indices) a2(j) = a2(indexes(j))
a2.trimEnd(a2.length - indexes.length)
a2

// Stopping point at section 3.5
Array(1,7,2,9).sum
ArrayBuffer("Mary", "had", "a", "little", "lamb").max
val b2 = ArrayBuffer(1,7,2,9)
val bSorted = b2.sorted
val bDescending = b2.sortWith(_ > _)
// sorting Arrays possible to do in place
val a3 = Array(1,7,2,9)
scala.util.Sorting.quickSort(a3)
a3
a3.mkString(" and ")
a3.mkString("<",",",">")

val matrix = Array.ofDim[Double](3,4)
matrix(1)(1) = 42
matrix
val triangle = new Array[Array[Int]](10)
for (i <- 0 until triangle.length) triangle(i) = new Array[Int](i + 1)
triangle(1)
