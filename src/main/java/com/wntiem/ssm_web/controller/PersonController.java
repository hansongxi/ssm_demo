package com.wntiem.ssm_web.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.wntiem.ssm_web.bean.Person;
import com.wntiem.ssm_web.service.PersonService;

@Controller
public class PersonController {
	
	
	

	public static final Logger logger = LoggerFactory.getLogger(PersonController.class);

	@Autowired
	PersonService personService;

	@RequestMapping("/showPerson")
	public String showPersons(Model model) {
		List<Person> persons = personService.loadPersons();
		System.out.println("Sssssss");
		System.out.println(logger.getName());
		logger.info("chnggogn ddddddddddd");
		if(persons!=null) {
			
			logger.info("chnddd");
		}
		model.addAttribute("persons", persons);
		return "showperson";
	}

}
