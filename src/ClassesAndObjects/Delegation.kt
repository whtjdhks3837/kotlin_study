package ClassesAndObjects

class Delegation {
    interface Base {
        fun print()
    }

    class BaseImpl(val x: Int) : Base {
        override fun print() { print(x) }
    }

    class Derived(b: Base) : Base by b {
        fun foo() {

        }
    }
}

class Delegation2 {
    interface Base {
        fun printMessage()
        fun printMessageLine()
    }

    class BaseImpl(val x: Int) : Base {
        override fun printMessage() { print(x) }
        override fun printMessageLine() { println(x) }
    }

    class Derived(b: Base) : Base by b {
        override fun printMessage() { print("abc") }
    }
}

class Delegation3 {
    interface Base {
        val message: String
        fun print()
    }

    class BaseImpl(val x: Int) : Base {
        override val message = "BaseImpl: x = $x"
        override fun print() { println(message) }
    }

    class Derived(b: Base) : Base by b {
        // This property is not accessed from b's implementation of `print`
        override val message = "Message of Derived"
    }
}