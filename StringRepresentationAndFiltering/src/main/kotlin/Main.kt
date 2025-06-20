/////     Case 1 (Plus and Minus Operator)     /////
/*fun main(){
    val numbers = mutableListOf("one", "two", "three", "four")
    //numbers.add("five")
    val plusList = numbers + "five"
    val minusList = numbers - mutableListOf("three", "four")

    println(plusList)
    println(minusList)
}*/




/////     Case 2 (Grouping)     /////
/*fun main(){
    val numbers = listOf("one", "two", "three", "four", "five")
    println(numbers.groupBy {it})
    println(numbers.groupBy { it.first().uppercase() })
    println(numbers.groupBy { it.last().uppercase() })
    println(numbers.groupBy(keySelector = { it.first() }))
    println(numbers.groupBy(keySelector = { it.first().uppercase() }, valueTransform = { it.uppercase() }))
}*/




/////     Case 3 (String Representation)     /////
/*
fun main(args: Array<String>) {
    val numberStrings = listOf("fahim", "rahman", "afridi", "bigboss")
    println(numberStrings)
    println(numberStrings.joinToString())

    val listString = StringBuffer("The list of numbers: ")
    println(numberStrings.joinTo(listString))

    println(numberStrings.joinToString(separator = " | ", prefix = "Start: ", postfix = ": end"))

    val numbers = (1..20).toList()
    println(numbers)
    println(numbers.joinToString(limit = 15, truncated = " <......> "))

    println(numberStrings.joinToString { "Element: ${it.uppercase()}" })
}
*/




/////     Case 4 (Filtering)     /////
fun main(){
    val numbers = listOf("one", "two", "three", "four")
    val longerthan3 = numbers.filter { it.length > 3 }
    println(longerthan3)

    val numbersMap = mapOf("key 1" to 1, "key 2" to 2, "key 3" to 3, "key 101" to 101)
    val filterMap = numbersMap.filter { it.key.endsWith(suffix = "1") && it.value > 100 }
    println(filterMap)

    val filteredIndex = numbers.filterIndexed { index, value -> (index != 0) && (value.length < 5) }
    val filteredNot = numbers.filterNot { it.length <= 3 }
    println(filteredIndex)
    println(filteredNot)

    val mixedList = listOf(1, 2, 3, 'A', 'B', 'C', "Fahim", "Afridi", false)
    mixedList.filterIsInstance<Char>().forEach{
        println(it)
    }
    mixedList.filterIsInstance<Int>().forEach(){
        println(it)
    }
    mixedList.filterIsInstance<String>().forEach(){
        println(it)
    }
    mixedList.filterIsInstance<Boolean>().forEach(){
        println(it)
    }


    //  Partition
    val (match, rest) = numbers.partition { it.length > 3 }
    println()
    println(match)
    println(rest)
    println(numbers.any { it.startsWith(prefix = "a") })
    println(numbers.any { it.endsWith(suffix = "e") })
    println(numbers.none { it.startsWith(prefix = "b") })
    println(numbers.none { it.endsWith(suffix = "w")})
    println(numbers.all { it.length > 2 })
    println(numbers.all { it.length %2 == 0 })
}















