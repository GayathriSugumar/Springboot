package com.springboot.json.demo;

import java.io.File;

import com.fasterxml.jackson.databind.ObjectMapper;

public class Driver {

	public static void main(String[] args) {
		
		try {
			
			// create object mapper
			
			ObjectMapper mapper = new ObjectMapper();
						
			//read JSON file and map/ convert to java POJO
			
			//data/sample-lite.json
			
			Student theStudent = mapper.readValue(
					new File ("data/sample-full.json") , Student.class);
			
			//print firstr name and last name
			
			System.out.println("First Name =" + theStudent.getFirstName());
			System.out.println("Last Name =" + theStudent.getLastName());
		
			// print address
			Address address = theStudent.getAddress();
			
			System.out.println("Street = " + address.getStreet());
			System.out.println("City = " + address.getCity());
			
			for (String tempLang : theStudent.getLanguages()){
				System.out.println(tempLang);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
