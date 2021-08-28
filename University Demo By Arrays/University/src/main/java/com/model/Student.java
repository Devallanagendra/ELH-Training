package com.model;

public class Student {
	private int studId;
	private String studName;
	private int studAge;
	private Department department;

	

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(int studId, String studName, int studAge) {
		super();
		this.studId = studId;
		this.studName = studName;
		this.studAge = studAge;
	}

	public int getStudId() {
		return studId;
	}

	public void setStudId(int studId) {
		this.studId = studId;
	}

	public String getStudName() {
		return studName;
	}

	public void setStuName(String studName) {
		this.studName = studName;
	}

	public int getStudAge() {
		return studAge;
	}

	public void setStudAge(int studAge) {
		this.studAge = studAge;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

}
