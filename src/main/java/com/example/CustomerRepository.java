package com.example;

public interface CustomerRepository {

	void save(Customer customer);

	Boolean exists(String cpf);

}
