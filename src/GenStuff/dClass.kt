/**
 * Created by Sony VAIO on 02/06/2016.
 */


data class person(val name: String? = null, val age: Int? = null)


    fun main(args: Array<String>){

        val persona = listOf(person("Lewis",44),person("Jake",31), person("Finn",99))

        val oldest = persona.maxBy { it.age ?: 0 }

        print("The oldest person is $oldest.")
}