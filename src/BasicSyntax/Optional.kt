package BasicSyntax

import java.io.File

/**
 * String을 Int? type으로 파싱한다.
 * 코틀린에서 명시된 모든 객체는 null이 들어 갈 수 없으므로
 * '?'을 붙여 옵셔널 형식으로 만들어서 대입.
 */
fun parseInt(str: String): Int? {
    // var a: Int = null // error
    // var a: Int? = null // no error
    return str.toIntOrNull()
}

fun printProduct(arg1: String, arg2: String) {
    val x = parseInt(arg1)
    val y = parseInt(arg2)

    // Using `x * y` yields error because they may hold nulls.
    if (x != null && y != null) {
        // x and y are automatically cast to non-nullable after null check
        println(x * y)
    }
    else {
        println("either '$x or '$y' is not a number")
    }
    println("####################################")
}

var a: String = "abc"
var b: String? = null

fun optionalTest1() {
    println(a?.length) // a는 String? 타입이 아니기 때문에 ?를 붙일 필요가 없음.
    println(b?.length)
    println("####################################")
}

fun optionalTest2() {
    val listWithNulls: List<String?> = listOf("Kotlin", null)
    for (item in listWithNulls) {
        item.let { println(it) } // null에 동작함
        item?.let { println(it) } // null에 동작하지 않음.
        //println(item)
        println("---------------------")
    }
    println("####################################")
}

fun optionalTest3() {
    val files = File("test").listFiles()
    // '?'를 붙이면 에러가 아닌 null를 리턴한다.
    println(files?.size ?: "error")


    // 타입이 명시되지 않은 var과 val에는 왜 null이 되는가?
    val emails = listOf(null, "park")
    val mainEmail = emails.firstOrNull()?: "ㅜㅜ"
    println(mainEmail)

    val values = mapOf("Joe" to "joe", "Lee" to "lee", "Han" to "han", "Go" to "go")
    /*val email = values["joe"]?: throw IllegalStateException("Email is missing!")
    println(email)*/
    println("####################################")
}

fun letTest() {
    //실행되지 않음
    val value: String? = null
    value?.let{
        println(it)
    }

    val value2: String? = "123"
    value2.let{
        println(it)
    }
    println("####################################")
}