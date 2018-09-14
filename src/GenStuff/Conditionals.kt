/**
 *
 * Conditionals
 * Created by Sony VAIO on 31/05/2016.
 */

fun main(args: Array<String>) {

    println(max2(10,6))
    rightNumber()
    print(parrse("Jewis"))
    Loop(8)
}
    fun max(x: Int,y: Int): Int{
        if(x > y)
         return   x
        else
        return    y

    }

    fun max2(x: Int, y: Int): Int = if(x > y) x else y



    fun bool(x: Int): Boolean{
        if(x == 10)
            return true
        else
            return false
    }

    fun rightNumber(): Boolean {
        var bo = false
        var i = 0
        while (i <= 10) {
            print(i)
            i += 1
        }
        if (i > 10)
            bo = true
        println(bo)
        return true
    }
    fun parrse(str: String): Int?{
        if(str.contains("is"))
            return 1
        else
            return null

    }


    fun Loop(x: Int): Unit {
    for(i in 0..x){
        println(i)
    }

}




