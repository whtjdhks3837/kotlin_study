package Basic

fun whenExpression() {
    val x = 1
    when (x) {
        1, 2 -> println(x)
        else -> println("no!")
    }

    val x2 = 1
    val validNumbers = IntArray(5, {i -> i})
    validNumbers.forEach { i -> print("$i ") }
    println()
    when (x2) {
        in 2..10 -> println(x2)
        in validNumbers -> println("in array")
        !in 10..20 -> println("x is outside the range")
        else -> println("error")
    }
}

fun hasPrefix(x: Any) = when(x) {
    is String -> x.startsWith("prefix")
    else -> false
}

fun forExpression() {
    val array = Array(10, {i -> i + 1})
    for ((index, value) in array.withIndex()) {
        println("$index, $value")
    }
}