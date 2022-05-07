package com.example.OnlineQuizSystem;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class AddNumbers {

	@RequestMapping(value="/add/{a}/{b}")
	public int Add(@PathVariable(value = "a") int a,@PathVariable(value = "b") int b) {
		return a+b;
	}
}
	