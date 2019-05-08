package com.oop.model;

public class Admin {

	private String adminID;
	private String adminName;
	private String address;
	private String emailAddress;
	private String contactNo;
	private String userName;
	private String passWord;
	private String task;

	public String getAdminID() {
		return adminID;
	}

	public void setAdminID(String adminID) {
		this.adminID = adminID;
	}

	public String getAdminName() {
		return adminName;
	}

	public void setAdminName(String adminName) {
		this.adminName = adminName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public String getContactNo() {
		return contactNo;
	}

	public void setContactNo(String contactNo) {
		this.contactNo = contactNo;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassWord() {
		return passWord;
	}

	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}

	public String getTask() {
		return task;
	}

	public void setTask(String task) {
		this.task = task;
	}

	@Override
	public String toString() {

		return "Admin ID = " + adminID + "\n" + "Admin Name = " + adminName + "\n" + "Address = " + address + "\n"
				+ "Email Address = " + emailAddress + "\n" + "Contact No = " + contactNo + "\n" + "UserName = "
				+ userName + "\n" + "Password = " + passWord + "\n" + "Task = " + task;
	}

}
