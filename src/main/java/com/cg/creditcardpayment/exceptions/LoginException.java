package com.cg.creditcardpayment.exceptions;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LoginException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static final Logger logger = LoggerFactory.getLogger(LoginException.class);
	
	String msg;
	public LoginException(String msg) {
		this.msg=msg;
		logger.info(msg);
	}
	
	@Override
	public String toString() {
		return msg;
	}

}
