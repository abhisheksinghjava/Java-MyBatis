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
package com.example.mybatisdb.mapper;

import java.util.Map;

import org.apache.ibatis.annotations.Mapper;


/**
 * The Class MybatisFunctionCallCustomMapper.
 *
 * @author - abhishek.singh@abc.com
 * @createdAt 01 April, 2023
 * @description MybatisFunctionCallCustomMapper class is a mybatis custom mapper
 *              class.
 */
@Mapper
public interface MybatisFunctionCallCustomMapper {

	/**
	 * Call db function.
	 *
	 * @return the string
	 */
	public String callDbFunction(final Map<String, String> dbFunParam);

}
