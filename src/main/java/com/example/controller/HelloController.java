package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.domain.Person;
import com.example.service.PersonService;

@RestController
public class HelloController {
	
	@Autowired
	PersonService personService;
	
	@RequestMapping(value="/hi")
	public String sayHello(){
		return "Hello";
	}
	
	@RequestMapping(value="/persons")
	public List<Person> getAllPersons(){
		return personService.getAllPerson();
	}
	
	@RequestMapping(value="/persons/{id}")
	public Person getPersonById(@PathVariable long id){
		return personService.getPersonById(id);
	}
	
	@RequestMapping(value="/persons",method=RequestMethod.POST)
	public void addPerson(@RequestBody Person person){
		 personService.addPerson(person);
	}
	
	@RequestMapping(value="/persons/{id}",method=RequestMethod.PUT)
	public void updatePerson(@RequestBody Person person, @PathVariable long id){
		personService.updatePerson(id,person);
	}
	
	@RequestMapping(value="/persons/{id}",method=RequestMethod.DELETE)
	public void deletePerson(@PathVariable long id){
		personService.deletePerson(id);
	}

}
