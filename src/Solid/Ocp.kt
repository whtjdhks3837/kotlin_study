package Solid

/**
 * 개방 폐쇄의 원칙.
 * 기능 확장에는 가능성이 열려 있어야하며
 * 변경에는 닫혀있어야 한다.
 * 변경할 부분과 변경되지 않을 부분을 엄격하게 구분해야함.
 */
fun openClosedPrinciple() {

}

//장난감 고유의 특성
interface Toy {
    fun price(price: Int)
    fun size(width: Double, height: Double)
    fun play()
}

class Cube: Toy {
    var price = 0
    var width = 0.0
    var height = 0.0

    override fun price(price: Int) {
        this.price = price
    }

    override fun size(width: Double, height: Double) {
        this.width = width
        this.height = height
    }

    override fun play() {
        while(true) {
            //...
        }
    }

    fun turnLeft() { }
    fun turnRight() { }
    fun turnTop() { }
    fun turnBottm() { }
}