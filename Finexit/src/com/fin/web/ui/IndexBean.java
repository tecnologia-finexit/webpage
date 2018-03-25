package com.fin.web.ui;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

@Named
@RequestScoped
public class IndexBean{

	private String message;

	public IndexBean() {
		super();
		this.message = new Double(Math.random()).toString();
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public String toString() {
		return "IndexBean [message=" + message + "]";
	}
	
}
