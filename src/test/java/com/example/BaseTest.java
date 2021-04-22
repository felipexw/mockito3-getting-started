package com.example;

import org.junit.jupiter.api.BeforeEach;
import org.mockito.MockitoAnnotations;

public class BaseTest {

	@BeforeEach
	final void setUpForTest() {
		MockitoAnnotations.openMocks(this);
	}

}
