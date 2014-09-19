package com.scala.examples

import scala.annotation.tailrec

object productofnumbers {

  def main(args: Array[String]) {
    val list = List.range(1, 10)
    println(product(list))
    println(product2(list))
    println(productWithReduce(list))
  }

  // (1) yields a "java.lang.StackOverflowError" with large lists
  def product(ints: List[Int]): Int = ints match {
    case Nil => 1
    case x :: tail => x * product(tail)
  }

  // (2) tail-recursive solution
   def product2(ints: List[Int]): Int = {
    @tailrec
    def productAccumulator(ints: List[Int], accum: Int): Int = {
      ints match {
        case Nil => accum
        case x :: tail => productAccumulator(tail, accum * x)
      }
    }
    productAccumulator(ints, 1)
  }

 
  def productWithReduce(ints: List[Int]) = {
    ints.reduceLeft(_ * _)
  }

}