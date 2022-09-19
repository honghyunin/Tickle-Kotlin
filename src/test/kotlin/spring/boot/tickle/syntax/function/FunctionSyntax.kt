package spring.boot.tickle.syntax.function

import org.junit.jupiter.api.Test

class FunctionSyntax {

    fun sum1(a: Int, b: Int): Int {
        return a+b
    }

    fun sum2(a: Int, b: Int) = a + b

    fun sum3(a: Int, b: Int) {
        println("sum of $a and $b is ${a + b}")
    }

    @Test
    fun sumTest() {

        println(sum1(2, 4)) // 6
        println(sum2(3, 4)) // 7
        println(sum3(10, 20)) // sum of 10 and 20 is 30

        println("{hi}")
        println("\$hi") // kotlin 에서는 String 내부에 변수의 값을 출력하려면 $를 통해 변수의 값을 동적으로 대입할 수 있다. 그냥 $를 그냥 문자열로 표현하고 싶으면 \(역슬래시)를 통해 표현할 수 있다.
    }
}