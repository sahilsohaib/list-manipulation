object ListOperations {
  def main(args: Array[String]): Unit = {
    val numbers = List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)

    // Use map to double each number
    val doubledNumbers = numbers.map(_ * 2)
    println(s"Doubled Numbers: $doubledNumbers")

    // Use flatMap to create a list of pairs for each number
    val numberPairs = numbers.flatMap(x => List((x, x * 2)))
    println(s"Number Pairs: $numberPairs")

    // Use foldLeft to calculate the sum of all numbers
    val sum = numbers.foldLeft(0)(_ + _)
    println(s"Sum of Numbers: $sum")

    // Use filter to select only even numbers
    val evenNumbers = numbers.filter(_ % 2 == 0)
    println(s"Even Numbers: $evenNumbers")
  }
}
