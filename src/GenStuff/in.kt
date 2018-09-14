/**
 * Created by Sony VAIO on 01/06/2016.
 */


fun main(args: Array<String>) {

    val n = 5

    if (n !in 1..10)
        print("Out")
    else
        print("In")


    println(charToInt('f'))


    val text = """
 Chicken wings and fries
 We dont go on dates,
 Stand up for your rights $n
 Dont let a pagan ${4+3} knock off your lights

"""

    print(text)


    fun isLetter(c : Char) = c in 'a'..'z' || c in 'A'..'Z'
    fun isNotaDigit(c: Char) = c !in '0'..'9'

   println(isLetter('d'))
           println(isLetter('5'))
           println(isNotaDigit('3'))
           println(isNotaDigit('d'))

    println("Lewis" in "Ab".."df")
}

    fun charToInt(c: Char): Int{

       val num = c.toInt()

        return num
    }





