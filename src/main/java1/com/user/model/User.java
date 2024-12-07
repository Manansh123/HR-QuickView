package com.user.model;

public class User {
	private int employeeId;
	private String firstName;
	private String lastName;
	private String email;
	private String phone;
	private String address;
	private String dateOfBirth;
	private String gender;
	private String hireDate;
	private String departmentName;
	private String jobTitle;
	private double salary;

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	public User(int employeeId, String firstName, String lastName, String email, String phone, String address,
			String dateOfBirth, String gender, String hireDate, String departmentName, String jobTitle, double salary) {
		super();
		this.employeeId = employeeId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.phone = phone;
		this.address = address;
		this.dateOfBirth = dateOfBirth;
		this.gender = gender;
		this.hireDate = hireDate;
		this.departmentName = departmentName;
		this.jobTitle = jobTitle;
		this.salary = salary;
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
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

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getHireDate() {
		return hireDate;
	}

	public void setHireDate(String hireDate) {
		this.hireDate = hireDate;
	}

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

	public String getJobTitle() {
		return jobTitle;
	}

	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "User [employeeId=" + employeeId + ", firstName=" + firstName + ", lastName=" + lastName + ", email="
				+ email + ", phone=" + phone + ", address=" + address + ", dateOfBirth=" + dateOfBirth + ", gender="
				+ gender + ", hireDate=" + hireDate + ", departmentName=" + departmentName + ", jobTitle=" + jobTitle
				+ ", salary=" + salary + "]";
	}

}
