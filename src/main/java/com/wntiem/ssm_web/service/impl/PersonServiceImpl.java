package com.wntiem.ssm_web.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wntiem.ssm_web.bean.Person;
import com.wntiem.ssm_web.mapper.PersonMapper;
import com.wntiem.ssm_web.service.PersonService;


@Service
public class PersonServiceImpl implements PersonService{
	
	@Autowired
	PersonMapper personMapper;

	public List<Person> loadPersons() {
		List<Person> persons = personMapper.queryAll();
		return persons;
	}

}
