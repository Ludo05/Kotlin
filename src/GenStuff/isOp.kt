/**
 * Created by Sony VAIO on 31/05/2016.
 */


fun main(args: Array<String>){

    println(Check(5))
    println(Check("Chicken"))
    println(Check(34))


}

 fun Check(x: Any): Int?{
    if(x is String){
        return x.length
    }
     return null
}