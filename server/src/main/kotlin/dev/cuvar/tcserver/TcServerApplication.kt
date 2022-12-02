package dev.cuvar.tcserver

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class TcServerApplication

fun main(args: Array<String>) {
	runApplication<TcServerApplication>(*args)
}
