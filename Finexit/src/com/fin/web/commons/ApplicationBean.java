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
	private static final long serialVersionUID = -8858450532723384349L;
	private final String COMPANY_NAME ="Finexit";
	private final String URL_HOME = "http://35.224.55.235/";

	public String getCOMPANY_NAME() {
		return COMPANY_NAME;
	}

	public String getURL_HOME() {
		return URL_HOME;
	}
	
}
