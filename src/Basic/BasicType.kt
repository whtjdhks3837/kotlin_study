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

fun representation() {
    val a = 10000
    val b = 10000
    /**
     * '===' 연산자는 같은 참조인지를 판별하는 연산자.
     * 근데 왜 a랑 b가 같아?? 이상한놈들이네
     */
    println(a === a)
    println(a === b)
    println(a == b)

    val boxedA: Int? = a
    val anotherBoxedA: Int? = a
    /**
     * '!!' 연산자는 null safe를 무시하는 연산자.
     * 도대체 왜 참조가 같은거야??
     */
    println(boxedA === anotherBoxedA)
    println(boxedA!! === anotherBoxedA!!)
    println(boxedA == anotherBoxedA)
    println(boxedA!! == anotherBoxedA!!)
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

    /**
     * shl(bits) – signed shift left (Java's <<)
     * shr(bits) – signed shift right (Java's >>)
     * ushr(bits) – unsigned shift right (Java's >>>)
     * and(bits) – bitwise and
     * or(bits) – bitwise or
     * xor(bits) – bitwise xor
     * inv() – bitwise inversion
     */

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