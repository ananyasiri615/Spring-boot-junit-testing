package com.ars;

import org.springframework.stereotype.Repository;

@Repository
public class ExampleRepositoryImpl {
	
   public String get() {
        return "Hello from Junit 5";
   }

}