/**
 * Created by Sony VAIO on 04/06/2016.
 */


 fun main(args: Array<String>){

 val CL = customLength()
    CL.counts("Hello!")
    print(CL.counter)
val d = "ekrkrkkf".length

}

//Class
class customLength() {
    // class attribute
    var counter: Int = 0

    //Makes the class private
    private set

    //class function (counts the number of chars in the String).
    fun counts(word: String) {
        counter += word.length
    }
}