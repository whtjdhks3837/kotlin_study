package ClassesAndObjects

class ExtensionFunctions {
    //존재하는 클래스에 메소드를 확장(추가)한다.
    fun <T> MutableList<T>.swap(index1:Int, index2:Int) {
        val tmp = this[index1]
        this[index1] = this[index2] // list의 index에 해당
        this[index2] = tmp
    }
    fun foo() {
        val l = mutableListOf(1, 2, 3)
        l.swap(1, 2)
        l.forEach { println(it) }
    }
}


class ExtensionsAreResolvedStatically {
    open class C {}
    class D: C() {
        fun foo() = "d"
    }

    fun C.foo() = "c"

    fun D.foo() = "d2"

    fun printFoo(c: C, d: D) {
        println(c.foo())
        //확장되지 않은 메소드가 호출된다.
        //확장한 메소드를 출력하기 위해선 오버로딩을 해야함.
        println(d.foo())
    }

    fun foo() {
        printFoo(C(), D())
    }
}

class ExtensionProperties {
    val <T> List<T>.lastIndex: Int
        get() = size - 1

    fun foo() {
        val list = listOf(1, 2, 3, 4)
        println(list.lastIndex)
    }
}

class CompanionObjectExtensions {
    companion object {}
}

fun CompanionObjectExtensions.Companion.foo() {
    println("MyClass.Companion.foo")
}

class DeclaringExtensionsAsMembers {
    open class D { }

    class D1 : D() { }

    open class C {
        open fun D.foo() {
            println("D.foo in C")
        }

        open fun D1.foo() {
            println("D1.foo in C")
        }

        fun caller(d: D) {
            d.foo()   // call the extension function
        }
    }

    class C1 : C() {
        override fun D.foo() {
            println("D.foo in C1")
        }

        override fun D1.foo() {
            println("D1.foo in C1")
        }
    }

    fun foo() {
        C().caller(D())   // prints "D.foo in C"
        C1().caller(D())  // prints "D.foo in C1" - dispatch receiver is resolved virtually
        C().caller(D1())  // prints "D.foo in C" - extension receiver is resolved statically
    }
}
