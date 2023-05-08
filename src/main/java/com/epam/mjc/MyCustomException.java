package com.epam.mjc;

public class MyCustomException extends IllegalArgumentException{

	private long id;

	public MyCustomException(long id) {

		this.id = id;
	}

	@Override
	public String getMessage() {
		return "Could not find student with ID " + id;
	}
}
