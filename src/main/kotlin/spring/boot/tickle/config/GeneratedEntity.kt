package spring.boot.tickle.config

import org.springframework.stereotype.Component
import spring.boot.tickle.domain.chat.Chat
import spring.boot.tickle.domain.chat.repository.ChatRepository
import spring.boot.tickle.domain.member.Member
import spring.boot.tickle.domain.member.repository.MemberRepository
import spring.boot.tickle.domain.room.Room
import spring.boot.tickle.domain.room.repository.RoomRepository
import java.time.LocalDateTime
import javax.annotation.PostConstruct

@Component
class GeneratedEntity(
    private val memberRepository: MemberRepository, val memberChatRepository: RoomRepository, val chatRepository: ChatRepository
) {

    @PostConstruct
    fun saveEntities() {
        val saveMember = saveMember("jon")
        val saveMember1 = saveMember("alice")
        val saveMember2 = saveMember("notice")
        val saveMember3 = saveMember("keyboard")
        val saveMember4 = saveMember("airpods")
        val saveMember5 = saveMember("doyep")

        val saveChat = saveChat("hi")
        val saveChat1 = saveChat("bye")
        val saveChat2 = saveChat("i'm fine")
        val saveChat3 = saveChat("whats up")
        val saveChat4 = saveChat("hey roses")
        val saveChat5 = saveChat("buy to my item")

        saveMemberChat(saveMember, saveChat)
        saveMemberChat(saveMember1, saveChat1)
        saveMemberChat(saveMember2, saveChat2)
        saveMemberChat(saveMember3, saveChat3)
        saveMemberChat(saveMember4, saveChat4)
        saveMemberChat(saveMember5, saveChat5)
    }

    private fun saveChat(msg: String): Chat {
        return chatRepository.save(Chat(msg, LocalDateTime.now()))
    }

    private fun saveMember(name: String) : Member {
        return memberRepository.save(Member(name))
    }

    private fun saveMemberChat(member: Member, chat: Chat) {
        memberChatRepository.save(Room(member, chat))
    }
}