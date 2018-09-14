import java.io.*
import java.util.stream.Stream

/**
 * Created by Sony VAIO on 05/06/2016.
 */


fun main(a: Array<String>){

    var str: String;

    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))


    bw.write("Hello")

    readLines("Hello.txt")
    }

fun readLines(fileName : String){
    File(fileName).forEachLine { print(it) }
}
