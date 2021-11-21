package com.dailyjava.store.api.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.CONFLICT)
public class ProductDeletionException extends RuntimeException {

    /**
	 * 
	 */
	private static final long serialVersionUID = 4859749145074022862L;

	public ProductDeletionException(Long id) {
        super(String.format("Product with id '%s' cannot be deleted", id));
    }
}