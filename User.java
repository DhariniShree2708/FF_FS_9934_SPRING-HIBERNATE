package com.hcl.springregistration.model;

public class User {
	private int id;
	private String emailId;
	private String password;
	private String phoneNumber;
	private int roleId;

	public User() {
		super();
	}

	public User(int id, String emailId, String password, int roleId, String phoneNumber) {
		super();
		this.id = id;
		this.emailId = emailId;
		this.password = password;
		this.phoneNumber = phoneNumber;
		this.roleId = roleId;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getRoleId() {
		return roleId;
	}

	public void setRoleId(int roleId) {
		this.roleId = roleId;
	}

}