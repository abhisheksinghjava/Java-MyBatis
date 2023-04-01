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
package com.example.mybatisdb.service.impl;

import java.util.Objects;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import com.example.mybatisdb.dto.UserDetailsDto;
import com.example.mybatisdb.exception.UserException;
import com.example.mybatisdb.mapper.UserDetailsCustomMapper;
import com.example.mybatisdb.service.UserService;
import com.example.mybatisdb.common.util.Constants;

/**
 * The Class UserServiceImpl.
 *
 * @author - abhishek.singh@abc.com
 * @createdAt 01 April, 2023
 * @description UserServiceImpl class is a implementation class of UserService.
 */
@Service
public class UserServiceImpl implements UserService {

	/** The user mapper. */
	@Autowired
	UserDetailsCustomMapper userMapper;

	/** The Constant LOGGER. */
	private static final Logger LOGGER = LoggerFactory.getLogger(UserServiceImpl.class);

	/**
	 * Gets the user detail by username.
	 *
	 * @param userRegisterReqDto the user register req dto
	 * @return the user detail by username
	 * @throws UserException the user exception
	 */
	@Override
	public UserDetailsDto getUserDetailByUsername(final String userName) throws UserException {
		LOGGER.info("User Name Is - {}", userName);
		UserDetailsDto userDetailsDto = userMapper.getUserDetailsByUserName(userName);
		if (Objects.isNull(userDetailsDto)) {
			throw new UserException(Constants.ERR0002_MSG, Constants.ERR0002, HttpStatus.NO_CONTENT);
		}
		return userDetailsDto;
	}

}