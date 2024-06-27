package com.example.HelloWorld.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
 
@RestController
public class WelcomeController {
	@GetMapping("welcome")
	public String wish() {
		return "Hello World";
	}
 
}