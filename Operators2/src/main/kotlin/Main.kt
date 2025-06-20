fun main(args: Array<String>) {

    //Case 1
    val isActive = false
    if( isActive == true)
        println("The user is active")
    else
        println("The user is inactive")


    //Case 2
    val number = 100
    if(number >= 150)
        println("Greater than 150")
    else if(number >= 99)
        println("Greater than 99")
    else if(number != 100)
        println("Not equal to 100")
    else
        println("All conditions are false")


    //Case 3
    val num1 = 6
    val num2 = -4
    if(num1 > 8 || num2 < 0)
        println("The Condition is True")
    else
        println("The Condition is False")


    //Case 4
    val num3 = 9
    val num4 = 13
    val text = if(num3 > 7 || num4 < 15)
                   "This is text 1"
               else
                   "This is text 2"
    println(text)
}