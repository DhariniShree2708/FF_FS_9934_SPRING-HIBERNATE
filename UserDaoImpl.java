package com.hcl.SpringRegistration.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import com.hcl.SpringRegistration.model.User;

/**
 * @author dharinishree.k
 *
 */

public class UserDaoImpl {
	static Connection con = null;{
	try {
		Class.forName("com.mysql.jdbc.Driver");
		con = DriverManager
			    .getConnection("jdbc:mysql://localhost:3306/SPRING_REGISTRATION_DEMO", "root", "root");
	}
	catch(Exception e) {
		System.out.println("Connection Failed!" + e.getMessage());
	}

	}boolean register(User usr){  

         try{
        	 String sql = "update people set aadharNumber=? , password=? , roleId=? where id=?";
        PreparedStatement pstmt = con.prepareStatement(sql);
             pstmt.setInt(1, 1);
             pstmt.setString(2, "742298764678");
             pstmt.setString(3, "12345");
             pstmt.setInt(4, 1);
             pstmt.executeUpdate(sql);

         } catch(Exception e){

       System.out.println("Error occurred during inserting the user record" + e.getMessage());
     }
		return false;

}

}


