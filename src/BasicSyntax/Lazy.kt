package BasicSyntax

fun lazyTest() {
    /**
     * immutable instance에 대해 프로그램이 실행됐을 때
     * 초기화가 실행 되지 않고 호출 되었을 때 초기화가 되게 끔 해주는 예약어
     */
    val str: String by lazy {
        "aaa"
    }

    println(str)
}