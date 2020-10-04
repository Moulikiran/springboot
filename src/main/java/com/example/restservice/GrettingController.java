package com.example.restservice;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GrettingController {

	@Autowired
	private Greeting greeting;
	
	@CrossOrigin(origins = "http://localhost:4200")
	@GetMapping("/greeting")
	public Greeting greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
		//greeting.setContent(name);
		return greeting;
	}
	
	@CrossOrigin(origins = "http://localhost:4200")
	@GetMapping("/greeting/selectcomponent")
	public void dateFromMobile(@RequestParam(value = "name", defaultValue = "World") String name) {
		greeting.setContent(name);
	}
}