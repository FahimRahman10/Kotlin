/*fun main(args: Array<String>) {
    val car = Car("BMW", "RED", 1, 4)
    val plane = Plane("Boeing", "Grey", 4, 2)

    car.move()
    car.stop()
    plane.move()
    plane.stop()
}

open class Vehicle(val name: String, val color: String){
    open fun move(){
        println("$name is moving")
    }
    open fun stop(){
        println("$name is stopped")
    }
}

class Car(name: String, color: String, val engines: Int, val doors: Int): Vehicle(name, color){
    override fun move() {
        flying()
        super.move()
    }
    fun flying(){
        println("The Car is moving")
    }

    override fun stop() {
        stopped()
        super.stop()
    }
    fun stopped(){
        println("The car has stopped")
    }
}

class Plane(name: String, color: String, val engines: Int, val doors: Int): Vehicle(name, color){
    override fun move() {
        flying()
        super.move()
    }
    fun flying(){
        println("\nThe Plane is Flying")
    }

    override fun stop() {
        stopped()
        super.stop()
    }
    fun stopped(){
        println("The plane has Stopped")
    }

}*/



/////     ( Inheritance 2 )    /////

fun main(){
    val view = View()
    val button = Button("Login", "Center")
    val roundButton = RoundButton("Sign Up", "Center", 30)

    view.draw()
    button.draw()
    roundButton.draw()
}

open class View(){
    open fun draw(){
        println("Drawing the view")
    }
}

open class Button(val text: String, val orientation: String): View(){
    override fun draw() {
        // Here is the code for creating the button
        println("Drawing the Button")
        super.draw()
    }
}

class RoundButton(text: String, orientation: String, val corner: Int): Button(text, orientation){
    override fun draw() {
        println("Drawing for Round Button")
        //super.draw()
    }
}










