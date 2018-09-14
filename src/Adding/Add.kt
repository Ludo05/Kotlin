package Adding

/**
 * Created by Sony VAIO on 29/02/2016.
 */

fun main(args:Array<String>) {


    println(add(2,7))
    BoyGetYo(3,3)
    print(inf(3,4))

}
//Function name  'add' with two arguements 'Int' a & b which returns a Int
fun add(a : Int,b : Int) : Int{
    if(a + b > 10) {
        print("Numbers are too big")
    }else {
        print("Your answer is: ")
    }
    return a + b

}

//Function programming.
fun inf(a: Int, b: Int) = a + b


fun BoyGetYo(num1 : Int, num2 : Int) : Unit{
    println("Ass over here!")
    println("Adding numbers: " + num1 + " and " + num2 + " = " + inf(num1,num2))
}


