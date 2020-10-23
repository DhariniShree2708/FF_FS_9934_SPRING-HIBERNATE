package com.hcl.SpringRegistration.model;

/**
 * Day # : 38.
 * 
 * Topic : Spring.
 * 
 * This class consists of user registration details like password,ID etc.
 * which is obtained from the user.
 * 
 * @author dharinishree.k
 *
 */
public class User {
	int id;
	String aadharNumber;
	String password;
	int roleId;

	public User(int id, String aadharNumber, String password, int roleId) {
		super();
		this.id = id;
		this.aadharNumber = aadharNumber;
		this.password = password;
		this.roleId = roleId;
	}

	/**
	 * @return the roleId
	 */
	public int getRoleId() {
		return roleId;
	}

	/**
	 * @param roleId
	 *            the roleId to set
	 */
	public void setRoleId(int roleId) {
		this.roleId = roleId;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "User [id=" + id + ", aadharNumber=" + aadharNumber + ", password=" + password + ", roleId=" + roleId
				+ ", getRoleId()=" + getRoleId() + ", getId()=" + getId() + ", getAadharNumber()=" + getAadharNumber()
				+ ", getPassword()=" + getPassword() + "]";
	}

	public User() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAadharNumber() {
		return aadharNumber;
	}

	public void setAadharNumber(String aadharNumber) {
		this.aadharNumber = aadharNumber;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}
