package Sealed_Classes

/**
 * Created by Sony VAIO on 01/03/2016.
 */


 sealed class SC{

    class Const(val number: Double) : SC()
    class Sum(val e1: SC, val  e2: SC) : SC()
    object NotaNumber : SC()
}


fun main(args: Array<String>) {
    val  s = SC.NotaNumber

}