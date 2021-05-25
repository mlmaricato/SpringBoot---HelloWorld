package com.hello.hello.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping ("/hello")

public class HelloController {

	@GetMapping
	public String hello() {
		return "A habilidade que utilizei foi atenção aos detalhes e a mentalidade foi persistência!";
	}
}
