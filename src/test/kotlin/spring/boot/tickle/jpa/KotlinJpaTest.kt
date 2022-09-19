package spring.boot.tickle.jpa

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.dao.DataIntegrityViolationException
import spring.boot.tickle.domain.member.Member
import spring.boot.tickle.domain.member.repository.MemberRepository
import spring.boot.tickle.domain.room.repository.RoomCustomRepository
import javax.transaction.Transactional

@SpringBootTest
class KotlinJpaTest
    @Autowired
    constructor(
        val roomCustomRepository: RoomCustomRepository,
        val memberRepository: MemberRepository

    ) {

    @Transactional
    @Test
    fun queryDslTest() {
        println("QueryDsl Start")
        roomCustomRepository.getRoomByChatId(1L).forEach { println("조회 결과 :" + it.chat.message + "\n" + it.member.name) }
        println("querydsl End")
    }

    @Test
    fun 회원이름이_null일때_throw_error() {
        val member = Member.Builder()
            .build();
        assertThrows<DataIntegrityViolationException> {
            memberRepository.save(member) }
    }
}