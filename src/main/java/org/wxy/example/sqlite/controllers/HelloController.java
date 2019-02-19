package org.wxy.example.sqlite.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.wxy.example.sqlite.bean.StudentProperties;

@RestController
public class HelloController {

	@Autowired
	private StudentProperties studentProperties;

	@RequestMapping("/hello")
	public String hello() {
		return "Hello,I am "+studentProperties.getName() +", "+studentProperties.getAge()+" years old";
	}
}