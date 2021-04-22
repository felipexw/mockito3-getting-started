package com.example;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CustomerInputDto {

	private String customerName;
	private String customerCpf;

	public Customer toCustomer() {
		return Customer.builder()//
				.cpf(customerCpf)//
				.name(customerName)//
				.build();
	}

}
