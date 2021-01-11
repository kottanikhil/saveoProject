package com.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Corporate {
	
		private String corporateName;
		@Id
		private int corporateId;
		private String location;
		private String contact;
		private String emailId;
		private Date established;
		private String password;
		
		public Corporate(){
			
		}

		public String getCorporateName() {
			return corporateName;
		}

		public void setCorporateName(String corporateName) {
			this.corporateName = corporateName;
		}

		

		public int getCorporateId() {
			return corporateId;
		}

		public void setCorporateId(int corporateId) {
			this.corporateId = corporateId;
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

		

		public Date getEstablished() {
			return established;
		}

		public void setEstablished(Date established) {
			this.established = established;
		}

		public String getPassword() {
			return password;
		}

		public void setPassword(String password) {
			this.password = password;
		}

	
		
		
		
		
}
