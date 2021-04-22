package com.example;

public class CustomerAlreadyExistsException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6292502582286932798L;

	public CustomerAlreadyExistsException(String message) {
		super(message);
	}

}
