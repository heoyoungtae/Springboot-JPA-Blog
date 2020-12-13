package com.dudxo.blog.test;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BlogControllerTest {

	@GetMapping("/hello/test")
	public String hello() {
		return "<h2>Hello Spring Boot!</h2>";
	}
}
