package abstrac

interface PersonInterface {
    fun talk()
    fun eat()
    fun walk()
    //sleep
    fun sleep()
}

open class Person(val name: String) : PersonInterface {
    override fun talk() {
        println("$name talk")
    }

    override fun eat() {
        println("$name eat")

    }

    override fun walk() {
        println("$name walk")

    }

    override fun sleep() {
        println("$name sleep")
    }

}


class MathTeacher(name: String) : Person(name) {
    fun teacherMath() {
        println("Math Teacher $name")
    }
}

class Footballer(name: String) : Person(name) {
    fun playFootball() {
        println("Footballer $name")
    }
}

class Businessman(name: String) : Person(name) {
    fun runBusiness() {
        println("Businessman $name")
    }
}

fun main(args: Array<String>) {
    val mathTeacher = MathTeacher("Alisa")
    mathTeacher.teacherMath()
    mathTeacher.talk()
    mathTeacher.walk()
    mathTeacher.eat()
    println("*************************")

}
