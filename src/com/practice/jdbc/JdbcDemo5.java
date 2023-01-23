package com.practice.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class JdbcDemo5 {
	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306/ashishdb";
		String user = "root";
		String pwd = "Ashish@09";
		String sqlQuery = "delete from books where book_id=?";
		try (Connection con = DriverManager.getConnection(url, user, pwd);
				PreparedStatement pst = con.prepareStatement(sqlQuery)) {
			Class.forName("com.mysql.jdbc.Driver");
			pst.setInt(1, 3);
			pst.executeUpdate();
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}
}
