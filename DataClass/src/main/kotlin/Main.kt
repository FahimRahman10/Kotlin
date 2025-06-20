/////   Case 1 (Equality Operator)  /////
/*fun main() {
    val name1 = "Fahim"
    val name2 = "Fahim"
    val name3 = "Afridi"

    println(name1 == name2)
    println(name2 == name3)
    println(name1 == name3)
}*/




/////   Case 2 (Reference Equality Operator)   /////
/*fun main(){
    val person1 = Person("BigBoss", 23)
    val person2 = Person("BigBoss", 23)
    val person3 = person1

    println(person1 === person2)
    println(person2 === person3)
    println(person1 === person3)
}

class Person(val name: String, val age: Int)*/




/////   Case 3 (Data class)   /////
/* fun main(args: Array<String>) {
    val jack = User("Fahim", 23)
    println("name = ${jack.name}")
    println("age = ${jack.age}")
}

data class User(val name: String, val age: Int)*/




/////   Case 4  (copy() function)  /////
/*fun main(args: Array<String>) {
    val u1 = User("Fahim", 23)
    // using copy function to create an object
    val u2 = u1.copy("Afridi")

    println("u1: name = ${u1.name}, name = ${u1.age}")
    println("u2: name = ${u2.name}, name = ${u2.age}")
}

data class User(val name: String, val age: Int)*/




/////   Case 5  (toString() function)   /////
/*fun main(args: Array<String>) {
    val u1 = User("Fahim", 23)
    val u2 = User("Afridi", 24)
    println(u1.toString())
    println(u2.toString())
}

data class User(val name: String, val age: Int)*/




/////   Case 6  (componentN() functions)   /////
/*fun main(args: Array<String>) {
    val u1 = User("Fahim Afridi", 23, "Male")
    println(u1.component1())
    println(u1.component2())
    println(u1.component3())
}

data class User(val name: String, val age: Int, val gender: String)*/





/////   Case 7  (hashCode() and equals())   /////
data class User(val name: String, val age: Int)

fun main(args: Array<String>) {
    val u1 = User("Fahim", 23)
    val u2 = u1.copy()
    val u3 = u1.copy(name = "Afridi")

    println("${u1.name} and ${u1.age}")
    println("${u2.name} and ${u2.age}")
    println("${u3.name} and ${u3.age}")

    println("\nu1 hashcode = ${u1.hashCode()}")
    println("u2 hashcode = ${u2.hashCode()}")
    println("u3 hashcode = ${u3.hashCode()}")
    println("u1 & u2 has same hashcode\n")

    if (u1.equals(u2) == true)
        println("u1 is equal to u2.")
    else
        println("u1 is not equal to u2.")

    if (u1.equals(u3) == true)
        println("u1 is equal to u3.")
    else
        println("u1 is not equal to u3.")
}







