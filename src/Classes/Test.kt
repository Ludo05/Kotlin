package Classes

/**
 * Created by Sony VAIO on 01/03/2016.
 */

fun main(args: Array<String>){

    /** Creating a instance of a class **/
    val cus = Animal("Lewis",20)
    println(cus.ovo().toString())
    val a: Int = cus.normalMethod(6)
    println(a)

    /** Executing the abstract method **/
    val string = Animal.absMethod("Hey there")
    /** ------------------------------- **/
    println(string)
}