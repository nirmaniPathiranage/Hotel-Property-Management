package com.oop.model;

public class Register {

	private String userName;
	private String passWord;
	private String fullName;
	private String NICno;
	private String emailAddress;
	private String streetAddress;
	private String contactNo;
	private String regDate;

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

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getNICno() {
		return NICno;
	}

	public void setNICno(String NICno) {
		this.NICno = NICno;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public String getStreetAddress() {
		return streetAddress;
	}

	public void setStreetAddress(String streetAddress) {
		this.streetAddress = streetAddress;
	}

	public String getContactNo() {
		return contactNo;
	}

	public void setContactNo(String contactNo) {
		this.contactNo = contactNo;
	}

	public String getRegDate() {
		return regDate;
	}

	public void setRegDate(String regDate) {
		this.regDate = regDate;
	}

	@Override
	public String toString() {

		return "UserName = " + userName + "\n" + "Password = " + passWord + "\n" + "Full Name = " + fullName + "\n"
				+ "NIC Number = " + NICno + "\n" + "Email Address = " + emailAddress + "\n" + "Street Address = "
				+ streetAddress + "\n" + "Contact No = " + contactNo + "\n" + "Registered Date = " + regDate;

	}

}