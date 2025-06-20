////      Case 1     ////
/*fun main() {
    birthdayGreeting()
}

fun birthdayGreeting() {
    println("Happy Birthday, Fahim!")
    println("You are now 23 years old!")
}*/




////     Case 2    ////
/*fun sayHello(name: String, age: Int) {
    var number = age
    println("Hello, I am $name! I am $age years old")
    println()
}

fun getData(data: String){
    println("I have $data value")
}

fun showMessage(){
    println("There is No Internet")
}

//Main Function
fun main(args: Array<String>) {
    sayHello( "Fahim", 23)

    val Internet = true
    if(Internet){
        getData( " 8 TB")
    }
    else{
        showMessage()
    }
}*/




////     Case 3    ////
/*fun main() {
    println(birthdayGreeting())
}
fun birthdayGreeting(): String {
    val nameGreeting = "Happy Birthday, Fahim!"
    val ageGreeting = "You are now 23 years old!"
    return "$nameGreeting\n $ageGreeting"
}*/


//  (Function with multiple parameters)
/*fun main() {
    println(birthdayGreeting("Rover", 5))
    println(birthdayGreeting("Rex", 2))
}
fun birthdayGreeting(name: String, age: Int): String {
    val nameGreeting = "Happy Birthday, $name!"
    val ageGreeting = "You are now $age years old!"
    return "$nameGreeting\n$ageGreeting"
}*/





////    Case 4    ////    (default argument)
/*fun birthdayGreeting(name: String = "Rover", age: Int): String {
    return "Happy Birthday, $name! You are now $age years old!"
}
fun main(){
    println(birthdayGreeting(age = 5))
    println(birthdayGreeting("Rex", 2))
}*/



////     Case 5     ////   (Default Values)
fun main(){
    sendMessage(
        name = "Fahim"
    )
}
fun sendMessage(name: String, message: String = sendText()){
    println("Name = $name and Message = $message")
}
fun sendText() = "Hello!"