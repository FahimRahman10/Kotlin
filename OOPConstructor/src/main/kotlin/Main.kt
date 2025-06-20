/*fun main(args: Array<String>) {
    val user = User("Fahim", "Afridi", 23)
    val friend = User("Andra", "Smith", 24)
    println("Name ${user.name}")
    println("Name ${friend.name}")
    println("LastName ${user.lastName}")
}

class User(var name: String, var lastName: String, var age: Int){
    //var name: String

    init {
        if (name.lowercase().startsWith("a")){
            this.name = name
        }
        else{
            this.name = "User"
            println("the name doesnt start with the letter 'a' or 'A'")
        }
    }
}*/


//   Secondary Constructor
/*fun main(){
    val user = User("Alex")
    val friend = User("John", "Smith")

    println("Name = ${user.name}")
    println("LastName = ${user.lastName}")
    println("Age = ${user.age}")

    println("\n")

    println("Name = ${friend.name}")
    println("LastName = ${friend.lastName}")
    println("Age = ${friend.age}")
}

class User(var name: String, var lastName: String, var age: Int){

    constructor(name: String) : this(name, "Farguson", 18){
        println("2nd")
    }

    constructor(name: String, lastName: String) : this(name, lastName, 22){
        println("3rd")
    }

}*/


/*fun main(){
    val user = User()
    val friend = User("John", "Smith")

    println("Name = ${user.name}")
    println("LastName = ${user.lastName}")
    println("Age = ${user.age}")

    println("\n")

    println("Name = ${friend.name}")
    println("LastName = ${friend.lastName}")
    println("Age = ${friend.age}")
}

class User(var name: String = "Fahim", var lastName: String = "Afridi", var age: Int = 23)*/




//  (Getter and Setter)
fun main(){
    val user = User("Alex")
    val friend = User("John", "Smith")

    println("Name = ${user.firstName}")
    println("LastName = ${user.lastName}")
    println("Age = ${user.age}")

    println("\n")

    println("Name = ${friend.firstName}")
    println("LastName = ${friend.lastName}")
    println("Age = ${friend.age}")
}

class User(firstName: String, var lastName: String = "Afridi", var age: Int = 23){
    var firstName = firstName

        get() = field
        set(value) {
            field = value
        }


        //  (Alnernative)
        /*get() {
            return "Firstname: $field"
        }
        set(value) {
            println("$value was assigned to firstName Property")
            field = value
        }*/
}


















