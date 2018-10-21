package ClassesAndObjects

class Outer2 {
    private val bar: Int = 1
    class Nested {
        fun foo() {
            println("foo")
        }
    }

    inner class Inner {
        fun foo() {
            println(bar)
        }
    }
}
