package com.helloworld.helloWorld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping ("/helloWorld")

public class HelloWorldController {
	
	@GetMapping
	public String helloWorld() {
		return "Meu objetivo essa semana é entender String";
	}
}
