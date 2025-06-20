class Car(var name: String, var model: String, var color: String, var doors: Int){
    /*var name = name
    var model = model
    var color = color
    var doors = doors*/

    fun move(){
        println("$name is moving")
    }
    fun stop(){
        println("$name has stopped")
    }
}