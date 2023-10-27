package com.mycom.mydb.dto;

public class StudentDto {
	
	int student_id;
	String student_nm;
	String email;
	String phone;

	public StudentDto(int student_id, String student_nm, String email, String phone) {
		super();
		this.student_id = student_id;
		this.student_nm = student_nm;
		this.email = email;
		this.phone = phone;
	}

	public int getStudent_id() {
		return student_id;
	}

	public void setStudent_id(int student_id) {
		this.student_id = student_id;
	}

	public String getStudent_nm() {
		return student_nm;
	}

	public void setStudent_nm(String student_nm) {
		this.student_nm = student_nm;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	@Override
	public String toString() {
		return "StudentDto [student_id=" + student_id + ", student_nm=" + student_nm + ", email=" + email + ", phone="
				+ phone + "]";
	}

	public StudentDto() {

	}
	
	

}
