package spring.boot.tickle.syntax.loop

import org.junit.jupiter.api.Test

class Loop {

    @Test
    fun forLoop() {
        val items = listOf("apple", "banana", "kiwifruit")
        for (index in items.indices) {
            println("item at $index is ${items[index]}")
        }
        /*
        item at 0 is apple
        item at 1 is banana
        item at 2 is kiwifruit
         */
    }

    @Test
    fun whenLoop() { // List 내부에 해당 개체가 존재할 때 화살표 뒤에 코드를 실행하고 반복문이 종료됨
        val items = listOf("apple", "orange", "kiwifruit")
        when {
            "orange" in items -> println("juicy")
            "apple" in items -> println("apple is fine too")
            "kiwifruit" in items -> println("hi")
        }
        // 실행결과 juicy
    }

    @Test
    fun lambdaLoop() {
        val fruits = listOf("banana", "avocado", "apple", "kiwifruit")
        fruits
            .filter { it.startsWith("a") }
            .sortedBy { it }
            .map { it.uppercase() }
            .forEach { println(it) }
        /*
        자바 람다와 같이 내부 list에 있는 하나의 개체를 특정하기 위해 "it" 이라는 키워드를 사용하여 작성하고 filter는 컬렉션 안에 조건에 맞는 값을 찾는 것이다.
        sortedBy
        map 함수는 컬렉션안에 잇는 개체값을 조작하는 역할을 한다.
        원본 리스트를 바꾸지 않고 소팅된 리스트를 리턴한다.
        selector을 지정하면 소팅 기준을 정할 수 있다.
        페어를 사용할때도 하나의 기준을 두고 정렬하고싶을때 사용하면 된다.
        pair에 접근할땐 it.first it.second 이런식으로 하면 된다

         */
        println(fruits)
    }
}