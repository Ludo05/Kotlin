import java.util.*

/**
 * Created by Sony VAIO on 01/06/2016.
 */


fun main(args: Array<String>) {

    val sum = {x: Int,y: Int -> x + y}


    print(v(1,2,3,4,3,2,3,2,3,2,3,2))
    println()
    println("Hello  ${v("One","Two","Three")} what you really telling me ${4}  ${Math.max(5,304)}")
    println(findFixPoint())
    println(sum(4,5))


}

fun <T> v(vararg ts: T): List<T>{
    val m = ArrayList<T>()
    for( t in ts)
        m.add(t)
    return m
}

tailrec fun findFixPoint(x: Double = 1.0): Double
        = if (x == Math.cos(x)) x else findFixPoint(Math.cos(x))






