package Expressions

/**
 * Created by Sony VAIO on 01/03/2016.
 */


fun main(args : Array<String>){

    //wLoop()
    //case(0B01101)
    //rang(4)
    //ExConversion()
    //arr()
     sTemp()
}

fun wLoop() : Unit{

    var i  = 1
    while(i <= 10)
        println(i++)
}

fun fLoop() : Unit{
     /** Needs Completing **/
}

//Depends on the order in which you place your cases (Like the exception buckets)
fun case(obj : Any){
    when (obj){

        1 -> println("One")
        "Hello" -> println("Greeting")
        is Int -> println("Int")
        is Float -> print("Float")
        !is String -> println("Isn't a String")

        else
                -> print("Dont Know")

    }
}

fun rang(x : Int) : Unit{
    //Finding a number between a range
    val y = 10
    if (x in 1..y)
        println("Your value is between 1 and " + y)
    else if( x > y)
        println("Your valie is more than" + y)

    /**
     * if( x !in 0..array.lastIndex)
     * print("out")
     */

    for(c in 1..7)
        print(c)
}


fun ExConversion() : Unit{
    val b: Byte = 4
    print(b)
    //Create a value i (int) takes the Byte and casts it to int.
    val i: Int = b.toInt()
    print(i)
}

fun arr() : Unit{
    /** Array 1: + for loop **/
    val asc = Array(5,{i -> (i * i).toString()})
    for(n in asc)
        print(n + ", ")
        println()


    /** Array 2**/
    val ar = Array(4,{i -> (i).toString()})
    for(l in ar)
        print(l + ", ")
                println()
    /** Gets Index in array **/
    println(ar.get(1))


    /** Returns size in array **/
    val point: Int = ar.size
    println("Size  of " + ar.toString() + point)

    /** Sorts in desending order **/
    println("Sort descending" + ar.sortedDescending())


    /** Creating a array **/
    val x: IntArray = intArrayOf(1,2,3,4,5)
    x[0] = 3
    x[1] = x[2] + x[3]

    println(x[0])
    println(x[1])
    println(x[2])

    val chr: CharArray = charArrayOf('D','L','M')
    for(s in chr)
        println(s)



}

fun sTemp() : Unit{
    val n = 10
    var m = 6
    val s = "i = $n"

    /** the '$' allow you to put variables instead strings text **/
    print("$s i can also print $m")


    val str = "abc"
    print("The length of $str is ${str.length}")


    val price = """
    ${'$'}9.99
    """



    print(price)
}