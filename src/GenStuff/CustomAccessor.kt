/**
 * Created by Sony VAIO on 04/06/2016.
 */


fun main(args: Array<String>){

    val m = User("bob")
    print("Hi im ${m.nickname}")

    val cus = customAccessor("Hekejkd@hotmail.com")
    print(cus.nickname)

}

class User(val nickname: String)

class customAccessor(val email: String) {
    val nickname: String

        get() = email.substringBefore('@')

}

