package com.Bankapp.Model.Account;

import java.sql.*;

public class accountNumDBGenerator {

	public static void main(String[] args) throws SQLException {
		
		String url = "jdbc:mysql://localhost:3306/bankapp";
		String user = "root";
		String pass = "Welcome@123";
		String query = "";
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		Connection DBConnect = DriverManager.getConnection(url, user, pass);
		
		Statement st = DBConnect.createStatement();
		st.executeQuery(query);
		
		
		public String getStartingCode() {
			
		}
		
		public String getIfscCode(String branch) {
			
		}
		
		public int getSequence{
			
		}
		public void updateSequence(int sequence) {
			executeUpdate statement
		}

	}

}
