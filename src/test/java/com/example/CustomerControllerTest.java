package com.example;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.verify;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;

public class CustomerControllerTest extends BaseTest {

	@Mock
	private CustomerService mockService;

	@InjectMocks
	private CustomerController controller;

	@Test
	public void test() {
		final CustomerInputDto dto = CustomerInputDto.builder().build();

		// action
		final String message = controller.saveCustomer(dto);
		final String expectedMessage = "Customer saved successfully";

		verify(mockService).saveCustomer(dto.toCustomer());

		assertEquals(message, expectedMessage);
		assertThat(message).isEqualTo(expectedMessage);
	}

}
