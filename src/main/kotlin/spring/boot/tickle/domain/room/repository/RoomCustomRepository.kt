package spring.boot.tickle.domain.room.repository

import com.querydsl.jpa.impl.JPAQueryFactory
import org.springframework.stereotype.Repository
import spring.boot.tickle.domain.room.QRoom.room
import spring.boot.tickle.domain.room.Room

@Repository
class RoomCustomRepository(
    val jpaQueryFactory: JPAQueryFactory
) {

    fun getRoomByChatId(chatId: Long) : List<Room> {
        return jpaQueryFactory.select(room)
            .from(room)
            .where(room.chat.idx.eq(chatId))
            .fetch()
    }

}