package com.practice.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcDemo6 {
	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306/ashishdb";
		String user = "root";
		String pwd = "Ashish@09";
		String sqlQuery = "select * from books";
		try (Connection con = DriverManager.getConnection(url, user, pwd);
				Statement st = con.createStatement();
				ResultSet rs = st.executeQuery(sqlQuery);) {
			Class.forName("com.mysql.jdbc.Driver");
			while (rs.next()) {
				System.out.println(rs.getInt(1) + "\t" + rs.getString(2) + "\t" + rs.getString(3) + "\t"
						+ rs.getString(4) + "\t" + rs.getInt(5) + "\t" + rs.getInt(6) + "\t" + rs.getInt(7));
			}

		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}
}
