package spring.boot.relationship.syntax.variables

class VariablesSyntax {

    fun valSyntax() {
        // val는 변수의 값을 1회 할당 할 수 있다.
        val a: Int = 1
        val b = 2 // 자동으로 타입 유추
        val c: Int

        //b += 2 Val cannot be reassigned error : val 변수는 값을 재할당할 수 없다는 에러 발생
    }

    fun varSyntax() {
        var x = 5 // 위에 있듯이 타입 유추 기능
        x += 1
    }

    // 전역 변수 (Top Level)
    val PI = 3.14 // 상수는 보통 대문자로 선언하는 것이 컨벤션
    var x = 3 // 전역에서 사용가능하며 재할당도 가능

    fun incrementX() {
        x += 1
    }

}