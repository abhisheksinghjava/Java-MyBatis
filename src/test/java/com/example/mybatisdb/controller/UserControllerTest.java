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

@Category(UnitTest.class)
public class UserControllerTest {
	
	@InjectMocks
    UserController userController;
    @Mock
    UserServiceImpl service;
    @Before
    public void setup() {
        ((Logger) LoggerFactory.getLogger(Logger.ROOT_LOGGER_NAME)).setLevel(Level.ALL);
        MockitoAnnotations.initMocks(this);
    }

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
