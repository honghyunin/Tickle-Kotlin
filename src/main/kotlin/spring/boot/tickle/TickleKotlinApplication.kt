package spring.boot.tickle

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class TickleKotlinApplication

fun main(args: Array<String>) {
	runApplication<TickleKotlinApplication>(*args)
}
