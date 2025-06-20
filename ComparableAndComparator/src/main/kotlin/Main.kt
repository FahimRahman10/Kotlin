/*
fun main(args: Array<String>) {
    val numbers = mutableListOf<Int>(21, 15, 26, 39, 18, 45, 27)
    numbers.sorted().forEach { print("${it}\t") }

    val Laptops = mutableListOf(
        Laptop("Asus", 2021, 32, 1600),
        Laptop("HP", 2022, 12, 800),
        Laptop("Apple", 2023, 16, 1200)
    )
    println()
    Laptops.sorted().forEach { println(it) }
    println()
    Laptops.sortedWith(ComparatorYear()).forEach { println(it) }
    println()
    Laptops.sortedWith(ComparatorRam()).forEach { println(it) }
}

data class Laptop(val brand: String, val year: Int, val ram: Int, val price: Int) : Comparable<Laptop>{
    override fun compareTo(other: Laptop): Int {
        return if (this.price > other.price){
            println("In if statement: Swapping ${this.brand} with ${other.brand}")
            1
        } else if (this.price < other.price){
            println("In if statement: Swapping ${other.brand} with ${this.brand}")
            -1
        } else{
            0
        }
    }
}

class ComparatorRam : Comparator<Laptop> {
    override fun compare(Laptop1: Laptop, Laptop2: Laptop): Int {
        return if (Laptop1.ram > Laptop2.ram){
            return 1
        } else if (Laptop1.ram < Laptop2.ram){
            return -1
        } else{
            return 0
        }
    }
}

class ComparatorYear : Comparator<Laptop> {
    override fun compare(Laptop1: Laptop, Laptop2: Laptop): Int {
        return if (Laptop1.year > Laptop2.year){
            return 1
        } else if (Laptop1.year < Laptop2.year){
            return -1
        } else{
            return 0
        }
    }
}
*/



/////     Alnernative    /////
fun main() {
    val Laptops = mutableListOf(
        Laptop("Asus", 2021, 32, 1600),
        Laptop("HP", 2022, 12, 800),
        Laptop("Apple", 2023, 16, 1200)
    )

/*    println()
    Laptops.sortedWith(compareBy { it.price }). forEach { println(it) }
    println()
    Laptops.sortedWith(compareBy { it.year }). forEach { println(it) }
    println()
    Laptops.sortedWith(compareBy { it.ram }). forEach { println(it) }*/

    println()
    Laptops.sortedBy { it.price }.forEach { println(it) }
    println()
    Laptops.sortedBy { it.year }.forEach { println(it) }
    println()
    Laptops.sortedBy { it.ram }.forEach { println(it) }
    println()
    Laptops.sortedWith(compareBy<Laptop> { it.year }.thenBy { it.price }).forEach { println(it) }
}

data class Laptop(val brand: String, val year: Int, val ram: Int, val price: Int)