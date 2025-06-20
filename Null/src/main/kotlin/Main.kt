fun main(args: Array<String>) {


    ////     Case 1     ////
    /*var favoriteActress: String = "Sunny Leone"
    favoriteActress = null*/
    //Null Cannot be a value of Non null type String



    ////     Case 2     ////
    /*var number: Int = 10
    println(number)*/

    /*var number: Int? = 10
    println(number)*/

    /*var number: Int? = 10
    println(number)
    number = null
    println(number)*/



    ////     Case 3     ////
    /*var text: String? = null
    text = "Fahim"
    println(text!!.length )*/
    // '!!' means not-null assertion operator
    //Here uses 'var' to atain another same name variable. '!!' cant print null, so extra line needed

    /*val text: String? = null
        println(text?.length )*/
    //'?' can print null

    /*var number: String? = "10"
    println(number?.length)*/
    // '?.' safe call operator to access methods or properties of nullable variables



    ////     Case 4     ////
    /*var favoriteActor: String? = "Shahrukh Khan"
    if (favoriteActor != null) {
        println("The number of characters in my favorite actor's name is ${favoriteActor.length}.")
    } else {
        println("You didn't input a name.")
    }*/


    /*var favoriteActor: String? = "Salman Khan"
    val lengthConditions = if (favoriteActor != null) {
        println("The number of characters in my favorite actor's name is ${favoriteActor.length}.")
    } else {
        println("You didn't input a name.")
    }*/

    /*var favoriteActor: String? = "Ameer Khan"
    val lengthConditions = if (favoriteActor != null) {
        favoriteActor.length
    } else {
        0
    }
    println("The number of characters in my favorite actor's name is $lengthConditions.")*/



    ////    Case 5    ////
    //  ?: means Elvis operator
    var favoriteActor: String? = "Fahim Afridi"

    val lengthConditions = favoriteActor  ?.  length  ?:  0

    println("The number of characters in my name is $lengthConditions.")




}