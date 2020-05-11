package com.google.qa.testcases;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Jdbcconnection {

	public static void main(String[] args) throws SQLException {
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/marsqlclass","root","root");
         Statement stm=con.createStatement();
         //String s="select *  from department where DepartmentID=41";
         String s="create database ali";
         stm.execute(s);
         con.close();
         System.out.println("Program is completed Successfully");
	}

}
