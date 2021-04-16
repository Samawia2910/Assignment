*
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

public class projectmember {
	
	String pnr;
	String name;
	String login;
	String pw;
	String role;
	String projectid;
	public String getPnr() {
		return pnr;
	}
	public void setPnr(String pnr) {
		this.pnr = pnr;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public String getProjectid() {
		return projectid;
	}
	public void setProjectid(String projectid) {
		this.projectid = projectid;
	}
	public projectmember(String pnr, String name, String login, String pw,
			String role, String projectid) {
		super();
		this.pnr = pnr;
		this.name = name;
		this.login = login;
		this.pw = pw;
		this.role = role;
		this.projectid = projectid;
	}

}
