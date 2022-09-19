package spring.boot.tickle.domain.room.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import spring.boot.tickle.domain.room.Room
import spring.boot.tickle.domain.room.service.RoomService

@RequestMapping("/room")
@RestController
class RoomController(
    private val roomService: RoomService
) {

    @GetMapping("/{chatId}")
    fun getOneRoom(@PathVariable chatId: Long): List<Room> {
        return roomService.getRoomsByChatId(chatId);
    }
}