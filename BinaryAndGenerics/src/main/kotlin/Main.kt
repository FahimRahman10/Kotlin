/////      Case 1 (Linear Search)     /////
/*fun main(args: Array<String>) {
    println(SearchElement(27, mutableListOf(11,24,33,16,11,32,54,27,21,76,32,45,31,40)))
}

private fun SearchElement(searchedElement: Int, numbers: MutableList<Int>) : Int{
    var i = 0
    for (number in numbers){
        i++
        println("Searched Number: $number")
        if (number == searchedElement){
            return number
        }
    }
    return -1
}*/



/////      Case 2 (Binary Search)     /////
/*
fun main() {
    println(Element(6, mutableListOf(1,2,3,4,5,6,7,8,9)))
}

private fun Element(SearchedElement: Int, numbers: MutableList<Int>) : Int {
    var low = 0
    var high = numbers.size - 1

    var i = 0
    while (low <= high){
        i++
        println("Searched number: $i")
        val mid = (low + high) / 2
        val cmp = numbers[mid].compareTo(SearchedElement)

        if (cmp < 0){
            low = mid + 1
        } else if (cmp > 0){
            low = mid -1
        } else{
            return numbers[mid]
        }
    }
    return -1
}
*/



//////     Case 3 (Binary Search)      //////
/*package main.algorithms.searching

fun main(args: Array<String>) {
    val input = readLine()!!.trim().split(" ").map { it -> it.toInt() }.toIntArray()
    val eleToSearch = readLine()!!.trim().toInt()
    val pos = binarySearchRecursive(input, eleToSearch, 0, input.size -1)
    if(pos >= 0 ) {
        println(pos)    // to print position at last
    } else {
        println("Position not found")
    }
}

fun binarySearchRecursive(input: IntArray, eleToSearch: Int, low:Int, high:Int): Int {
    while(low <=high) {
        val mid = (low + high) /2
        when {
            eleToSearch > input[mid] -> return binarySearchRecursive(input, eleToSearch, mid+1, high)   // element is greater than middle element of array, so it will be in right half. Recursion will call the right half again
            eleToSearch < input[mid] -> return binarySearchRecursive(input, eleToSearch, low, mid-1)    //element is less than middle element of array, so it will be in left half of the array. Recursion will call the left half again.
            eleToSearch == input[mid] -> return mid // element found.
        }
    }
    return -1
}*/



//////      Case 4 (Binary Search)      //////
/*fun main() {
    println(Element(1, mutableListOf(1,2,3,4,5,6,7,8,9)))
}

private fun Element(SearchedElement: Int, numbers: MutableList<Int>) = numbers[numbers.binarySearch(2)]*/




//////      Case 5 (Generics)      //////
fun main() {
    val footballPlayer = FootballPlayer("Ronaldo")
    val footballPlayer2 = FootballPlayer("neymar")

    val baseballPlayer = BaseballPlayer("Richard")
    val baseballPlayer2 = BaseballPlayer("Johnson")

    val gamesPlayer = GamesPlayer("Fahim")

    val footballTeam = Team("Afgentina", mutableListOf(footballPlayer))
    footballTeam.addPlayers(footballPlayer)
    footballTeam.addPlayers(footballPlayer2)

    val baseballTeam = Team("America", mutableListOf(baseballPlayer))
    baseballTeam.addPlayers(baseballPlayer)
    baseballTeam.addPlayers(baseballPlayer2)

    val gamesTeam= Team<GamesPlayer>("Bangladesh", mutableListOf())
    gamesTeam.addPlayers(gamesPlayer)

}

class Team<T: Player>(val name: String, val players: MutableList<T>){
    fun addPlayers(player: T){
        if (players.contains(player)){
            println("Player: ${player.name} is already in the team ${this.name}")
        } else{
            players.add(player)
            println("Player: ${player.name} was add in the team ${this.name}")
        }
    }
}

open class Player(val name: String)

class FootballPlayer(name: String): Player(name)
class BaseballPlayer(name: String): Player(name)
class GamesPlayer(name: String): Player(name)







































