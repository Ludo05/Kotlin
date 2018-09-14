package Conditional_Expression

/**
 * Created by Sony VAIO on 01/03/2016.
 */

fun main(args:Array<String>){

    val a: Int = 4
    val b: Int = 10

    var max = if(a > b) a else b
    println(max)

    // println(Max(9,6))
    // Input()
    // println(Ma(4,6))
    // ofString("String")
    // println(retu(3,5))
    //loop()
    //println(col())
      loop2()


}



//functional
fun Ma(a : Int, b : Int) = if (a > b) a else b

fun Input() : Unit{
    println("Enter a value")
   val  num1  = readLine()
    println("Enter second value")
   val  num2 = readLine()
    println("Enter third value")
    val num3 = readLine()

    val total = num1 + num2 + num3
    println(total.toInt())
}

fun ofString(s : Any) : Unit{

    if(s is String)
        print(s + " is a String")
    else
        print(" isn't a String")

}

fun check(x: Any) : Unit{

    when(x){
        0,1 -> println("x is 0 or 1.")
        in 10..20 -> println("In range of 10 - 20.")
                else -> print("Something else.")
    }
}

fun loop() : Unit{
    loop@ for(i in 1..100)
               print("$i, ")


}

fun retu(v: Int,z: Int) : Int = if(v > z) v else z

fun col(): List<Int> {
    val collections: List<Int> = listOf(1, 2, 3, 4, 5, 6)

    /**
     * THIS WILL ALSO WORK FUNCTIONAL PROGRAMMING
     * collections.forEach{e -> println(e)}
     * collections.forEach { println(it) }
     */

    return collections
}

fun loop2(): Unit{
    for(i in 1..10 )
        print(i)
}




