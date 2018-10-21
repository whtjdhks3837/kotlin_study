package ClassesAndObjects

class Inline {
    inline fun print(body: (Int, Int) -> Int) {
        println(body(5, 5))
    }
}