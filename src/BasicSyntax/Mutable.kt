package BasicSyntax

fun mutableTest() {
    val items = mutableListOf("a", "b", "c")
    val readOnly = items.toList()
    items.add("d")
    items.forEach { print(it) }
    println()
    readOnly.forEach { print(it) }
    //readOnly.clear()
    println()

    val copyItem = items
    copyItem += "e"
    items.forEach { print(it) }
    println()
    copyItem.forEach { print(it) }
    println()
}