package com.dailyjava.store.api.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.CONFLICT)
public class CustomerDeletionException extends RuntimeException{

	/**
	 * 
	 */
	private static final long serialVersionUID = 3651418810650524905L;

	public CustomerDeletionException(Long id) {
		super(String.format("Customer with id '%s', cannot be deleted", id));
	}
}
