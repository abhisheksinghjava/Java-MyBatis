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

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.mybatisdb.common.util.Constants;
import com.example.mybatisdb.common.util.DemoResponse;
import com.example.mybatisdb.common.util.Message;
import com.example.mybatisdb.service.MybatisFunctionCallService;

/**
 * The Class MybatisFunctionCall.
 *
 * @author - abhishek.singh@abc.com
 * @createdAt 07 May, 2023
 * @description MybatisFunctionCall class that is the user class.
 */
@RestController
@CrossOrigin
@RequestMapping("${api.base-path}")
public class MybatisFunctionCallController {

	/** The mybatis service. */
	@Autowired
	MybatisFunctionCallService mybatisService;

	/**
	 * Call postgresql function.
	 *
	 * @return the response entity
	 * @throws Exception the exception
	 */
	@PostMapping(value = Constants.CALL_DB_FUNCION)
	public ResponseEntity<DemoResponse> callPostgresqlFunction() throws Exception {

		DemoResponse customResponse = null;
		Message message = null;

		final boolean response = mybatisService.callFunction();
		if (response) {
			message = new Message(Constants.SUC0002, Constants.SUC0002_MSG);
			customResponse = new DemoResponse(Constants.SUCCESS, message, response);
			return new ResponseEntity<>(customResponse, HttpStatus.OK);
		} else {
			message = new Message(Constants.ERR0003, Constants.ERR0003_MSG);
			customResponse = new DemoResponse(Constants.FAILURE, message, response);
			return new ResponseEntity<>(customResponse, HttpStatus.BAD_REQUEST);
		}

	}

}
