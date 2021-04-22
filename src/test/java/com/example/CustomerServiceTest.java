package com.example;

import static org.mockito.Mockito.mockConstruction;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockedConstruction;

class CustomerServiceTest extends BaseTest {
	@Mock
	private CustomerRepository mockRepository;

	@InjectMocks
	private CustomerService service;

	@Test
	void test() {
		final Customer customer = new Customer();

		when(mockRepository.exists(customer.getCpf())).thenReturn(true);

		try {
			service.saveCustomer(customer);
		} catch (CustomerAlreadyExistsException e) {
			final String expectedMessage = String.format("This customer with the CPF %s already exists",
					customer.getClass());
			Assertions.assertThat(e.getMessage()).isEqualTo(expectedMessage);

			verify(mockRepository).exists(customer.getCpf());
			// verifyNoInteractions(mockRepository);
		}
	}

	@Test
	void tes2() {
		try (MockedConstruction<Customer> mockConstruction2 = mockConstruction(Customer.class)) {
			final Customer customer = new Customer();
			customer.setCpf("cpf");

			verify(customer).setCpf("cpf");
		}

	}

}
