var scores = scala.collection.mutable.Map("Alice" -> 10, "Bob" -> 3, "Cindy" -> 8)

val bobsScore = scores.getOrElse("Bob", 0)

scores("Bob") = 10

scores("Fred") = 7

scores = scores + ("Bob" -> 3, "Fred" -> 7)

scores = scores - "Alice"

scores.keySet

//reversing key/value pairs
val revScores = for ((k,v) <- scores) yield (v,k)

val sortScores = scala.collection.immutable.SortedMap("Alice" -> 10, "Fred" -> 7, "Bob" -> 3, "Cindy" -> 8)

// Skipping 4.6 since I don't work in Java

val t = (1, 3.14, "Fred")
val (first,second,third) = t


"New York".partition(_.isUpper)

val symbols = Array("<", "-", ">")
val counts = Array(2,10,2)
val pairs = symbols.zip(counts)
for ((s,n) <- pairs) Console.print(s*n)
