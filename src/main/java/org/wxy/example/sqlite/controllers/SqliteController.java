package org.wxy.example.sqlite.controllers;

import org.apache.commons.lang3.RandomStringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.wxy.example.sqlite.model.Person;
import org.wxy.example.sqlite.service.PersonService;

import java.util.List;

@Controller
@RequestMapping("/person")
public class SqliteController {

	private static String string = "abcdefghijklmnopqrstuvwxyz";

	@Autowired
	PersonService personService;

	@RequestMapping("/list")
	@ResponseBody
	public List<Person> listPerson() {
		List<Person> list = personService.selectAll();
		return list;
	}

	@RequestMapping("/add")
	@ResponseBody
	public String add() {
		Person person = new Person();
		person.setAge(Integer.valueOf(RandomStringUtils.randomNumeric(2)));
		person.setName(RandomStringUtils.random(5,string));
		personService.insert(person);
		return "success";

	}


}
