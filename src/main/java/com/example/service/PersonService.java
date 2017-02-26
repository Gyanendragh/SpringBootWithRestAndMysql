package com.example.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.domain.Person;

@Service
public class PersonService {
	
	private List<Person> persons= new ArrayList<>(Arrays.asList(
			new Person(1,"John","john@gmail.com"),
			new Person(2,"JohnDoe","john.Doe@gmail.com"),
			new Person(4,"Gyanu","gyanu@hotmail.com")));
	
	public List<Person> getAllPerson(){
		return persons;
	}
	
	public Person getPersonById(long id){
		return persons.stream().filter(p -> p.getId()==id).findFirst().get();
	}
	
	public void addPerson(Person person) {
		persons.add(person);
		
	}

	public void updatePerson(long id,Person person) {
		for(int i=0; i< persons.size(); i++){
			Person p = persons.get(i);
			if(p.getId()==id){
				persons.set(i, person);
				return;
			}
		}
		
	}

	public void deletePerson(long id) {
		persons.removeIf(p -> p.getId()==id);
		
	}
	

}
