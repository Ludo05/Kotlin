import java.util.*

/**
 * Created by Sony VAIO on 01/06/2016.
 */
object _2DArray {

     fun main(args: Array<String>) {

        //2D Array
        val arr = Array(10) { IntArray(10) }

        val array = Array(5) { IntArray(6) }

        for (n in 0..4) {
            for (m in 0..5) {
                array[n][m] = 1
            }
        }

        for (n in 0..4) {
            for (m in 0..5) {
                print(array[n][m])
            }
            println()
        }
        println()



        for (i in 0..9) {
            for (x in 0..9) {
                arr[i][x] = 0
            }

        }

        for (i in 0..9) {
            for (x in 0..9) {
                print(arr[i][x])
            }

            println()
        }
        println()


        for (row in array) {
            Arrays.fill(row, 0)
            println(Arrays.toString(row))


        }

    }
}


