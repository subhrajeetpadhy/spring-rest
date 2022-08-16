package com.tcs.springrest.service;

import org.springframework.stereotype.Service;

import com.tcs.springrest.model.Product;

@Service
public class ProductService {

	public Product getProduct() {
		Product product = new Product();
		product.setId(1);
		product.setName("ABC");
		product.setPrice(200);
		return product;
	}
}
