/**
 * Created by Sony VAIO on 31/05/2016.
 */


fun main(args: Array<String>){


    cases(true)
    Animal(39)


}

fun cases(x: Any): Unit {
    when (x) {
        1 -> print("One")
        "Hello" -> print("Greeting")
        is Long -> print("Long")
        is Int -> print("Int")
        is String -> print("Not a string")
        else -> print("Unknown")
    }
}

fun Animal(x: Any): Unit {
    when(x) {
        1 -> print("Snail")
        2 -> print("Human")
        4 -> print("You could be many animals")
        8 -> print("Octopos")
        else -> print("Fucking dunno Mate")
    }
}