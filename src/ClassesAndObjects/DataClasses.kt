package ClassesAndObjects

data class User(val name: String, val age: Int) {
    fun foo() {
        println("$name $age")
    }
}