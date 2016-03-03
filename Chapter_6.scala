/**
 * Created by patrick on 3/2/16.
 */

// Exercise 1
object Conversions {
  def inchesToCentimeters(input: Double) = {input * 2.54}
  def gallonsToLiters(input: Double) = {input * 3.78541}
  def milesToKilometers(input: Double) = {input * 1.60934}
}

// Exercise 2
abstract class UnitConversion(mult: Double) {
  def main(input: Double): Double = input * mult
}

object inchesToCentimeters extends UnitConversion(2.54)
object gallonsToLiters extends UnitConversion(3.78541)
object milesToKilometers extends UnitConversion(1.60934)
