package com.example.OnlineQuizSystem;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Addapi {
	
	@RequestMapping("/")
    public String home(){
        return "Hello World!";
    }
	
	@RequestMapping(value="/add/{a}/{b}")
	public int Add(@PathVariable(value = "a") int a,@PathVariable(value = "b") int b) {
		return a+b;
	}
	@RequestMapping(value="/sub/{a}/{b}")
	public int Sub(@PathVariable(value = "a") int a,@PathVariable(value = "b") int b) {
		return a-b;
	}
}
