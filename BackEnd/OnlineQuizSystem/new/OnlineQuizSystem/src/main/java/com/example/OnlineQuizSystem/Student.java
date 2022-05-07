package com.example.OnlineQuizSystem;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="student")
public class Student {

	@Id
	private int id;
	private String name;
	private String Department;
	private String RollNo;
	private String MoNo;
	private String clas;
	
	public String getClas() {
		return clas;
	}
	public void setClas(String clas) {
		this.clas = clas;
	}
	public Student(int id, String name, String department, String rollNo, String moNo, String clas) {
		super();
		this.id = id;
		this.name = name;
		Department = department;
		RollNo = rollNo;
		MoNo = moNo;
		this.clas=clas;
	}
	private int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDepartment() {
		return Department;
	}
	public void setDepartment(String department) {
		Department = department;
	}
	public String getRollNo() {
		return RollNo;
	}
	public void setRollNo(String rollNo) {
		RollNo = rollNo;
	}
	public String getMoNo() {
		return MoNo;
	}
	public void setMoNo(String moNo) {
		MoNo = moNo;
	}
	
	
}
