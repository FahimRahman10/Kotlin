fun main() {
    var x = 12
    var y = 7
    println("x + y = ${x + y}")
    println("x - y = ${x - y}")
    println("x * y = ${x * y}")
    println("x / y = ${x / y}")
    println("x % y = ${x % y}")

    var result = x + y
    result += 2
    println("Result1 = $result")
    result -= 2
    println("Result2 = $result")
    result *= 2
    println("Result3 = $result")
    result /= 2
    println("Result4 = $result")
    result %= 2
    println("Result5 = $result")

    println("(7+9)-(4*3) = ${(7+9)-(4*3)}")

    x = 0
    println("x = ${x++}")
    println("x = ${++x}")
    println("x = ${x}")
    println("x = ${++x}")

    y = 4
    println("y = ${--y}")
    println("y = ${y--}")
    println("y = ${y--}")
    println("y = ${--y}")



 }

/*  */
