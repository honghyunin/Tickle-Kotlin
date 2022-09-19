package spring.boot.tickle.domain.chat

import com.fasterxml.jackson.annotation.JsonFormat
import org.springframework.data.annotation.LastModifiedDate
import java.time.LocalDateTime
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

@Entity
class Chat(msg: String, createdAt: LocalDateTime) {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    val idx: Long = 0

    val message: String = msg;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-mm-dd HH:mm", timezone = "Asia/Seoul")
    @LastModifiedDate
    val createdAt: LocalDateTime = createdAt

}