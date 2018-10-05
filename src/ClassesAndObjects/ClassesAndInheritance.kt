package ClassesAndObjects

// constructor case1
class Person constructor(name: String) {
    //..
}

// constructor case2
class Person2(name: String) {
    //..
}


// init은 class 파라미터로 쓰는 생성자가 아닌 이상 생성자보다 먼저 실행된다.
// 파라미터로 쓰는 생성자 -> init -> constructor블럭 순으로 실행.
// 파라미터로 쓰는 생성자와 constructor블럭은 동시에 사용 할 수 없음.
class InitOrderDemo {
    var name: String? = null;

    constructor(name: String?) {
        this.name = name
    }
    val firstProperty = "First $name".also(::println)

    init {
        println("First initializer block that prints ${name}")
    }

    val secondProperty = "Second ${name?.length}".also(::println)

    init {
        println("Second initializer block that prints ${name?.length}")
    }
}

class InitOrderDemo2(name: String = "hi") {
    val firstProperty = "First $name".also(::println)

    init {
        println("First initializer block that prints ${name}")
    }

    val secondProperty = "Second ${name.length}".also(::println)

    init {
        println("Second initializer block that prints ${name.length}")
    }
}

open class ParentA {
    protected open var value1: Int? = null
    protected open var value2: Int? = null

    constructor(value1: Int?) {
        this.value1 = value1
    }

    constructor(value1: Int?, value2: Int?) {
        this.value1 = value1
        this.value2 = value2
    }

    fun a() {
        println("a")
    }

    open fun b() {
        println("b")
    }
}

class ChildA : ParentA {
    constructor(value1: Int?) : super(value1)
    constructor(value1: Int?, value2: Int?) : super(value1, value2)

    fun foo() {
        println("${value1 ?: -1}, ${value2 ?: -1}")
    }

    // open키워드가 없기 때문에 오버라이딩 불가
    // override fun a() {}

    override fun b() {
        println("bb")
    }
}

open class ParentB {
    /**
     * get()
     * 값을 return해주는 메소드. 값의 변경하여 return이 가능하다.
     * set()
     * 대입된 값을 변경해주는 메소드.
     */
    open var x: Int = 0
        get() {
            field -= 10
            return field
        }
        set(value) {
            field = value + 1
        }
}

class ChildB {
    val parentB = ParentB()

    fun foo() {
        parentB.x = 10
        println(parentB.x)
    }
}

interface Foo {
    val count: Int
}

// 생성자에서 오버라이딩
class Bar1(override val count: Int): Foo {
    //...
}

// 클래스 내에서 오버라이딩
class Bar2 : Foo {
    override val count: Int = 0
}

open class Base(val name: String) {
    init {
        println("Initializing Base")
    }

    open val size: Int = name.length.also { println("Initializing size in Base: $it") }
}

class Derived(name: String, val lastName: String)
    : Base(name.capitalize().also { println("Argument for Base: $it") }) {

    init { println("Initializing Derived") }

    override val size: Int
            = (super.size + lastName.length).also { println("Initializing size in Derived: $it") }
}

open class Foo2 {
    open fun f() { println("Foo.f()") }
    open val x: Int get() = 1
}

class Bar : Foo2() {
    override fun f() {
        super.f()
        println("Bar.f()")
    }

    override val x: Int get() = super.x + 1

    inner class Baz {
        fun g() {
            // Bar의 슈퍼클래스의 멤버를 호출한다.
            super@Bar.f()
            println(super@Bar.x)
        }
    }
}

open class A {
    open fun f() { print("A") }
    fun a() { print("a") }
}

interface B {
    fun f() { print("B") } // interface members are 'open' by default
    fun b() { print("b") }
}

class C() : A(), B {
    // The compiler requires f() to be overridden:
    override fun f() {
        super<A>.f() // call to A.f()
        super<B>.f() // call to B.f()
    }

   

    override fun b() {

    }
}