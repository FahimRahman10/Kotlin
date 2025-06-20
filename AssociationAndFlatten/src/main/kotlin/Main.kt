/////     Case 1 (Association)    /////
/*fun main(args: Array<String>) {
    val numbers = listOf("one", "two", "three", "four")
    println(numbers.associateWith { it.length })
    println(numbers.associateBy { it.first().uppercase() })
    println(numbers.associateBy(keySelector = { it.first().uppercase() }, valueTransform = { it.length }))
}*/




/////      Case 2 (Flatten)    /////
/*
fun main(){
    val numberSets = arrayOf(arrayOf(1, 2, 3), arrayOf(4, 5, 6), arrayOf(7, 8, 9))
    println(numberSets[0][0])         // 2D Array
    println(numberSets[0][1])
    println(numberSets[0][2])
    println(numberSets[1][0])
    println(numberSets[1][1])
    println(numberSets[1][2])
    println(numberSets[2][0])
    println(numberSets[2][1])
    println(numberSets[2][2])
}
*/



/////      Case 3 (Flatten)    /////
fun main(){
    val numberSets = listOf(setOf(1, 2, 3), setOf(4, 5, 6), setOf(7, 8, 9))
/*    for (numbers in numberSets){            //numberSets = 1, 2, 3, 4, 5, 6, 7, 8, 9
        for (number in numbers){                //numbers = 1, 2, 3
            println(number)                         //number = 1
        }
        println()
    }*/

    val numberFlatten = numberSets.flatten()
    println("Ans is ${numberFlatten[7]}")
    for (number in numberFlatten)
        println(number)
}









