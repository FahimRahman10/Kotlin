/////      Case 1 (Object Declaration)     /////

/*fun main(args: Array<String>) {
    val result: Int = Test.makeMe12()

    println("a = ${Test.a}")
    println("b = ${Test.b}")
    println("result = $result")
}

object Test {
    var a : Int = 20
    val b : Int = 8

    fun makeMe12(): Int {
        a = 12
        return a
    }
}*/




/////      Case 2 (Object Expression)     /////
/*fun main(args: Array<String>) {
    val individual = object : Person() {
        override fun pray() = println("I am Fahim. I am 23 years old. I pray to Allah.")
    }
    individual.eat()
    individual.talk()
    individual.pray()
}

open class Person() {
    fun eat() = println("Eating food.")
    fun talk() = println("Talking with people.")
    open fun pray() = println("Pray to Allah.")
}*/



/////      Case 3 (Object Expression2)     /////
/*fun main(args: Array<String>) {
    val individual = object : Person("Fahim", 23) {
        override fun pray() = println("I am Fahim. I am 23 years old. I pray to Allah.")
    }
    individual.eat()
    individual.talk()
    individual.pray()
}

open class Person(name: String, age: Int) {
    init {
        println("name: $name, age: $age")
    }
    fun eat() = println("Eating food.")
    fun talk() = println("Talking with people.")
    open fun pray() = println("Praying god.")
}*/




/////      Case 4 (OOP Delegation)      /////
fun main(args: Array<String>) {
    val person = Person(JackName(), LongDistanceRunner())
    println(person.name)
    person.run()
}

interface Nameable {
    var name: String
}

class JackName : Nameable {
    override var name: String = "Fahim"
}

class LongDistanceRunner: Runnable {
    override fun run() {
        println("Long run")
    }
}

class Person(name: Nameable, runner: Runnable): Nameable by name, Runnable by runner












/*import kotlin.reflect.KProperty

/////     ( Object Expression )     /////
*//*fun main(args: Array<String>) {
    val loginButton = Button("Login", 1326, object: OnClickListener{
        override fun onClick() {

        }
    })
    val signUpButton = Button("Sign Up", 1453, object: OnClickListener{
        override fun onClick() {

        }
    })
}

class Button(val text: String, val ID: Int, onClickListener: OnClickListener)

class ClickListener(): OnClickListener {
    override fun onClick(){

    }
}

interface OnClickListener{
    fun onClick()
}*//*





/////    ( OOP Delegation )    /////
fun main(){
    val user = User()
    with(user){
        firstName = "Fahim"
        lastName = "Afridi"
    }
    with(user){
        println(firstName)
        println(lastName)
    }
}

*//*class App: A by FirstDelegate(), B by SecondDelegate{
    override fun print() {

    }

    override fun print2() {

    }
}

interface A{
    fun print()
}

interface B{
    fun print2()
}

open class FirstDelegate: A{
    override fun print() {

    }
}

open class SecondDelegate: B{
    override fun print2() {

    }
}*//*

class User{
    var firstName by FormatDelegate()
    var lastName by FormatDelegate()
}

class FormatDelegate: readWriteProperty<Any?, String> {
    var formattedString: String = " "

    override fun getValue(
        thisRef: Any?,
        property: KProperty<*>
    ): String{
        return formattedString
    }

    override fun setValue(
        thisRef: Any?,
        property: KProperty<*>
        value: String
    ){
        formattedString = value.lowercase()
    }
}*/