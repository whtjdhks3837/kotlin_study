package BasicSyntax

fun rangeTest() {
    val x = 10
    val y = 9

    // x의 값이 1 ~ 10 사이에 있는지
    if (x in 1..y + 1) {
        println("range")
    }

    val list = listOf("a", "b", "c")

    // 0 ~ 2 사이에 -1이 없는지 체크하는 조건
    if (-1 !in 0..list.lastIndex) {
        println(list.lastIndex)
    }

    // list.indices = 0 ~ 2 , list.size = 3
    if (list.size !in list.indices) {
        println("${list.size} / ${list.indices}")
        println("list size is out of valid list indices range too")
    }

    // for(int i = 1 ; i <=5 ; i ++)
    for (x in 1..5) {
        print(x)
    }

    println()

    // for(int i = 1 ; i <= 10 ; i += 2)
    for (x in 1..10 step 2) {
        print(x)
    }

    println()

    // for(int i = 9 ; i >= 0 ; i -= 3)
    for (x in 9 downTo 0 step 3) {
        print(x)
    }
}