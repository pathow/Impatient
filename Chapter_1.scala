/**
 * Created by patrick on 8/29/15.
 */

/*
Question 1
%   +   >    >>>            isInstanceOf   toDouble   toLong     unary_+   |
&   -   >=   ^              toByte         toFloat    toShort    unary_-
  *   /   >>   asInstanceOf   toChar         toInt      toString   unary_~
*/

/*
Question 2
scala> sqrt(3)
res21: Double = 1.7320508075688772

scala> pow(res21, 2)
res22: Double = 2.9999999999999996

16th digit is off in the approximation that comes from being a "Double" type
*/

/*
Question 3
res values are val, and unable to be reassigned
*/

/*
Question 4
It repeats the string n times
  scala> "crazy"*3
res23: String = crazycrazycrazy

Found under StringOps in the ScalaDoc:
def *(n: Int): String
Return the current string concatenated n times.
*/

/*
Question 5
It finds the maximum of the two numbers, and is found in the ScalaDoc under scala.math, as a modification under the Numeric type
def max(x: T, y: T): T
Return x if x >= y, otherwise y.
*/

/*
Question 6
BigInt(2) pow 1024
res2: scala.math.BigInt = 179769313486231590772930519078902473361797697894230657273430081157732675805500963132708477322407536021120113879871393357658789768814416622492847430639474124377767893424865485276302219601246094119453082952085005768838150682342462881473913110540827237163350510684586298239947245938479716304835356329624224137216
*/

/*
Question 7
Need to import BigInt and util:
  scala> import BigInt._
import BigInt._

scala> import util._
import util._

scala> probablePrime(100, Random)
res3: scala.math.BigInt = 980864433879241413062547192319
*/

/*
Question 8
scala> probablePrime(100, Random).toString(36)
res7: String = 2hcdto11q85x83466i7n

The probable Prime makes a random BigInt, and toString(36) converts it to base 36
*/

/*
Question 9
.head finds the first character of a string, .last finds the last one
scala> "Hello".head
res8: Char = H
scala> "Hello".last
res10: Char = o
*/

/*
Question 10
scala> "Hello".take(2)
res12: String = He

scala> "Hello".drop(2)
res13: String = llo

scala> "Hello".takeRight(2)
res14: String = lo

scala> "Hello".dropRight(2)
res15: String = Hel

.substring gives more option in double arguments for selecting the middle of a string (i.e. "Hello".substring(2,4) gives "ll"),
however, in its single argument form it does the same as take, but is maybe slightly less intuitive
*/

