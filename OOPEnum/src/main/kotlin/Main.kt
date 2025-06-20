/////    (  OOP Enum  )    /////
/*fun main(args: Array<String>) {
    Direct.NORTH.Data()
    Direct.SOUTH.Data()
    Direct.EAST.Data()
    Direct.WEST.Data()
}

enum class Direct(var direction: String, var distance: Int){
    NORTH("northside", 10),
    SOUTH("southside", 20),
    EAST("eastside", 15),
    WEST("westside", 25);

    fun Data(){
        println(name)
        println(direction)
        println(distance)
    }
}*/




/////    (  Inner Class  )    /////
/*fun main(){
    val View = ListView(arrayOf("Fahim", "Afridi", "Rahman", "Bigboss"))

    View.ListViewItem().Item(2)
}

class ListView(val items: Array<String>){

    inner class ListViewItem(){

        fun Item(position: Int){
            println(items[position])
        }
    }
}*/



/////     (  OOP Challenge Problem  )     /////
fun main(){
    val AlexAccount = Account("Alex")
    AlexAccount.deposit(1000)
    AlexAccount.deposit(-300)
    AlexAccount.deposit(700)
    AlexAccount.withdraw(500)
    AlexAccount.withdraw(-200)
    AlexAccount.withdraw(400)

    /*val mainBalance = AlexAccount.calculatebalance()
    println("\nNow Balance is $mainBalance")*/
}

class Account(val accoutName: String){
    private var balance = 0
    private var transaction = mutableListOf<Int>()

    fun deposit(amount: Int){
        if (amount > 0){
            transaction.add(amount)
            balance += amount
            println("$amount deposited. balance is now ${this.balance}")
        }
        else{
            println("cannot deposit negative sums")
        }
    }

    fun withdraw(withdrawal: Int){
        if(withdrawal > 0){
            transaction.add(withdrawal)
            this.balance -= withdrawal
            println("$withdrawal withdrawn. balance is now ${this.balance}")
        }
        else{
            println("cannot withdraw negative sums")
        }
    }

    /*fun calculatebalance(): Int{
        //this.balance = 0
        for (transaction in transaction){
            this.balance = transaction
        }
        return this.balance
    }*/
}








