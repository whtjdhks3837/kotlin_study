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