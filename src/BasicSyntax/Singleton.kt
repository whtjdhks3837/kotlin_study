package BasicSyntax

object Resource {
    val name = "name"
}

class Test {
    val name = "name"
}

fun singletonTest() {
    println(Resource.name)
    //println(Test.name)
    val test = Test()
    println(test.name)
}