/*fun main(args: Array<String>) {
    for (i in 1..10){
        print(i)
        print("\t")
    }
    println()
    for (i in 1 until 10){
        print(i)
        print("\t")
    }
    println()
    for (i in 10 downTo 1){
        print(i)
        print("\t")
    }
    println()
    for (i in 1 until 10 step 2){
        print(i)
        print("\t")
    }
}*/

fun main() {
    var number = 0

    /*while(number < 10){
        print("$number\t")
        number++
    }*/


    /*while(number < 10) println(number++)*/


    /*while (number < 10){
        if (number == 7){
            continue
        }
        print("$number\t")
        number++
    }*/


    /*while (number < 10){
        number++
        if (number == 7){
            continue
        }
        print("$number\t")
    }*/


    /*while (number < 10){
        number++
        if (number > 2 && number < 8){
            continue
        }
        print("$number\t")
    }*/


    /*while (number < 10){
        number++
        if (number in 3..7){
            continue
        }
        print("$number\t")
    }*/


    /*while (number < 10) {
        number++
        if (number == 7) {
            break
        }
        print("$number\t")
    }*/


    /*for (i in 0..10){
        if (i in 3..8){
            continue
        }
        println(i)
    }*/


    /*for (i in 0..10){
        if (i == 7){
            break
        }
        println(i)
    }*/


    while (number < 5){
        number++
        println(number)

        var i = 0
        while (i < 8){
            if (i == 5) break
            i++
            println("*** $i ***")
        }
    }

    /*outer@while (number < 5){
        number++
        println(number)

        var i = 0
        while (i < 8){
            if (i == 0) break@outer
            i++
            println("*** $i ***")
        }
    }*/
}









