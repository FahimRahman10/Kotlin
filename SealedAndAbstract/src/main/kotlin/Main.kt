/*
fun main(args: Array<String>) {
    val success = Result.Success("SUCCESS!")
    val progress = Result.Progress("PROGRESS!")
    val error1 = Result.Error.RecoverableError("ERROR 1")
    val error2 = Result.Error.NonRecoverableError("ERROR 2")

    getData(success)
    getData(progress)
    getData(error1)
    getData(error2)
}

fun getData(result: Result){
    when (result){
        is Result.Success -> result.showMessage()
        is Result.Progress -> result.showMessage()
        is Result.Error.NonRecoverableError -> result.showMessage()
        is Result.Error.RecoverableError -> result.showMessage()
    }
}

sealed class Result(val message: String){
    fun showMessage(){
        println("Result = $message")
    }
    class Success(message: String): Result(message)
    class Progress(message: String): Result(message)
    sealed class Error(message: String): Result(message){
        class RecoverableError(*/
/*exception: Exception,*//*
 message: String): Error(message)
        class NonRecoverableError(*/
/*exception: Exception,*//*
 message: String): Error(message)
    }
}*/





/////     ( Abstract class )    /////
fun main(args: Array<String>) {
    val eng = Engineer("Fahim",3)
    eng.employeeDetails()
    eng.dateOfBirth("18 March 2000")
}

abstract class Employee(val name: String,val experience: Int) {                        // Non-Abstract Property
    abstract var salary: Double                                                        // Abstract Property (Must be overridden by Subclasses)
    abstract fun dateOfBirth(date:String)                                              // Abstract Methods (Must be implemented by Subclasses)
    fun employeeDetails() {                                                            // Non-Abstract Method
        println("Name of the employee: $name")
        println("Experience in years: $experience")
        println("Annual Salary: $salary")
    }
}

class Engineer(name: String,experience: Int) : Employee(name,experience) {             // derived class
    override var salary = 500000.00
    override fun dateOfBirth(date:String){
        println("Date of Birth is: $date")
    }
}




/*
fun main(args: Array<String>) {
    val eng = Engineer("Praveen",2, "18 March 2000")
    eng.employeeDetails()
}

abstract class Employee(val name: String,val experience: Int, val dateOfBirth: String) {
    abstract var salary: Double
    fun employeeDetails() {
        println("Name of the employee: $name")
        println("Experience in years: $experience")
        println("Annual Salary: $salary")
        println("Date of Birth is: $dateOfBirth")
    }
}

class Engineer(name: String, experience: Int, dateOfBirth: String) : Employee(name,experience,dateOfBirth) {
    override var salary = 500000.00
}
*/











