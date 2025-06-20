fun main() {

    //Case 1
    val alerm = 16
    when(alerm){
        7, 12, 23 -> println("The time is $alerm")
        in 1..10 -> println("The time is in the Range 1..10")
        in 2..20 -> println("The time is in the Range 2..20")
        else -> println("The time is $alerm")
    }

   /*/Case 2
    val mark = 7
    val text = when(mark){
        7, 12, 23 -> {
            println("The time is $mark")
        }
       /* in 1..10 -> {
            println("The time is in the Range 1..10")
        }
        in 2..20 -> {
            println("The time is in the Range 2..20")
        }*/
        else -> {
            println("The time is $mark")
        }
    }
    println(text)

    //Case 3
    val num = 33
    val text = when{
        num <= 10   -> "The time is in the Range 1..10"
        num == 8 || num == 9 -> "The time is $num"
        else -> "The time is $num"
    }
    println(text)*/


    //Case 4
    val number = 8
    val text = when(number){
        7, 12, 23 -> "The time is $number"
        in 1..10 -> "The time is in the Range 1..10"
        in 2..20 -> "The time is in the Range 2..20"
        else -> "The time is $number"
    }
    println(text)

}