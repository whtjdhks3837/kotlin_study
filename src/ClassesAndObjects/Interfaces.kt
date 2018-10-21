package ClassesAndObjects

interface MyInterface {
    // 추상 멤버변수이기 때문에 초기화를 하지 않아도 된다.
    val prop: Int

    // get 메소드를 이용해 초기화 할 수 있다.
    val propertyWithImplementation: String
        get() = "foo"

    fun foo() {
        println(prop)
    }
}

class PropertiesInInterfaces : MyInterface {
    override val prop: Int = 29

    override fun foo() {
        super.foo()
        println(propertyWithImplementation)
    }
}

interface TestA {
    fun foo() { print("A") }
    fun bar()
}

interface TestB {
    fun foo() { print("B") }
    fun bar() { print("bar") }
}

class ResolvingOverridingConflicts : TestA, TestB {
    override fun foo() {
        super<TestA>.foo()
        super<TestB>.foo()
    }

    override fun bar() {
        super<TestB>.bar()
    }

}
