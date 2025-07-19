package com.tka;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
public class Student {
//Firstly we need to add the jar
	
	public static void main(String[] args) throws Exception {//direct exeption handle karne keliye 
		//parent throw
		//public static void main(String[] args) throws ClassNotFoundException {
		
		//1.Register and load the driver class
		
		
		Class.forName("com.mysql.cj.jdbc.Driver");//driver ka nam dena padta
		//Class.forName("java.util.Arrays"); //run karta
		//Class.forName("java.util.Arr"); //ise exception deta  class not found
		
		//class dynamically load use ko karega jo present hai otherwise exception
		System.out.println("Driver Class Loaded Sucessfully...");
		
		//2.Build The Connection
		Connection c= DriverManager.getConnection("jdbc:mysql://localhost:3306/batch1043","root","orchid@123");
		
		//3.Create JDBC Statement/ Prepare Statement
		Statement s=c.createStatement();
		
		//4.execute query and collect the result
		//execute, executeupdate, executeQuery
		
		s.executeUpdate("insert into student(studID,studName,city)values(101,'Shree','Pune')");
		System.out.println("Data is inserted successfully...");

		// close all the connection
		c.close();
		
		
	}
}
