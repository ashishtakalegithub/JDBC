package com.practice.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcDemo {

	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306/ashishdb";
		String user = "root";
		String pwd = "Ashish@09";
		String sqlQuery = "INSERT INTO customer ( Id, Name, Product, Country, Year)     \r\n"
				+ "VALUES (1, 'Stephen', 'Computer', 'USA', 2015),     \r\n"
				+ "(2, 'Joseph', 'Laptop', 'India', 2016),     \r\n" + "(3, 'John', 'TV', 'USA', 2016),    \r\n"
				+ "(4, 'Donald', 'Laptop', 'England', 2015),    \r\n"
				+ "(5, 'Joseph', 'Mobile', 'India', 2015),    \r\n" + "(6, 'Peter', 'Mouse', 'England', 2016); ";
		try (Connection con = DriverManager.getConnection(url, user, pwd); Statement st = con.createStatement()) {
			st.execute(sqlQuery);

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}
}
