package com.dailyjava.store.api.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class OrderNotFoundException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7288237882576065829L;

	public OrderNotFoundException(String id) {
		super(String.format("Order with id '%s' not found", id));
	}

}
