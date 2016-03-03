package Classes

/**
 * Created by Sony VAIO on 01/03/2016.
 */

fun main(args: Array<String>){

    /** Creating a instance of a class **/
    val cus = Animal("Lewis",20)

    /** Executing the abstract method **/
    val string = Animal.absMethod("Hey there")
    /** ------------------------------- **/

    println(string)
}