package com.scala.examples

object fibonacci {

  def main(args: Array[String]) {
    println(fib3(10)) //calling the function fib3,passing an argument
    (0 to 10).foreach((x: Int) => print(fib3(x) + " ")) //similar as above but passing a value with loop increment
    println //newline
    println(fib(0, 1)) //another approach for calculating the series 
  }

  def fib3(n: Int): Int = { //takes integer and returns integer 

    def fib_tail(n: Int, a: Int, b: Int): Int = n match { //function inside a function taking           
      case 0 => a
      case _ => fib_tail(n - 1, b, a + b)
    }
    return fib_tail(n, 0, 1)
  }

  def fib(prevPrev: Int, prev: Int) {
    val next = prevPrev + prev
    if (next <= 1) {
      println(0)
      println(1)
    }
    println(next)
    if (next > 1000) System.exit(0)
    fib(prev, next)
  }
}