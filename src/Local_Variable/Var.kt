package Local_Variable

/**
 * Created by Sony VAIO on 01/03/2016.
 *
 */

fun main(args:Array<String>){

    //'val' local variable (Immuatable)

    val name = "Lewis"
    val num = 6667
    println(num)
    // 'num++' will not work as val can not be assigned.
    val c: Int
    val d: String

    d = "Hey"
    println(d)



    //'var' is mutable
    var x = 5
    println(x)
    x++
    println(x)
    x+=6
    println(x)
}
