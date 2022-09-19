package spring.boot.tickle.syntax.builder

import org.junit.jupiter.api.Test
import spring.boot.tickle.domain.chat.Chat
import spring.boot.tickle.domain.member.Member
import java.time.LocalDateTime

class BuilderTest {

    @Test
    fun builderTest() {
        val chat = Chat(
            msg = "hyunin",
            createdAt = LocalDateTime.now()
        )

        println(chat)

        val member = Member.Builder()
            .name("honghyunin")
            .build()

        println(member)
    }

}