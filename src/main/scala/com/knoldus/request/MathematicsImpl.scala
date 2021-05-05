package com.knoldus.request

class MathematicsImpl {
  def divide(num1: Double, num2: Double): Double = num1 / num2

  def fibonacci(num: Long): Long = num match {
    case neg if num < 0 => 0
    case 0 | 1 => num
    case _ => fibonacci(num - 1) + fibonacci(num - 2)
  }
}
