/////     Case 1 (List)     /////
/*fun main(args: Array<String>) {
    val names = mutableListOf("NAME 1", "NAME 2", "NAME 3", "NAME 2")

    names.add("NAME 4")
    names.removeAt(0)
    names.remove("NAME 3")

    names.forEach { println(it) }
}*/
// List allow duplicates




/////     Case 2 (Set)    /////
/*fun main(){
    val names = mutableSetOf<String>("NAME 1", "NAME 2", "NAME 3", "NAME 2")
    names.add("NAME 4")

    names.forEach { println(it) }
}*/
// Set dont allow duplicates




/////     Case 3 (Set)    /////
/*
fun main(){
    val user1 = User("Fahim Afridi")
    val user2 = User("Fahim BigBoss")
    val user3 = User("Fahim Rahman")
    val user4 = User("Fahim IIT")
    val user5 = User("Fahim JU")
    val user6 = User("Fahim Dhaka")
    val user7 = User("Fahim 10")
    val user8 = User("Fahim 10")

    val names = mutableSetOf<User>(user1, user2, user3, user4, user5, user6, user7, user8)

    names.forEach { println(it.name) }
}

//class User(val name: String)
data class User(val name: String)*/




/////     Case 4 (Map)    /////
/*fun main(){
    val users = mutableMapOf<Int, String>(1 to "Fahim", 2 to "Afridi", 3 to "BigBoss")

    users[5] = "Rahman"
    users.remove(1)
    users.replace(2, "IIT")

    users.forEach { t, u ->
        println("$t and $u")
    }

    println(users[1])
    println(users[2])
    println(users[3])
}*/




/////     Case 5 (Mapping)    /////
fun main(){
    val numbers = setOf(1, 2, 3, 4, 5)

    //println(numbers.map { it * 10 })
    //println(numbers.map { if (it == 3) it * 100 else it * 10 })
    //println(numbers.map { if (it == 3) it * 100 else if (it%2 == 0) it * 10 else it * 50})

    val numbersMap = mapOf("KeyChain 1" to 1, "KeyChain 2" to 2, "KeyChain 3" to 3, "KeyChain 4" to 4)

    println(numbersMap.mapKeys { it.key.uppercase() })
    println(numbersMap.mapKeys { it.key.lowercase() })
    println(numbersMap.mapValues { it.value })
    println(numbersMap.mapValues { it.key.length })
    println(numbersMap.mapValues { it.value + it.key.length })

    println(numbers.mapIndexedNotNull { index, value -> if (index == 0) null else index * value })

    // zipping
    val colors = listOf("red", "yellow", "gold")
    val animals = listOf("tiger", "lion", "wolf")
    println(colors zip animals)
    println(colors.zip(animals){color, animal-> "The ${animal} is $color"})
    println(colors.zip(animals){color, animal-> "The ${animal.replaceFirstChar{it.uppercase()}} is $color"})

    // Unzipping
    val numberPairs = listOf("One" to 1, "two" to 2, "three" to 3, "four" to 4)
    println(numberPairs)
    println(numberPairs.unzip())
}




