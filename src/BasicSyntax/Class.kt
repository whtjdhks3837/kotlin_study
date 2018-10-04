package BasicSyntax

abstract class Shape(val sides: List<Double>) {
    // getter를 명시적으로 생성한다.
    // val = final, var = 변
    val perimeter : Double get() = sides.sum()
    abstract fun calculateArea(): Double
}

interface RectangleProperties {
    val isSquare: Boolean
}

class Rectangle(var width: Double, var height: Double)
    : Shape(listOf(width, height, width, height)), RectangleProperties {
    override fun calculateArea(): Double = width * height

    override val isSquare: Boolean get() = width == height
}

class Triangle(var sideA: Double, var sideB: Double, var sideC: Double)
    : Shape(listOf(sideA, sideB, sideC)) {
    override fun calculateArea(): Double {
        val s = perimeter / 2;
        return Math.sqrt(s * (s - sideA) * (s - sideB) * (s - sideC))
    }
}