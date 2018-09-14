package Lists

/**
 * Created by Sony VAIO on 02/03/2016.
 */

fun main(args: Array<String>){
    val nums = listOf(1,2,3,4,5)


    /**Creating a list then using lambda expression to print them **/
    val names = listOf("Lewis",2,"Gym")
    print("[")
    names.forEach { e ->
        print("$e, ") }
    println("]")
    /** ------------------------------------------------------- **/

    /** Mutable List allows change **/
    val  Test :  MutableList<String> =
            arrayListOf("Mum","Dad","Jhezu")
    Test[0] = "Mo"
    print("[")
    Test.forEach { e ->
        print("${e.reversed()}, ") }
    println("]\n")
    /** Error as the list isnt mutable and doesnt allow change
    val Test1 = listOf("Mu","Da","Le")
    Test1[0] = "Kd"
    **/


    val map: MutableMap<Int,String> =
            hashMapOf(0 to "v")
    map[0] = "Hello"
    map[1] = "Jim"
    map[2] = "Lewis"

    println("*** K,V Map ***")

    for((k,v) in map)
        println("$k  $v")
    println("---------------")


    fun sum(xs : List<Int>): Int {
        var result = 0
        xs.forEach { result += it }
        return result
    }


   println("The sum of ${nums} is: ${sum(nums)}")

}