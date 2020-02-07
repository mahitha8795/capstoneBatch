package com.batch.model;

public class StudentDTO {

	private String name;
	private String emailAddress;
	private String purchasedPackage;
	
	@Override
	public String toString() {
		return "StudenDTO [name=" + name + ", emailAddress=" + emailAddress
				+ ", purchasedPackage=" + purchasedPackage + "]";
	}
	public StudentDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public StudentDTO(String name, String emailAddress, String purchasedPackage) {
		super();
		this.name = name;
		this.emailAddress = emailAddress;
		this.purchasedPackage = purchasedPackage;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmailAddress() {
		return emailAddress;
	}
	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}
	public String getPurchasedPackage() {
		return purchasedPackage;
	}
	public void setPurchasedPackage(String purchasedPackage) {
		this.purchasedPackage = purchasedPackage;
	}
	
	

}
