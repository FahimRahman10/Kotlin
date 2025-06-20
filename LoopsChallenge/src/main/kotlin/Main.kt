fun main(args: Array<String>) {
    var number = 1
    val lastNumber = 20
    var evenNumberCounter = 0


    //  Using while loop
    while (number <= lastNumber){
        number++

        if ((number %2) != 0){
            continue
        }

        evenNumberCounter++
        print("$number\t")
    }
    println()
    println("Total number of Even is $evenNumberCounter (Using While Loop)")



    //  Using For loop
    //evenNumberCounter = 0
    for (i in 1..20){
        if ((i%2) != 0){
            continue
        }
        evenNumberCounter++
        print("$i\t")
    }
    println()
    println("Total number of Even is $evenNumberCounter (Using For Loop)")
}