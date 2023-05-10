package Interface


abstract class Shape() {
    abstract fun p()
    abstract fun y()
}
class Rectangle(val a:Int,val b:Int):Shape(){
    override fun p() {
        val result = (a+b)*2
        println("P = $result")
    }

    override fun y() {
        val result =  a*b
        println("Y = $result")
    }
}

fun main(args: Array<String>) {
    val rectangle = Rectangle(5,6)
    rectangle.p()
    rectangle.y()


}


