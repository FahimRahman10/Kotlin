fun main(args: Array<String>) {
    val number1 = listOf("one", "two", "three", "four", "five", "six")
    println(number1.slice(1..3))              // [two, three, four]
    println(number1.slice(0..4 step 2))       // [one, three, five]
    println(number1.slice(setOf(3, 5, 0)))                 // [four, six, one]


    println()
    println(number1.take(3))                            // [one, two, three]
    println(number1.takeLast(3))                        // [four, five, six]
    println(number1.drop(2))                            // [three, four, five, six]
    println(number1.dropLast(4))                        // [one, two]


    println()
    println(number1.takeWhile { !it.startsWith(prefix = "f") })         // [one, two, three]
    println(number1.takeWhile { it != "three" })                        // [one, two]
    println(number1.takeLastWhile { it != "three" })                    // [four, five, six]
    println(number1.dropWhile { it.length == 3 })                       // [three, four, five, six]
    println(number1.dropLastWhile { it.contains("i") })           // [one, two, three, four]


    val number2 = listOf("one", "two", "three", "four", "five", "six")
    println()
    println(number2.windowed(2))        // [[one, two], [two, three], [three, four], [four, five], [five, six]]
    println(number2.windowed(4))        // [[one, two, three, four], [two, three, four, five], [three, four, five, six]]
    println(number2.windowed(6))        // [[one, two, three, four, five, six]]



    val number3 = (0..13).toList()
    println()
    println(number3.chunked(3))                     // [[0, 1, 2], [3, 4, 5], [6, 7, 8], [9, 10, 11], [12, 13]]
    println(number3.chunked(5))                     // [[0, 1, 2, 3, 4], [5, 6, 7, 8, 9], [10, 11, 12, 13]]
    println(number3.chunked(3) { it.sum() })        // [3, 12, 21, 30, 25]



    val number4 = listOf("one", "two", "three", "four", "five", "six")
    println()
    println(number4.first())                                // one
    println(number4.last())                                 // six
    println(number4.elementAt(4))                     // five


    println()
    println(number4.first{ it.length > 3 })                 // three
    println(number4.last{ it.length > 3 })                  // five
    println(number4.first { it.startsWith("t") })     // two
    println(number4.last { it.startsWith("f") })      // five
    println(number4.random())                               // *random*
    println(number4.isEmpty())                              // false
    println("${!(number4.isEmpty())}")                      // true


    val number5 = listOf(4, 6, 10, 14, 26)
    println()
    println("The sum is: ${(number5.sum())}")                   // The sum is: 60
    println("The sum is: ${(number5.sumOf { it * 2 })}")        // The sum is: 120
    println("the count is: ${number5.count()}")                 // the count is: 5
    println("the average is: ${number5.average()}")             // the average is: 12.0
    println("The max value is: ${number5.maxOrNull()}")         // The max value is: 26
    println("The min value is: ${number5.minOrNull()}")         // The min value is: 4


}











