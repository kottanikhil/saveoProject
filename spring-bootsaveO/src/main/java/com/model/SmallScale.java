package com.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class SmallScale {

	private String smallScaleName;
	@Id
	private String smallScaleId;
	private String location;
	private String contact;
	private String emailId;
	private String password;
	
	public SmallScale(){
		
	}

	public String getSmallScaleName() {
		return smallScaleName;
	}

	public void setSmallScaleName(String smallScaleName) {
		this.smallScaleName = smallScaleName;
	}

	public String getSmallScaleId() {
		return smallScaleId;
	}

	public void setSmallScaleId(String smallScaleId) {
		this.smallScaleId = smallScaleId;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
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
	
	
	
	
	
}
