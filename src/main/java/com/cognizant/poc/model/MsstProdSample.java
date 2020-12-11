package com.cognizant.poc.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="sample_credentials_msst_prod",schema="poc")
public class MsstProdSample {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="serial_no")
	private int srno;
	
	public MsstProdSample() {
		super();
	}
	public MsstProdSample(int srno, String username, String password, String feature) {
		super();
		this.srno = srno;
		this.username = username;
		this.password = password;
		this.feature = feature;
	}
	@Column(name="username")
	private String username;
	
	@Column(name="password")
	private String password;
	
	@Column(name="feature")
	private String feature;
	
	public int getSrno() {
		return srno;
	}
	public void setSrno(int srno) {
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
	public String getFeature() {
		return feature;
	}
	public void setField(String feature) {
		this.feature = feature;
	}
	@Override
	public String toString() {
		return "MSSTPROD [srno=" + srno + ", username=" + username + ", password=" + password + ", feature="
				+ feature + "]";
	}
	
	
}