package com.dailyjava.store.api.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class ProductNotFoundException extends RuntimeException {

    /**
	 * 
	 */
	private static final long serialVersionUID = -2732741025137947494L;

	public ProductNotFoundException(Long id) {
        super(String.format("Product with id '%s' not found", id));
    }
}
