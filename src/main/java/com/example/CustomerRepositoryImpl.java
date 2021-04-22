package com.example;

import java.util.HashMap;
import java.util.Map;

import javax.inject.Singleton;

@Singleton
public class CustomerRepositoryImpl implements CustomerRepository {

	private final Map<String, Customer> customers = new HashMap<>();

	@Override
	public void save(Customer customer) {
		System.out.println(String.format("Salvando o customer %s", customer.getCpf()));

		customers.put(customer.getCpf(), customer);
	}

	@Override
	public Boolean exists(String cpf) {
		return customers.containsKey(cpf);
	}

}
