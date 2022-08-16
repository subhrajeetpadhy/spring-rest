package com.tcs.springrest.service;

import org.springframework.stereotype.Service;

import com.tcs.springrest.model.Person;

@Service
public class PersonService {

	public Person getPerson() {
		
		Person person = new Person();
		person.setFirstName("Vishal");
		person.setLastName("Singh");
		return person;
	}
	
}
