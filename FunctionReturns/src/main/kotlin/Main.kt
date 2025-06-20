/*fun main(args: Array<String>) {
    val max = getMax(5, 9)
    println(max)
}*/

/*fun getMax(a: Int, b: Int) = if (a > b) a else b*/


/*fun getMax(a: Int, b: Int) : Int {
    val max = if (a > b) a else b
    return max
}*/


/*fun getMax(a: Int, b: Int) : Int {
    if (a > b){
        return a
    }
    else{
        return b
    }
}*/



//     ( Function Overloading )
/*fun main(args: Array<String>) {
    val max = getMax(5, 9, 6)
    println(max)
}
fun getMax(a: Int, b: Int) = if (a > b) a else b

fun getMax(a: Double, b: Double) = if (a > b) a else b

fun getMax(a: Int, b: Int, c: Int) : Int{
    if(a >= b && a >= c){
        return a
    }
    else if(b >= a && b >= c){
        return b
    }
    else{
        return  c
    }
}*/

//   ( Alnernative )
/*fun getMax(a: Int, b: Int, c: Int) : Int{
    return if(a >= b && a >= c){
         a
    }
    else if(b >= a && b >= c){
         b
    }
    else{
         c
    }
}*/


//   (varang Keyword)
/*fun main(){
    println( sum(5, 6,7 ,8))
}
fun sum(a: Int, b: Int, c: Int, d: Int) = a + b + c + d */


/*fun main(){
    println(sum(5,3,5,6,7,4,7,2,9,8,1,7,2))
}
fun sum(vararg numbers : Int) : Int{
    var result = 0
    for(number in numbers){
        result += number
    }
    return result
}*/


fun main(){
    sum(5,3,5,6,7,4,7,2,9,8,1,7,2)
}
fun sum(vararg numbers : Int){
    var result = 0
    for(number in numbers){
        result += number
    }
    println(result)
}



/*fun main(){
    sum(4,5,7,3,6)
}
fun sum(vararg numbers: Int){
    numbers.forEach { println(it) }
}*/


