package com.example;

import javax.inject.Inject;
import javax.inject.Singleton;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Singleton
public class CustomerService {

	@Inject
	private final CustomerRepository repository;

	public void saveCustomer(Customer customer) {
		System.out.println("Invocando save do repository");

		final Boolean existsWithThisCpf = repository.exists(customer.getCpf());
		if (existsWithThisCpf) {
			final String messageFormatted = String.format("This customer with the CPF %s already exists",
					customer.getClass());
			
			throw new CustomerAlreadyExistsException(messageFormatted);
		}

		repository.save(customer);
	}
}
