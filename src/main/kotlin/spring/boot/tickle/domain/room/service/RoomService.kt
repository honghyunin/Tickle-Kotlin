package spring.boot.tickle.domain.room.service

import org.springframework.stereotype.Service
import spring.boot.tickle.domain.room.Room
import spring.boot.tickle.domain.room.repository.RoomCustomRepository

@Service
class RoomService(
    val roomCustomRepository: RoomCustomRepository
) {

    fun getRoomsByChatId(chatId: Long) : List<Room> {
        return roomCustomRepository.getRoomByChatId(chatId)
    }
}