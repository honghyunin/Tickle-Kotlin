package spring.boot.tickle.domain.room.repository

import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository
import spring.boot.tickle.domain.room.Room

@Repository
interface RoomRepository: JpaRepository<Room, Long> {
}