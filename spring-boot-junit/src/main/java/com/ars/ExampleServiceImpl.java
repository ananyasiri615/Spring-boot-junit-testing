package com.ars;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ExampleServiceImpl {

        @Autowired
	private ExampleRepositoryImpl repo;
	
	public String getMessage() {
		return repo.get().toUpperCase();
	}
	
	public int getAddtion(int num1, int num2) {
		return num1 + num2;
	}
}
