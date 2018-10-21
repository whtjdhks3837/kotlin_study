package ClassesAndObjects

import java.util.function.BinaryOperator
import java.util.function.IntBinaryOperator

enum class Direction {
    NORTH, SOUTH, WEST, EAST
}

enum class Color(val rgb: Int) {
    RED(0xFF0000),
    GREEN(0x00FF00),
    BLUE(0x0000FF)
}

enum class IntArithmetics : BinaryOperator<Int>, IntBinaryOperator {
    PLUS {
        override fun apply(t: Int, u: Int): Int = t + u
    },
    TIMES {
        override fun apply(t: Int, u: Int): Int = t * u
    };

    override fun applyAsInt(t: Int, u: Int) = apply(t, u)

    fun foo() {
        println(applyAsInt(3, 5))
    }
}

class Enum {
    fun foo() {
        println(Direction.NORTH)

        println(Color.RED)
        println(Color.RED.rgb)

        println(IntArithmetics.valueOf("PLUS"))
        for (e in IntArithmetics.values())
            println(e)
    }
}