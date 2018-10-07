package ClassesAndObjects

class Address {
    var city: String = "안양"
    var street: String = "관평로 "
}

fun printAddressInfo(address: Address) {
    println("${address.city}, ${address.street}")
}

class BackingFields {
    var counter: Int = 0
        set(value) {
            if (value >= 0) field = value
        }
}

class TestSubject {
    val subject = "안뇽!"

    fun foo() {
        println(subject)
    }
}

class MyTest {
    lateinit var testSubject : TestSubject

    // 초기화가 되었는지 검사함.
    fun isInitialized() = ::testSubject.isInitialized

    fun setup() {
        testSubject = TestSubject()
    }

    fun test() {
        testSubject.foo()
    }
}