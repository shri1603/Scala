package com.scala.examples
import scala.annotation.tailrec

object factorial {

  def main(args: Array[String]) {
    println(factorial(5))
    println(factorial2(5))
  }

  // 1 - basic recursive factorial method
  def factorial(n: Int): Int = {
    if (n == 0)
      return 1
    else
      return n * factorial(n - 1)
  }

  // 2 - tail-recursive factorial method
  def factorial2(n: Long): Long = {
    @tailrec
    def factorialAccumulator(acc: Long, n: Long): Long = {
      if (n == 0) acc
      else factorialAccumulator(n * acc, n - 1)
    }
    factorialAccumulator(1, n)
  }

}
 