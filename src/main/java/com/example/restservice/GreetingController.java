package com.example.restservice;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

	@Autowired
	private Greeting greeting;
	
	@CrossOrigin(origins = "https://moulikiran.github.io/demoprofile/")
	@GetMapping("/greeting")
	public Greeting greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
		//greeting.setContent(name);
		return greeting;
	}
	
	@CrossOrigin(origins = "https://moulikiran.github.io/demoprofile/")
	@GetMapping("/greeting/selectcomponent")
	public void dateFromMobile(@RequestParam(value = "name", defaultValue = "World") String name) {
		greeting.setContent(name);
	}
}
