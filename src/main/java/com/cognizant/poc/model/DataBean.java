package com.cognizant.poc.model;

public class DataBean {
	String message;

	public DataBean(String message) {
		super();
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public String toString() {
		return "DataBean [message=" + message + "]";
	}
	
}
