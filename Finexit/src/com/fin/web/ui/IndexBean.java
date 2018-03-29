package com.fin.web.ui;

import java.io.Serializable;

import javax.enterprise.context.ConversationScoped;
import javax.inject.Named;

@Named
@ConversationScoped
public class IndexBean implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -6990116898145987614L;
	private String message;

	public IndexBean() {
		super();
		System.out.println("IndexBean.Constructor");
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
