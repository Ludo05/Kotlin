package Classes

/** Importing from another class **/
import Classes.Animal
import Adding.*
import java.util.logging.Logger

/** Are allowed one primary constructor and multiple secondary constrctors. **/
/** Display the class you wish to overide the method from after the colons. **/
class Animal constructor(firstName: String, age: Int)  : Imp() {
    init {
        Logger.getLogger("Customer initialized with value ${firstName} and age: ${age}")
    val cName = firstName
    val cAge = age

        print("Your name ${cName} age ${cAge}")
    }

    /** Overidden method **/
    override fun ovo() : Unit{
        print("Bye")
    }


}



/**
 * Created by Sony VAIO on 01/03/2016.
 */
