package com.tech.blog.helper;
import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;



public class ConnectionProvider {
	
	private static Connection con;

	public static Connection getConnection() {
		
		try {
		
			if(con == null) {
				//driver class load 
				
				Class.forName("com.mysql.cj.jdbc.Driver");
				
				//create connection
				 con =DriverManager.getConnection("jdbc:mysql://localhost:3306/techblog", "root", "root");
				System.out.println("Database connected");
				
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return con;
	}
}
