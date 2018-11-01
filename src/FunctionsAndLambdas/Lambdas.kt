package FunctionsAndLambdas

class HigherOrderFunctions {
    fun <T, R> Collection<T>.fold(
            initial: R,
            combine: (acc: R, nextElement: T) -> R
    ): R {
        var accumulator: R = initial
        for (element: T in this) {
            accumulator = combine(accumulator, element)
        }
        return accumulator
    }

    fun fold() {
        val items = listOf(1, 3, 5, 7, 9)

        // Lambdas are code blocks enclosed in curly braces.
        val foldItem = items.fold(0) {
            // When a lambda has parameters, they go first, followed by '->'
            acc: Int, i: Int ->
            acc + i
        }
        println(foldItem)

        // Parameter types in a lambda are optional if they can be inferred:
        val joinedToString = items.fold("Elements:") { acc, i -> acc + " " + i }
        println(joinedToString)
        // Function references can also be used for higher-order function calls:
        val product = items.fold(2, Int::times)
        println(product)
    }
}

class InstantiatingFunctionType {
    fun foo(quz : (a: Int, b: Int) -> Unit) {
        quz(1, 2)
    }

    fun run() {
        foo{ a, b ->  println("$a, $b")} //람다표현식
        foo(fun(a: Int, b: Int) { println("$a, $b") }) //익명함수 표현
        println(stringFunction("aaa"))
        val a = {a: Int -> a + 1}
        println(a(5))


        val repeatFun1: (String, Int) -> String = fun(str: String, times: Int): String {
            return str.repeat(times)
        }


        val repeatFun2: String.(Int) -> String = { times -> this.repeat(times) }
        val twoParameters: (String, Int) -> String = repeatFun1 // OK

        fun runTransformation(f: (String, Int) -> String): String {
            return f("hello", 3)
        }
        val result = runTransformation(repeatFun1) // OK

        println("result = $result")

        //클래스에 동적으로 메소드를 정의할 수 있게 해준다.
        val plusStrFun: String.(String) -> String = {str -> this + str}
        val str = "hell"
        println(str.plusStrFun(" world"))
    }

}

class StringTransformer: (String) -> String {
    override operator fun invoke(x: String): String = x
}
val stringFunction: (String) -> String = StringTransformer()

class InvokingFunctionTypeInstance {
    fun foo() {
        //리플렉션 사용
        val stringPlus: (String, String) -> String = String::plus
        val intPlus: Int.(Int) -> Int = Int::plus

        println(stringPlus.invoke("<-", "->"))
        println(stringPlus("Hello, ", "world!"))

        println(intPlus.invoke(1, 1))
        println(intPlus(1, 2))
        println(2.intPlus(3)) // extension-like call
    }
}

class ReturningValueFromLambdaExpression {
    fun foo() {
        val ints = listOf(-1, -2, 3, 5, 2)
        //return을 명시적으로 붙이지 않으면 마지막 표현식이 내재적으로 return된다.
        ints.filter {
            val shouldFilter = it > 0
            shouldFilter
        }

        ints.filter {
            val shouldFilter = it > 0
            return@filter shouldFilter
        }
    }
}

class UnderscoreForUnusedVariables {
    fun foo() {
        val map = mapOf("hi" to 1, "hello" to 2)
        map.forEach { _, value -> println("$value!") }
    }
}