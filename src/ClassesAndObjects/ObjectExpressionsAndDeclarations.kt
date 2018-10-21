package ClassesAndObjects

class ObjectExpressionsAndDeclarations {
    interface B {
        //...
    }

    open class A(x: Int) {
        open val y: Int = x
    }


    //클래스를 명시적으로 만들지 않고 변수로 만들 수 있음.
    val ab: A = object : A(1), B {
        override val y = 15
        val a = 1
    }

    class C {
        // Private function, so the return type is the anonymous object type
        private fun foo() = object {
            val x: String = "x"
            val y: Int = 1
        }

        // Public function, so the return type is Any
        fun publicFoo() = object {
            val x: String = "x"
        }

        fun bar() {
            val x1 = foo().x       // Works
            val y1 = foo().y
            println("$x1, $y1")
            //val x2 = publicFoo().x  // ERROR: Unresolved reference 'x'
        }
    }
}
