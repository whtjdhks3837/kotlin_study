package BasicSyntax

fun main(args: Array<String>) {
//    println(sum(1, 2))
//    println(simpleSum(1, 2))
//    printSum(1, 2)
//    println(stringTemplate())
//    println(maxOf2(1, 2))


//    printProduct("a", "7")
//    printProduct("3", "6")
//    optionalTest1()
//    optionalTest2()
//    optionalTest3()
//    letTest()

//    println(getStringLength(123))
//    println(getStringLength("123"))
//    loopTest()
//    rangeTest()
//    collectionTest()
//    mapTest()
//    var array = arrayOfMinusOnes(10)
//    array.forEach { print("$it ") }
//    lazyTest()
//    singletonTest()
//    fileReadTest()
    mutableTest()
}

fun sum(a: Int, b: Int): Int {
    return a + b
}

fun simpleSum(a: Int, b: Int) = a + b

fun printSum(a: Int, b: Int) {
    println("$a + $b = ${a + b}")
}

fun stringTemplate(): String {
    var a = 1
    val s1 = "a is $a"

    a = 2
    return "${s1.replace("is", "was")}, but now is $a"
}

fun maxOf(a: Int, b: Int): Int {
    if (a > b) {
        return a
    } else {
        return b
    }

}

fun maxOf2(a: Int, b: Int) = if (a > b) a else b

//삼항연산자 불가
//fun maxOf3(a: Int, b: Int) = a > b ? a : b


