package spring.boot.relationship.syntax.conditionalexpressions

import org.junit.jupiter.api.Test

class ConditionalExpressions {

    fun maxOf(a: Int, b: Int): Int {
        if (a > b) {
            return a
        } else {
            return b
        }
    }

    fun briefMaxof(a: Int, b: Int) = if (a > b) a else b // 내가 이해하기로 이러한 문법은
    // `briefMaxof` 메서드 바디에 대입연산자로 `if( a>b) a else b` 이 코드를 대입하여 메서드가 실행될 때 해당 코드가 실행되도록 하는 거라고 생각한다

    @Test
    fun conditionalExpressionsTest() {
        println(briefMaxof(5 , 4)) // 5
        println(maxOf(1, 5)) // 5
    }
}