package BasicSyntax

fun collectionTest() {
    // setOf = new Set
    val items = setOf("apple", "banana", "kiwifruit")

    // 조건에 맞는 값을 만나면 break한다.
    when {
        "orange" in items -> println("juicy")
        "apple" in items -> println("apple is fine too")
        "banana" in items -> println("i like banana")
    }

    val fruits = listOf("banana", "avocado", "apple", "kiwifruit")

    /**
     * a로 시작하는 것을 필터
     * 요소들을 sort
     * 필터한 것들 대문자로 만들어 map에 넣음
     * 요소들을 print
     */
    fruits.filter { it.startsWith("a") }
            .sortedBy { it }
            .map { it.toUpperCase() }
            .forEach { println(it) }

}

fun mapTest() {
    val map = mapOf("a" to "a1", "b" to "b1")
    for ((k, v) in map) {
        println("$k to $v")
    }
}

fun arrayOfMinusOnes(size: Int): IntArray {
    return IntArray(size).apply { fill(-1) }
}