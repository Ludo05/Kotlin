/**
 * Created by Sony VAIO on 05/06/2016.
 */


fun main(a: Array<String>){

    for (oneToTen in 1..100)
    println(fizzbuzz(oneToTen))
}

fun fizzbuzz(i : Int) = when {


    i % 15 == 0 -> "Fizzbuzz"

    i % 5 == 0 -> "Fizz"

    i % 3 == 0 -> "Buzz"

    else -> "$i "
}