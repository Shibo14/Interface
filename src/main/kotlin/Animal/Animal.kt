package Animal

 open class Animal(val name: String, val color: String, val size: Int) {
    init {
        println("Name :$name")
        println("Color: $color")
        println("Size: $size kg")
    }

    fun eat() {
        println("$name eat")
    }

    fun sleep() {
        println("$name  sleep")
    }

    fun walk() {
        println("$name walk")
    }


}