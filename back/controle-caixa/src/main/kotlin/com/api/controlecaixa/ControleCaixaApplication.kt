package com.api.controlecaixa

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@SpringBootApplication
@RestController
class ControleCaixaApplication{
	@GetMapping("/")
	fun olaMundo():String{
		return "<div style='width:70px;height:70px;background-color: blue'> ALEXANDRE É LINDO </div>";
	}
}

fun main(args: Array<String>) {
	runApplication<ControleCaixaApplication>(*args)

}
