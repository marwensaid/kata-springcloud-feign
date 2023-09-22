package com.howtodoinjava.feign.client.exception;

public class BadRequestException extends Exception {

	public BadRequestException(String reason) {
		super(reason);
	}

}
