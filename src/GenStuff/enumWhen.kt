import Color.*

/**
 * Created by Sony VAIO on 05/06/2016.
 */

//To Make sure only a limit amount of options are appicable.
enum class Color{RED, BLUE, GREEN, YELLOW, BROWN, ORANGE}


fun main(args: Array<String>){

 val c = colo(BROWN,BLUE)
    println(c)

 val c1 = colo(BROWN,BROWN)
    print(c1)

}

fun colo(color1: Color, color2: Color) =
        when(setOf(color1,color2))
{
            setOf(Color.BLUE,Color.BROWN) -> YELLOW
            setOf(Color.GREEN,Color.ORANGE) -> Color.RED
            setOf(Color.BLUE, YELLOW) -> Color.GREEN
            setOf(BROWN,BROWN) -> "Different Color"
            else ->
                     "Dunno tuh bumba"
}