package com.cognizant.poc.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="poc_user",schema="poc")
public class PocUser {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="serial_no")
	private long srno;
	
	public PocUser() {
		super();
	}
	public PocUser(long srno, String username, String password) {
		super();
		this.srno = srno;
		this.username = username;
		this.password = password;
	}
	@Column(name="username")
	private String username;
	
	@Column(name="password")
	private String password;
	
	public long getSrno() {
		return srno;
	}
	public void setSrno(long srno) {
		this.srno = srno;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "PocUser [srno=" + srno + ", username=" + username + ", password=" + password + "]";
	}
	
}
