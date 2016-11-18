package org.mahi;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

	@Entity 
	@Table(name="emp")
public class Employee {
	
	
	int id;
	String firstName,lastName,mailId;
	long phoneNo;
	// Primary Key
	@Id
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	// Column Header
	@Column (name="First")
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	// Column Header
	@Column (name="Last")
	public String getLastName() {
		return lastName;
	}
	
	// Column Header
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	@Column (name="MailId")
	public String getMailId() {
		return mailId;
	}
	public void setMailId(String mailId) {
		this.mailId = mailId;
	}
	@Column (name="Phone")
	public long getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(long phoneNo) {
		this.phoneNo = phoneNo;
	}

}
