/**
 * Created by Sony VAIO on 31/05/2016.
 */


var account: Int = 0
val max: Int = 1000

fun main(args: Array<String>){
    addMoney(10)
    addMoney(10)
    buyTicket(200)
    addMoney(200)
    buyTicket(200)
}

fun addMoney(x: Int){
    account += x

    println("New account balance = " + account)
}


fun buyTicket(x: Int) {
    if(x > account) {
        println("Insufficent funds")
    }else {
        account - x
        println("New balance = " + account)
    }
}

