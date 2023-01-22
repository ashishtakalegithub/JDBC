package com.practice.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcDemo2 {
	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306/ashishdb";
		String user = "root";
		String pwd = "Ashish@09";
		String sqlQuery = "insert into books(title,author_fname,author_lname,released_year,stock_quantity,pages) values('The Namesake','Jhumpa','Lahiri',2003,250,100),('Norse Mythology','Neil','Gaiman',2016,250,150),('American Gods','Neil','Gaiman',2001,200,250)";

		try (Connection con = DriverManager.getConnection(url, user, pwd); Statement st = con.createStatement()) {
			Class.forName("com.mysql.jdbc.Driver");
			st.executeUpdate(sqlQuery);

		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}

	}
}
