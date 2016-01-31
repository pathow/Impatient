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

power(10, 3)
power(3, 4)

power(4, -4)

