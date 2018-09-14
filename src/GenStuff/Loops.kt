import java.util.*

/**
 * Created by Sony VAIO on 31/05/2016.
 */


fun main(args: Array<String>){
    val arr = arrayListOf(1,2,3,4,5,6)
    val a = ArrayList<String>()
    val array = Array(5,{ i -> i * i})

    a.add("dk")
    a.add("Lewis")
    a.add("dkff")

    for( i in 0..10)
        println(i)

    for(i in 0..arr.size -1)
        println(arr[i])

    for(i in 0..a.size -1)
        println(a[i])

    //Goes up in twos
    for (i in 0..100 step 2)
        println(i)

    for ( i in 0..array.size)
        print(i)
    fun taeTwo(x: Int, y: Int) = x * y


    fun somethingElse(x: Int): Int{

        val num = x


        return num * taeTwo(4,6)

    }



    }
