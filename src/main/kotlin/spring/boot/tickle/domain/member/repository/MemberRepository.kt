package spring.boot.tickle.domain.member.repository

import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository
import spring.boot.tickle.domain.member.Member

@Repository
interface MemberRepository: JpaRepository<Member, Long> {
}