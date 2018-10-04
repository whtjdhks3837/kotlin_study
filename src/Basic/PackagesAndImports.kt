package Basic

// package의 method를 import하면 다른 패키지의 method를 호출할 수 있다.
import BasicSyntax.sum

fun foo() {
    println(sum(1, 2))
}
