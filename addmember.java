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

import javax.swing.JOptionPane;

public class addmember extends javax.swing.JPanel{

	
	public void newMember(projectmember newMember) throws ClassNotFoundException {
	try{
		
		 private String user = "dod1311"; 
	         private String pwd = "dod131113"; 
		
		String strConn =  "&user=" + user + "&password=" + pwd; 
				 	Connection conn = (Connection) DriverManager.getConnection(strConn);
				 	
				 	Statement stmt1 = (Statement) conn.createStatement();
				 	
				 	int strSQL = stmt1.executeUpdate (" INSERT INTO projectmembers  (pnr, name, username, password, projectid, role) VALUES ('" + newMember.getPnr() + "','" + newMember.getName()
				 		+ "','"	+ newMember.getLogin() + "','" + newMember.getPw() + "','" + newMember.getProjectid() + "','" + newMember.getRole()
				 		 + "')");
				 	
				 	
					
				 	
				 	stmt1.close();
				 	conn.close();
				 	
				 	String s = "y";
				 	
				 	newmember success = new newmember();
				 	
				 	success.registercompleted(s);
				 	
				 						
	                                 }
                                      catch (SQLException e)
	                             {
		                       String s = "n";
		                       newmember success = new newmember();
		                       success.registercompleted(s);
		                       System.out.println("ERROR: " + e.getMessage() );
	
				 	
	                              }
	                              }

}
	

