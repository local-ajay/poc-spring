package com.cognizant.poc;

import java.sql.Connection;
import java.sql.DriverManager;

public class TestJDBC {

	public static void main(String[] args) {
		String jdbcURL="jdbc:mysql://localhost:3306/poc?useSSL=false&serverTimeZone=UTC";
		String user="root";
		String pass="root";
		
		try {
			System.out.println("connecting to "+jdbcURL);
			
			Connection connection=DriverManager.getConnection(jdbcURL,user,pass);
			System.out.println("successfull");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
