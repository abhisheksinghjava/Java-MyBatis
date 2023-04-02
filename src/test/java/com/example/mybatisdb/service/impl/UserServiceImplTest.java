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
import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import com.example.mybatisdb.UnitTest;

import ch.qos.logback.classic.Level;
import ch.qos.logback.classic.Logger;
import org.slf4j.LoggerFactory;

import com.example.mybatisdb.dto.UserDetailsDto;
import com.example.mybatisdb.mapper.UserDetailsCustomMapper;
import com.example.mybatisdb.exception.UserException;

/**
 * The Class UserServiceImplTest.
 */
@Category(UnitTest.class)
public class UserServiceImplTest {
	
	/** The user service impl. */
	@InjectMocks
	UserServiceImpl userServiceImpl;
    
    /** The maper. */
    @Mock
    UserDetailsCustomMapper maper;
    
    /**
     * Setup.
     */
    @Before
    public void setup() {
        ((Logger) LoggerFactory.getLogger(Logger.ROOT_LOGGER_NAME)).setLevel(Level.ALL);
        MockitoAnnotations.initMocks(this);
    }

    /**
     * Gets the user details by user name success test.
     *
     * @return the user details by user name success test
     * @throws Exception the exception
     */
    @Test
    public void getUserDetailsByUserName_Success_Test() throws Exception  {
    	UserDetailsDto userDetailsDto = new UserDetailsDto();
    	userDetailsDto.setUserId(123);
    	userDetailsDto.setUserName("abc");
        Mockito.when(maper
                .getUserDetailsByUserName(Mockito.anyString())).thenReturn(userDetailsDto);
        UserDetailsDto actual = userServiceImpl.getUserDetailByUsername( "abc");
        assertEquals("abc", actual.getUserName());
    }
    
    /**
     * Gets the user details by user name failure test.
     *
     * @return the user details by user name failure test
     * @throws Exception the exception
     */
    @Test(expected = UserException.class)
    public void getUserDetailsByUserName_Failure_Test() throws Exception  {
    	
        Mockito.when(maper
                .getUserDetailsByUserName(Mockito.anyString())).thenReturn(null);
        userServiceImpl.getUserDetailByUsername( "abc");
    }
    

}
