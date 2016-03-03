package Functions

/**
 * Created by Sony VAIO on 02/03/2016.
 */

fun main(args: Array<String>){

   fun f(x : Int = 0) = x * x
    fun f1(x: Int, y: Int = 0) = x + y

    f(1)
    print(f1(2,3))
}