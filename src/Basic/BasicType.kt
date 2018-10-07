package Basic

/**
 * Type size (bit)
 * Double	64
 * Float	32
 * Long	    64
 * Int	    32
 * Short	16
 * Byte 	8
 */


fun literalConstants() {
    val decimalValue = 123
    val longValue = 123L
    val hexValue = 0x123
    val binaryValue = 0b0011
    val doubleValue = 123.5e2 // 123.5 x 10^2
    val floatValue = 123.5f

    print("$decimalValue," +
            "$longValue," +
            "$hexValue," +
            "$binaryValue," +
            "$doubleValue," +
            "$floatValue")
}

/**
 * 값에 언더바를 넣어 표현할 수 있음.
 */
fun underscoresInNumericLiterals() {
    val oneMillion = 1_000_000
    val creditCardNumber = 1234_5678_9012_3456L
    val socialSecurityNumber = 999_99_9999L
    val hexBytes = 0xFF_EC_DE_5E
    val bytes = 0b11010010_01101001_10010100_10010010

    print("$oneMillion," +
            "$creditCardNumber," +
            "$socialSecurityNumber," +
            "$hexBytes," +
            "$bytes")
}

class Cls {
    //...
}

fun representation() {
    val a = 10000
    val b = 10000
    println(a === a)
    println(a === b)
    println(a == b)

    val cls1 = Cls()
    var cls2 = Cls()

    println(cls1 === cls2)
    cls2 = cls1
    println(cls1 === cls2)

    val boxedA: Int? = a
    val anotherBoxedA: Int? = a
    println(boxedA === anotherBoxedA)
    println(boxedA!! === anotherBoxedA!!)
}

/**
 * toByte(): Byte
 * toShort(): Short
 * toInt(): Int
 * toLong(): Long
 * toFloat(): Float
 * toDouble(): Double
 * toChar(): Char
 */
fun explicitConversions() {
//    이런식의 캐스팅은 불가.
//    val b: Byte = 1
//    val i: Int = b // ERROR

    val b: Byte = 1
    val i: Int = b.toInt()
    println("$b , $i")

}

/**
 * shl(bits) – signed shift left (Java's <<)
 * shr(bits) – signed shift right (Java's >>)
 * ushr(bits) – unsigned shift right (Java's >>>)
 * and(bits) – bitwise and
 * or(bits) – bitwise or
 * xor(bits) – bitwise xor
 * inv() – bitwise inversion
 */
fun shiftOperator() {
    /**
     * 1 shl 2 -> 00000001 << 2 -> 00000100
     * 00000100 & 00010101 -> 00000100
     */
    val x = (1 shl 2) and 0b00010101
    println(x)
}

fun arrays() {
    // i는 idx
    val asc = Array(5, {i -> i * i})
    asc.forEach { i -> print("$i ") }
}