package com.activity.feed.exception;

import org.h2.api.ErrorCode;

public class ResourceNotFoundException extends RuntimeException {
	
	private final ErrorCode code;
	
	public ResourceNotFoundException(ErrorCode code) {
		super();
		this.code = code;
	}

	public ResourceNotFoundException(String message, Throwable cause, ErrorCode code) {
		super(message, cause);
		this.code = code;
	}

	public ResourceNotFoundException(String message, ErrorCode code) {
		super(message);
		this.code = code;
	}

	public ResourceNotFoundException(Throwable cause, ErrorCode code) {
		super(cause);
		this.code = code;
	}
	
	public ErrorCode getCode() {
		return this.code;
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	

}
