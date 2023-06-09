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
import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import com.example.mybatisdb.UnitTest;
import com.example.mybatisdb.common.util.DemoResponse;
import com.example.mybatisdb.service.impl.UserServiceImpl;

import ch.qos.logback.classic.Level;
import ch.qos.logback.classic.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import com.example.mybatisdb.dto.UserDetailsDto;

/**
 * The Class UserControllerTest.
 */
@Category(UnitTest.class)
public class UserControllerTest {
	
	/** The user controller. */
	@InjectMocks
    UserController userController;
    
    /** The service. */
    @Mock
    UserServiceImpl service;
    
    /**
     * Setup.
     */
    @Before
    public void setup() {
        ((Logger) LoggerFactory.getLogger(Logger.ROOT_LOGGER_NAME)).setLevel(Level.ALL);
        MockitoAnnotations.initMocks(this);
    }

    /**
     * Gets the category analysis by delivery test.
     *
     * @return the category analysis by delivery test
     * @throws Exception the exception
     */
    @Test
    public void getCategoryAnalysisByDelivery_Test() throws Exception  {
    	UserDetailsDto userDetailsDto = new UserDetailsDto();
    	userDetailsDto.setUserId(123);
    	userDetailsDto.setUserName("abc");
        Mockito.when(service
                .getUserDetailByUsername(Mockito.anyString())).thenReturn(userDetailsDto);
        ResponseEntity<DemoResponse> actual = userController.getUserDetailByUsername( "abc");
        assertEquals(HttpStatus.OK, actual.getStatusCode());
    }


}
