package com.tcs.springrest.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tcs.springrest.model.Person;
import com.tcs.springrest.model.Product;
import com.tcs.springrest.service.PersonService;
import com.tcs.springrest.service.ProductService;

@RestController
public class DataController {
	
	private static Logger log = LoggerFactory.getLogger(DataController.class);

	@Autowired
	PersonService personService;
	
	@Autowired
	ProductService productService;
	
	@GetMapping("/persons")
	public Person getPerson() {
		log.info("get persons start");
		return personService.getPerson();
	}
	
	@GetMapping("/products")
	public Product getProduct() {
		log.info("get products start");
		return productService.getProduct();
	}
}
