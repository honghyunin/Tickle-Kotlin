package spring.boot.tickle.domain.room

import spring.boot.tickle.domain.chat.Chat
import spring.boot.tickle.domain.member.Member
import javax.persistence.*

@Entity
class Room(memberId: Member, chatId: Chat) {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    val idx: Long = 0

    @ManyToOne
    @JoinColumn(name = "member_idx")
    val member: Member = memberId

    @ManyToOne
    @JoinColumn(name = "chat_idx")
    val chat: Chat = chatId

}