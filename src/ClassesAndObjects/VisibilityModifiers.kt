package ClassesAndObjects

/**
 * 접근 제어자
 * private : class 내에서만 사용 가능
 * protected : 상속받은 클래스에서도 사용 가능.
 * internal : 같은 모듈 내에서만 사용 가능.
 * public : 어디서든 사용 가능.
 */

/**
 * open
 * 다른 클래스에서 상속이 가능하게끔 해주는 키워드
 */

open class Outer {
    private val a = 1
    protected open val b = 2
    internal val c = 3
    val d = 4  // public by default

    protected class Nested {
        val e: Int = 5
    }
}

class SubClass : Outer() {
    override val b = 3
    fun foo() {
        // Nested는 protected이기 때문에 상속받은 클래스에선 호출이 가능하다.
        // a는 private기 때문에 호출 불가능.
        println("$b, $c, $d, ${Nested().e}")
    }
}

class AnotherClass {
    fun foo() {
        val outer = Outer()
        // val nested = Nested() //Outer를 상속받지 않아 호출이 불가하다.

        // c는 internal, d는 public이기 때문에 호출 가능하다.
        println("${outer.c}, ${outer.d}")
    }
}

// 생성자가 private이기 때문에 어디서도 호출이 불가하다.
class DontCreateMe private constructor() {
    //..
}