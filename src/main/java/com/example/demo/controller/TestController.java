package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TestController {
	@GetMapping("/test")
	public String index(/*@RequestParam("msg") String message, Model model*/) {
		return "Test";
	}
}

