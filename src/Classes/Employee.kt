package Classes

data class Employee(val name: String, val age: Int, val role: String, val EmpId: Long) {
    var isAvailable: Boolean? = true
}


fun main(args: Array<String>) {
    val emp1 = Employee("Lewis",25,"Software",145946)
    emp1.isAvailable

    print("Employee ${emp1.EmpId} is a ${emp1.isAvailable}")

}