package com.techtalentsouthhealthCare.healthCare;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
public class Patient {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	private String firstName;
	private String lastName;
	private Long phoneNo;
	@Column
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date dateOfBirth;
	private String insuranceName;
	private String email;
	private String address;
	
	public Patient() {
		
	}
	
	public Patient(String firstName,String lastName,Long phoneNo,Date dateOfBirth,String insuranceName,String email,String address) {
		  this.firstName = firstName;
		  this.lastName = lastName;
		  this.phoneNo = phoneNo;
		  this.insuranceName = insuranceName;
		  this.dateOfBirth = dateOfBirth;
		  this.email = email;
		  this.address = address;
		  
		  
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Long getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(Long phoneNo) {
		this.phoneNo = phoneNo;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getInsuranceName() {
		return insuranceName;
	}

	public void setInsuranceName(String insuranceName) {
		this.insuranceName = insuranceName;
	}

	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Patient [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", phoneNo=" + phoneNo
				+ ", dateOfBirth=" + dateOfBirth + ", insuranceName=" + insuranceName + ", email=" + email + ", address=" + address+"]";
	}
	
  	

}
