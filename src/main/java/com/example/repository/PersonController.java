package com.example.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.domain.Person;

@RestController
@RequestMapping(value="/")
public class PersonController {
	
	@Autowired
	PersonRepository personRepository;
	
	@RequestMapping(value="/person")
	@ResponseBody
	public List<Person> getAllPerson(){
		return  personRepository.findAll();
	}

}
