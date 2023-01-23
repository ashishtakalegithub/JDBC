package com.practice.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class JdbcDemo3 {
	public static void main(String[] args) {
		String url ="jdbc:mysql://localhost:3306/ashishdb";
		String user =  "root";
		String pwd ="Ashish@09";
		String sqlQuery = "insert into books(title,author_fname,author_lname,released_year,stock_quantity,pages) values(?,?,?,?,?,?)";
		try (Connection con = DriverManager.getConnection(url, user, pwd);
				PreparedStatement pst = con.prepareStatement(sqlQuery)) {
			Class.forName("com.mysql.jdbc.Driver");
			pst.setString(1, "Interpreter of Maladies");
			pst.setString(2, "Jhumpa");
			pst.setString(3, "Lahiri");
			pst.setInt(4, 1996);
			pst.setInt(5, 250);
			pst.setInt(6, 230);
			pst.executeUpdate();
			

		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		

	}
}
