package com.example.OnlineQuizSystem;

import javax.annotation.Generated;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "student")
public class Student {

	@Id
	private int id;
	
	private String name;
	private String department;
	private String rollNo;
	private String moNo;
	private String clas;
	private String emailId;
	private String password;

	public String getClas() {
		return clas;
	}

	public void setClas(String clas) {
		this.clas = clas;
	}

	public Student(int id, String name, String department, String rollNo, String moNo, String clas,String emailId,String password) {
		super();
		this.id = id;
		this.name = name;
		this.department = department;
		this.rollNo = rollNo;
		this.moNo = moNo;
		this.clas = clas;
		this.emailId=emailId;
		this.password=password;
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

	public int getStudentId() {
		return this.id;
	}

	public void setStudentId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDepartment() {
		return this.department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getRollNo() {
		return this.rollNo;
	}

	public void setRollNo(String rollNo) {
		this.rollNo = rollNo;
	}

	public String getMoNo() {
		return this.moNo;
	}

	public void setMoNo(String moNo) {
		this.moNo = moNo;
	}

}
