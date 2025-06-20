/*fun main(args: Array<String>) {
    val user = User()

    user.favouriteMovie = "Avengers"
    println(user.favouriteMovie)
}

class User(){
    lateinit var favouriteMovie: String
}*/



//   (With Object)
/*fun main(){
    val calculator = Calculator()
    val result = calculator.sum(5, 10)
    println(result)
}

class Calculator{
    fun sum(a: Int, b:Int) = a + b
    }*/



//   (Without Object)
/*fun main(){
    val result = Calculator.sum(5, 10)
    println(result)
}

class Calculator(){
    companion object{
        fun sum(a: Int, b:Int) = a + b
    }
}*/


/////      (  Singleton  )     /////
/*fun main(){
    val instance = Database.getInstance()
    val instance2 = Database.getInstance()
    println(instance)
    println(instance2)
}

class Database private constructor(){
    companion object{
        private var instance: Database? = null
        fun getInstance() : Database?{
            if (instance == null){
                instance = Database()
            }

            return instance
        }
    }
}*/



/////     (  Using Object Keyword  )    /////
/*fun main(){
    println(Database)
    println(Database)
    println(Database)
}

object Database{
    init {
        println("Database Created")
    }
}*/



/////   ( Lazy Initialization  )   /////
fun main(){
    val user1 = User("Alex", "Smith", 23)
    val user2 by lazy {
        User("Fahim", "Afridi", 24)
    }
    println(user2.firstName)
}

class User(var firstName: String, var lastName: String, var age: Int){
    init {
        println("User $firstName was created" )
    }
}
