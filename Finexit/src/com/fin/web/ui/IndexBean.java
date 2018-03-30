package com.fin.web.ui;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.enterprise.context.ConversationScoped;
import javax.inject.Named;

@Named
@ConversationScoped
public class IndexBean implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -3221821742903072374L;
	private String message;
	private List<String> list;

	public IndexBean() {
		super();
		
		this.list = new ArrayList<>();
		int j = new Double( Math.random()*30).intValue();
		for(int i =0; i<j;i++) {
			list.add("Item " + i); 
		}
		
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public List<String> getList() {
		return list;
	}

	public void setList(List<String> list) {
		this.list = list;
	}

	@Override
	public String toString() {
		return "IndexBean [message=" + message + "]";
	}
	
	public void testMethod() {
		System.out.println("Hi, I'm a method");
	}
	
}
