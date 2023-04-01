/** COPYRIGHT (C) ABC INDIA PVT.LTD.
 * 
 * ALL RIGHTS RESERVED BY ABC INDIA PVT.LTD., THIS PROGRAM
 * MUST BE USED SOLELY FOR THE PURPOSE FOR WHICH IT WAS
 * FURNISHED BY ABC INDIA PVT.LTD., NO PART OF THIS PROGRAM
 * MAY BE REPRODUCED OR DISCLOSED TO OTHERS, IN ANY FORM
 * WITHOUT THE PRIOR WRITTEN PERMISSION OF ABC INDIA PVT.LTD..
 * 
 * ABC INDIA PVT.LTD. CONFIDENTIAL AND PROPRIETARY
 */
package com.example.mybatisdb.exception;

import org.springframework.http.HttpStatus;

/**
 * The UserException.
 *
 * @author - abhishek.singh@abc.com
 * @createdAt 01 April, 2023
 * @description UserException class.
 */
public class UserException extends Exception {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 3L;

	/** The error msg. */
	protected String errorMsg;

	/** The error code. */
	protected String errorCode;

	/** The http status. */
	protected HttpStatus httpStatus;

	/**
	 * Instantiates a new ISP exception.
	 *
	 * @param errorMsg   the error msg
	 * @param errorCode  the error code
	 * @param httpStatus the http status
	 */
	public UserException(String errorMsg, String errorCode, HttpStatus httpStatus) {
		super();
		this.errorMsg = errorMsg;
		this.errorCode = errorCode;
		this.httpStatus = httpStatus;
	}

	/**
	 * Instantiates a new ISP exception.
	 */
	public UserException() {

	}

	/**
	 * Instantiates a new ISP exception.
	 *
	 * @param errorMsg  the error msg
	 * @param errorCode the error code
	 */
	public UserException(String errorMsg, String errorCode) {
		super(errorMsg);
		this.errorMsg = errorMsg;
		this.errorCode = errorCode;
	}

	/**
	 * Instantiates a new ISP exception.
	 *
	 * @param errorMsg the error msg
	 */
	public UserException(String errorMsg) {
		super(errorMsg);
		this.errorMsg = errorMsg;
	}

	/**
	 * Instantiates a new ISP exception.
	 *
	 * @param message the message
	 * @param cause   the cause
	 */
	public UserException(String message, Throwable cause) {
		super(message, cause);
	}

	/**
	 * Instantiates a new ISP exception.
	 *
	 * @param cause the cause
	 */
	public UserException(Throwable cause) {
		super(cause);
	}

	/**
	 * Gets the error msg.
	 *
	 * @return the errorMsg
	 */
	public String getErrorMsg() {
		return errorMsg;
	}

	/**
	 * Gets the error code.
	 *
	 * @return the errorCode
	 */
	public String getErrorCode() {
		return errorCode;
	}

	/**
	 * Gets the http status.
	 *
	 * @return the http status
	 */
	public HttpStatus getHttpStatus() {
		return httpStatus;
	}

}
