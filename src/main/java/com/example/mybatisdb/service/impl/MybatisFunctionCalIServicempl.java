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

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.mybatisdb.mapper.MybatisFunctionCallCustomMapper;
import com.example.mybatisdb.service.MybatisFunctionCallService;
import java.util.Map;
import java.util.HashMap;

/**
 * The Class MybatisFunctionCallImpl.
 *
 * @author - abhishek.singh@abc.com
 * @createdAt 01 April, 2023
 * @description MybatisFunctionCallImpl class is a implementation class of
 *              MybatisFunctionCall.
 */
@Service
public class MybatisFunctionCalIServicempl implements MybatisFunctionCallService {

	/** The Constant LOGGER. */
	private static final Logger LOGGER = LoggerFactory.getLogger(MybatisFunctionCalIServicempl.class);

	@Autowired
	MybatisFunctionCallCustomMapper myBatisMapper;

	@Override
	public boolean callFunction() {
		Map<String, String> dbFunParam = new HashMap<>();
		dbFunParam.put("batchid", "funTest");
		dbFunParam.put("username", "abhishek-singh");
		try {

			final String dbFunOutput = myBatisMapper.callDbFunction(dbFunParam);
			if ("true".equals(dbFunOutput)) {
				return true;
			}

		} catch (Exception exc) {
			LOGGER.error("Exception in MybatisFunctionCalIServicempl.callFunction - {}", exc);
		}
		return false;
	}

}