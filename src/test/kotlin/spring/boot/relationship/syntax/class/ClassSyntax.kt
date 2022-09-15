package spring.boot.relationship.syntax.`class`

import org.junit.jupiter.api.Test

open class ClassSyntax {

    class Rectangle(var height: Double, var length: Double): ClassSyntax() { //클래스간 상속과 구현은 :로 선언됩니다.
        var permieter = (height + length) * 2
    }

    @Test
    fun classSyntax() {
        val rectangle = Rectangle(5.0, 2.0)

        println("The perimeter is  ${rectangle.permieter}")
    }
}