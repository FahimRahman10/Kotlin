fun main(args: Array<String>) {
    val obj = Car("BMW", "Black")

    println(obj.name)
    println(obj.color)
    obj.startEngine()
}

interface Engine{
    fun startEngine()
}

class Car(val name: String, val color: String): Engine{
    override fun startEngine() {
        println("The Car is starting the Engine.")
    }
}

class Truck(val name: String, val color: String): Engine{
    override fun startEngine() {
        println("The Truck is starting the Engine.")
    }
}

class Plane(val name: String, val color: String): Engine{
    override fun startEngine() {
        println("The Plane is starting the Engine.")
    }
}

class Tesla(val name: String, val color: String): Engine{
    override fun startEngine() {
        println("The Tesla is starting the Engine.")
    }
}
