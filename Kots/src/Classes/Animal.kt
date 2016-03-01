package Classes

/** Importing from another class **/
import Classes.Animal
import Adding.*
import java.util.logging.Logger

/** Are allowed one primary constructor and multiple secondary constrctors. **/
class Animal constructor(firstName: String, age: Int) {
    init {
        Logger.getLogger("Customer initialized with value ${firstName} and age: ${age}")
    val cName = firstName
    val cAge = age

        print("Your name ${cName} age ${cAge}")
    }
}



/**
 * Created by Sony VAIO on 01/03/2016.
 */
