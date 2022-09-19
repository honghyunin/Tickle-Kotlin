package spring.boot.tickle.domain.chat.repository

import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository
import spring.boot.tickle.domain.chat.Chat

@Repository
interface ChatRepository: JpaRepository<Chat, Long> {
}