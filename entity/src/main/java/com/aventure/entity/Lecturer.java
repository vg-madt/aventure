package com.aventure.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "LECTURER")
public class Lecturer {
	@Id
	@Column(name = "lecturerId")
	private Integer lecturerId;
	@Column(name = "lecturerName")
	private String lecturerName;
	@Column(name = "contact")
	private Integer contact;
	@Column(name = "email")
	private String email;
	public Integer getLecturerId() {
		return lecturerId;
	}
	public void setLecturerId(Integer lecturerId) {
		this.lecturerId = lecturerId;
	}
	public String getLecturerName() {
		return lecturerName;
	}
	public void setLecturerName(String lecturerName) {
		this.lecturerName = lecturerName;
	}
	public Integer getContact() {
		return contact;
	}
	public void setContact(Integer contact) {
		this.contact = contact;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	

}
