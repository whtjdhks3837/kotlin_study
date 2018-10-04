package Basic

fun returns() {
    var name: String? = null
    val s = name?: return
    println("not null")
}

fun breakAndContinueLabels() {
    // loop임을 명시하는 어노테이션. 조건문에 붙여도 동작한다...
    loop@ for (i in 1..5) {
        print("$i ")
    }
    println()

    // 메소드가 종료된다.
    /*listOf(1, 2, 3, 4, 5).forEach {
        if (it == 3) return
        print(it)
    }*/

    println()

    // return뒤에 @lit을 붙이면 조건에 맞는식만 넘어가고 함수가 종료되지 않는다.
    // lit@을 명시하지 않으면 @lit을 사용할 수 없다.
    listOf(1, 2, 3, 4, 5).forEach lit@{
        if (it == 3) return@lit
        print(it)
    }
    println(" done with explicit label")

    // lit@ @lit과 같이 동작한다.
    listOf(1, 2, 3, 4, 5).forEach {
        if (it == 3) return@forEach
        print(it)
    }
    println(" done with explicit label")

    // forEach 람다식이 아닌 함수식인 경우 forEach에 함수를 넣을 수 있다.
    // 함수안에서 return을 쓰기 때문에 내부에 정의한 함수가 종료된다.
    listOf(1, 2, 3, 4, 5).forEach (fun(value: Int) {
        if (value == 3) return
        print(value)
    })
    println(" done with anonymous function")

    // 왜 붙이는지 모르겠다,,,
    run loop@ {
        listOf(1, 2, 3, 4, 5).forEach {
            if (it == 3) return
            println(it)
        }
    }
    print(" done with nested loop")
}