package com.ars;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class ExampleServiceTest {

	@Autowired
	private ExampleServiceImpl service;
	
	@Test
	public void testGetMessage() {
		String actualMessage = service.getMessage();
		String expectedMessage = "HELLO FROM JUNIT 5";
		
		assertEquals(expectedMessage, actualMessage);
	}
	
	@Test
	public void testGetAddition() {
		int num1 = 10;
		int num2 = 20;
		
		int actualResult = service.getAddtion(num1, num2);
		
		int expectedResult = 30;
		
		assertEquals(expectedResult, actualResult);
	}
}