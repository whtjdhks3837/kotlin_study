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
//    mutableTest()

    val set = mutableSetOf<SetTest>()
    set.add(SetTest(1, 2))
    set.add(SetTest(1, 2))
    set.forEach { println("${it.num}, ${it.num2}") }
}
data class SetTest(val num: Int, val num2: Int)