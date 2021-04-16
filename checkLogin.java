/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package projectmanagement;

import java.util.Date;
/**
 *
 * @author Samawiaijaz
 */

public class checkLogin {

	
	public checkLogin() {
		
		
	}
	
	public void checkLogin(String username, String password) throws ClassNotFoundException {
		
	
		try{
			
			String user = "dod1311"; 
			String pwd = "dod131113"; 
			
			String strConn = "+ "&user=" + user + "&password=" + pwd; 
					 	Connection conn = (Connection) DriverManager.getConnection(strConn);
					 	
					 	Statement stmt1 = (Statement) conn.createStatement();
					 	
					 	
					 	ResultSet rs = stmt1.executeQuery (" SELECT * FROM projectmembers WHERE username='" + username + "' AND password='" + password + "';");
					 	
					 	String projectmanager;
					 	if (rs.isBeforeFirst() == true) {
					 		
					 		rs.first();
					 		System.out.println(rs.getString("role"));
					 		
					 		
					 		
					 		
					 		
					 		if (rs.getString("role").equals("Projectmanager")) {
					 			projectmanager = "yes";
					 			
					 			login rolecheck = new login();
					 			
					 			rolecheck.roleCheck(projectmanager);
					 			
					 			
					 			
					 			
					 		} else if (rs.getString("role").equals("Systemdeveloper") || rs.getString("role").equals("Programmer")) {
					 			
					 			login rolecheck = new login();
					 			projectmanager = "no";
					 			
					 			
					 			rolecheck.roleCheck(projectmanager);
					 			
					 		}
					 		
					 		
					 	} else {
					 		
					 		String incorrect;
					 		login loginCheck = new login();
					 		incorrect = "no";
					 		loginCheck.logincheck(incorrect);
					 	}
					 	
					 	
					 	
					 	
					 	
					 	stmt1.close();
					 	conn.close();
					 	
					 	
					 
						
						
		}catch (SQLException e)
		{
			System.out.println("ERROR: " + e.getMessage() );
		}
		
		
	}
	
}
