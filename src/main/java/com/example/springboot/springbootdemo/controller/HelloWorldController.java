package com.example.springboot.springbootdemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

	@GetMapping(path = "/")
	public String sayHello() {
		System.out.println("Controller started");
		System.out.println("Controller end");
		return "Hello!! from Spring Boot Application";
	}

}
