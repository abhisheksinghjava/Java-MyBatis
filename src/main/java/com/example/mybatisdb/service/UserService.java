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
package com.example.mybatisdb.service;

import com.example.mybatisdb.dto.UserDetailsDto;
import com.example.mybatisdb.exception.UserException;

/**
 * The Interface UserService.
 *
 * @author - abhishek.singh@abc.com
 * @CreatedAt 01-April-2023
 * @description Interface for UserService.
 */
public interface UserService {

	
	/**
	 * Gets the user detail by username.
	 *
	 * @param userRegisterReqDto the user register req dto
	 * @return the user detail by username
	 * @throws UserException the user exception
	 */
	UserDetailsDto getUserDetailByUsername(final String userName) throws UserException;

}
