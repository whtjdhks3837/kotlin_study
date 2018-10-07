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

    val myTest = MyTest()
    if (!myTest.isInitialized()) {
        println("my test is not initialized")
        myTest.setup()
        myTest.test()
    }
}