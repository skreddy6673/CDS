package CDSBusiness;

import java.util.List;

public class Employee {
	private String ename;
	private String email;
	private String phone;
	private String password;
	private String empType;
	public String getEmpType() {
		return empType;
	}
	public void setEmpType(String empType) {
		this.empType = empType;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
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
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "Employee [ename=" + ename + ", email=" + email + ", phone="
				+ phone + ", password=" + password + ", empType=" + empType
				+ "]";
	}
	
	
	}
