package ClassesAndObjects

fun main(args: Array<String>) {
//    InitOrderDemo("hello")
//    InitOrderDemo2("hello")

//    SubClass().foo()
//    AnotherClass().foo()

//    ChildA(1).foo()
//    ChildA(1, 2).foo()
//    ChildA(1, 2).b()

//    ChildB().foo()

//    Derived("seo wan", "Joe")

//    Bar().Baz().g()

//    var address = Address()
//    address.city = "서울시"
//    address.street = "공덕"
//    printAddressInfo(address)

//    val backingFields = BackingFields()
//    backingFields.counter = 10
//    println(backingFields.counter)
//    backingFields.counter = -1
//    println(backingFields.counter)

//    val myTest = MyTest()
//    if (!myTest.isInitialized()) {
//        println("my test is not initialized")
//        myTest.setup()
//        myTest.test()
//    }

//    PropertiesInInterfaces().foo()

//    ResolvingOverridingConflicts().bar()
//    ResolvingOverridingConflicts().foo()

//    ExtensionFunctions().foo()
//    ExtensionsAreResolvedStatically().foo()
//    ExtensionProperties().foo()
//    CompanionObjectExtensions.foo()
//    DeclaringExtensionsAsMembers().foo()

//    val joe = User("joe", 27)
//    val oldJoe = joe.copy(age = 28)
//    println("${joe.name}, ${joe.age}")
//    oldJoe.foo()
//    val (name, age) = joe
//    println("$name, $age")

//    SealedClass().foo()

//    Outer2.Nested().foo()
//    Outer2().Inner().foo()

//    Enum().foo()
//    IntArithmetics.PLUS.foo()
//    IntArithmetics.TIMES.foo()

//    ObjectExpressionsAndDeclarations.C().bar()

//    fun foo(value1: Int, value2: Int) = value1 + value2
//    fun foo2(value1: Int, value2: Int) = value1 * value2
//
//    Inline().print(::foo)
//    Inline().print(::foo2)

//    Delegation.Derived(Delegation.BaseImpl(10)).print()

//    val b = Delegation2.BaseImpl(10)
//    Delegation2.Derived(b).printMessage()
//    Delegation2.Derived(b).printMessageLine()

    val b2 = Delegation3.BaseImpl(10)
    val derived = Delegation3.Derived(b2)
    derived.print()
    println(derived.message)
}