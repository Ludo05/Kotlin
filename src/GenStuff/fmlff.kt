import java.util.*

/**
 * Created by Sony VAIO on 31/05/2016.
 */
data class Customer(val name: String, val email: String)

fun main(args: Array<String>){

    var arr: ArrayList<Customer>


    val customer = Customer("Lewis Williams","Lewis.a.w@hotmail.com")
    print(customer)

    val m = HelloOb("Jhezzu")
    m.greet()

    val g = {
        val mum = 2
        val dad = 1

        val answer = mum + dad
        print(answer)


    }

    print(g)


    for(i in 0..10) {
        for (j in 0..10) {
            print(i)
            print(j)
        }
    }

    val array = arrayListOf(2,3,4,5,6,7,8,5)
    array.forEach {}




}