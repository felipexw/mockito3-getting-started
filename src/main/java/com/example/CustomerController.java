package com.example;

import javax.inject.Inject;
import javax.inject.Singleton;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Singleton
public class CustomerController {

	@Inject
	private final CustomerService service;

	public String saveCustomer(CustomerInputDto dto) {
		service.saveCustomer(dto.toCustomer());		

		return "Customer saved successfully";
	}
}
