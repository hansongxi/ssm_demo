package com.wntiem.ssm_web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.wntiem.ssm_web.bean.Person;
import com.wntiem.ssm_web.service.PersonService;

@Controller
public class PersonController {

	@Autowired
	PersonService personService;

	@RequestMapping("/showPerson")
	public String showPersons(Model model) {
		List<Person> persons = personService.loadPersons();
		model.addAttribute("persons", persons);
		return "showperson";
	}

}
