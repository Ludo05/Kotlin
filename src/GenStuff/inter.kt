/**
 * Created by Sony VAIO on 05/06/2016.
 */


interface Expr

class Num(val value: Int) : Expr
class Sum(val left: Expr, val right: Expr) : Expr

fun main (args: Array<String>){
 val c = eval(Sum(Num(1), Num(2)))
    print(c)

    val d = eval(Sum(Sum(Num(2),Num(1)), Num(4)))
    print(d)


    val m = eval(Num(4))
    print(m)


}

fun eval(e: Expr): Int =
    when(e){
        is Num -> e.value //smart cast
        is Sum -> eval(e.right) + eval(e.left) //smart cast
     else -> throw IllegalArgumentException("Unknown expression")
}