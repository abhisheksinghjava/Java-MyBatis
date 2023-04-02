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
package com.example.mybatisdb.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.mybatisdb.common.util.Constants;
import com.example.mybatisdb.common.util.DemoResponse;
import com.example.mybatisdb.common.util.Message;
import com.example.mybatisdb.dto.UserDetailsDto;
import com.example.mybatisdb.service.UserService;

/**
 * The Class UserController.
 *
 * @author - abhishek.singh@abc.com
 * @createdAt 01 April, 2023
 * @description UserController class that is the user class.
 */
@RestController
@CrossOrigin
@RequestMapping("${api.base-path}")
public class UserController {

	@Autowired
	UserService userService;

	/** The Constant LOGGER. */
	private static final Logger LOGGER = LoggerFactory.getLogger(UserController.class);

	@GetMapping(value = Constants.GET_USER_BY_USER_NAME_API_URL)
	public ResponseEntity<DemoResponse> getUserDetailByUsername(@PathVariable("userName") String userName)
			throws Exception {
		if (LOGGER.isTraceEnabled()) {
			LOGGER.trace("Entering into method UserController.getUserDetailByUsername");
		}
		if (LOGGER.isDebugEnabled()) {
			LOGGER.debug(new StringBuilder("Input parameter: userName: ").append(userName).toString());
		}
		DemoResponse customResponse = null;
		Message message = null;

		final UserDetailsDto response = userService.getUserDetailByUsername(userName);
		message = new Message(Constants.SUC0001, Constants.SUC0001_MSG);
		customResponse = new DemoResponse(Constants.SUCCESS, message, response);

		if (LOGGER.isDebugEnabled()) {
			LOGGER.debug(new StringBuilder("Output parameter: customResponse: ").append(customResponse).toString());
		}
		if (LOGGER.isTraceEnabled()) {
			LOGGER.trace("Exiting from method UserController.getUserDetailByUsername");
		}
		return new ResponseEntity<>(customResponse, HttpStatus.OK);
	}

}
