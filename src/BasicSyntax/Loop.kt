package BasicSyntax

fun loopTest() {
    val items = listOf("apple", "banana", "kiwifruit")
    for (item in items) {
        println(item)
    }

    // index
    for (idx in items.indices) {
        println("$idx / ${items[idx]}")
    }

    var idx = 0
    while (idx < items.size) {
        println("${items[idx]}")
        idx ++
    }

    // 1 ~ 9
    for (x in 5 until 10) {
        print("$x ")
    }
}