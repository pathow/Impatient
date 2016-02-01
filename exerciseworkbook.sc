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

for (i <- test.indices) yield { if (i % 2 == 1) test(i-1) else if (i+1 <= test.length-1) test(i+1) else test(i)}
