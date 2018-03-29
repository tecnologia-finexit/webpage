package com.fin.web.commons;

import java.io.Serializable;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;

@Named
@ApplicationScoped
public class ApplicationBean implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 6006916580801632409L;
	private final String COMPANY_NAME ="finexit";

	public String getCOMPANY_NAME() {
		return COMPANY_NAME;
	}
	
}
