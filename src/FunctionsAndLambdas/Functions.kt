package FunctionsAndLambdas

class DefaultArguments {
    open class A {
        open fun foo(i: Int = 10) {
            println(i)
        }
    }

    class B : A() {
        override fun foo(i: Int) {
            println(i)
        }  // no default value allowed
    }

    fun foo(bar: Int = 0, baz: Int = 1,
            qux: (a: Int, b: Int) -> Unit, quz: (a: Int, b:Int, c:Int) -> Unit) {
        qux(1, 2)
        quz(1, 2, 3)
    }
}

class NamedArguments {
    fun reformat(str: String,
                 normalizeCase: Boolean = true,
                 upperCaseFirstLetter: Boolean = true,
                 divideByCamelHumps: Boolean = false,
                 wordSeparator: Char = ' ') {
    }

    fun variableNumberOfArguments(vararg str: String) {
        str.forEach { println(it) }
    }
}

class VariableNumberOfArguments {
    val a = arrayOf(1, 2, 3)
    val list = asList(-1, 0, *a, 4)

    fun <T> asList(vararg ts: T): List<T> {
        val result = ArrayList<T>()
        for (t in ts) // ts is an Array
            result.add(t)
        return result
    }
}

class MyStringCollection {
    infix fun add(s: String) {
        println(s)
    }

    fun build() {
        this add "abc"   // Correct
        add("abc")       // Correct
    }
}

class LocalFunctions {
    fun fooA() {
        fun fooA() {
            println("hi~!")
        }
        println("hello")
        fooA() //local function을 우선적으로 호출한다.
    }

    fun fooB(a: Int) {
        fun fooB(a: String) {
            println(a)
        }
        println(a)
        fooB("a")
    }
}

class TailRecursiveFunctions {
    val eps = 1E-10 // "good enough", could be 10^-15

    tailrec fun findFixPoint(x: Double = 1.0): Double
            = if (Math.abs(x - Math.cos(x)) < eps) x else findFixPoint(Math.cos(x))
}