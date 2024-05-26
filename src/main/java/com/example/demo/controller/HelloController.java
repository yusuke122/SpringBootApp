package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

//import ch.qos.logback.core.model.Model;

@Controller
public class HelloController {
	@GetMapping("/hello")
	/*
	public String hello(@RequestParam("msg") String message, Model model) {
		model.addAttribute("msg",message);
		return "hello";
	}
	*/
	public String helloByPost(@RequestParam("msg") String message, Model model) {
		model.addAttribute("msg",message);
		return "helloPost";
	}
}
