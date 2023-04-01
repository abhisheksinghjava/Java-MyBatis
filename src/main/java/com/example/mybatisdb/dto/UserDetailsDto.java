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
package com.example.mybatisdb.dto;

/**
 * The Class UserDetails.
 *
 * @author - abhishek.singh@abc.com
 * @createdAt 05 April, 2022
 * @description UserDetails class is a POJO class for user.
 */
public class UserDetailsDto {


	/** The user name. */
	private String userName;

	/** The user id. */
	private int userId;
	

	/**
	 * Instantiates a new user details dto.
	 *
	 * @param userName the user name
	 * @param userId the user id
	 */
	public UserDetailsDto(String userName, int userId) {
		super();
		this.userName = userName;
		this.userId = userId;
	}

	/**
	 * Gets the user id.
	 *
	 * @return the user id
	 */
	public int getUserId() {
		return userId;
	}

	/**
	 * Sets the user id.
	 *
	 * @param userId the new user id
	 */
	public void setUserId(int userId) {
		this.userId = userId;
	}

	/**
	 * Instantiates a new user.
	 */
	public UserDetailsDto() {

	}

	/**
	 * Gets the user name.
	 *
	 * @return the user name
	 */
	public String getUserName() {
		return userName;
	}

	/**
	 * Sets the user name.
	 *
	 * @param userName the new user name
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}

	
	
	}