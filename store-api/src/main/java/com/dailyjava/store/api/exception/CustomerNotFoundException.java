package com.dailyjava.store.api.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class CustomerNotFoundException extends RuntimeException {


	/**
	 * 
	 */
	private static final long serialVersionUID = -5829942127846689296L;

	public CustomerNotFoundException(Long id) {
		super(String.format("Customer with id '%s'", id));
	}

}
