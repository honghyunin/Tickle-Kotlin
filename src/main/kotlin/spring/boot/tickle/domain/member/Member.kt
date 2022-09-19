package spring.boot.tickle.domain.member

import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

@Entity
class Member(username: String?) {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    val idx: Long = 0

    @Column(unique = true, nullable = false)
    val name: String? = username // 사실 이렇게까지 빌더 패턴을 사용하는 것은 주객전도 같다.

    data class Builder(
        var username: String? = null) {

        fun name(name: String) = apply { this.username = name }
        fun build() = Member(username)
    }
}

