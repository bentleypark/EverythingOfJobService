package com.bentley.everythingofjob

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@SpringBootApplication
@RestController
class EverythingofjobApplication {

	@GetMapping
	fun hello() = "hello world"
}

fun main(args: Array<String>) {
	runApplication<EverythingofjobApplication>(*args)
}
