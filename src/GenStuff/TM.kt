import java.util.*

/**
 * Created by Sony VAIO on 05/06/2016.
 */



fun main(a: Array<String>) {
    /****************************************************************/

    val binaryReps = TreeMap<Char, String>()

    for (c in 'A'..'F') {
        val binary = Integer.toBinaryString(c.toInt())

        binaryReps[c] = binary
    }

    for ((letter, binary) in binaryReps) {
        println("$letter = $binary")
    }

/****************************************************************/
    val n = TreeMap<Int, Int>()

    for (i in 1..10) {
        val square = i * i

        n[i] = square
    }
        for((num, square) in n)
            println("$num = $square")

    /****************************************************************/



    val arr = listOf(1,2,3,66,5,4,5,4,5,3,4,5)
    for((index, i) in arr.withIndex()){
        println("$index = $i")
    }


}

