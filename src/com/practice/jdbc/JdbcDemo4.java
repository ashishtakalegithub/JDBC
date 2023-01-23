package com.practice.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class JdbcDemo4 {

	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306/ashishdb";
		String user = "root";
		String pwd = "Ashish@09";
		String sqlQuery = "update books set stock_quantity=? where book_id=?";
		try (Connection con = DriverManager.getConnection(url, user, pwd);
				PreparedStatement pst = con.prepareStatement(sqlQuery)) {
			Class.forName("com.mysql.jdbc.Driver");
			pst.setInt(1, 300);
			pst.setInt(2, 4);
			pst.executeUpdate();

		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}

	}
}
