package com.rak.quick.assignment.to;

public class UserAccessTO {
	
	private String empId;
	
	private String accessKey;
	
	private String country;
	
	private String subUser;
	
	private String subUserAccessKey;
	
	private String subUserCountry;

	public String getEmpId() {
		return empId;
	}

	public void setEmpId(String empId) {
		this.empId = empId;
	}

	public String getAccessKey() {
		return accessKey;
	}

	public void setAccessKey(String accessKey) {
		this.accessKey = accessKey;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getSubUser() {
		return subUser;
	}

	public void setSubUser(String subUser) {
		this.subUser = subUser;
	}

	public String getSubUserAccessKey() {
		return subUserAccessKey;
	}

	public void setSubUserAccessKey(String subUserAccessKey) {
		this.subUserAccessKey = subUserAccessKey;
	}

	public String getSubUserCountry() {
		return subUserCountry;
	}

	public void setSubUserCountry(String subUserCountry) {
		this.subUserCountry = subUserCountry;
	}

	@Override
	public String toString() {
		return "UserAccessTO [empId=" + empId + ", accessKey=" + accessKey + ", country=" + country + ", subUser="
				+ subUser + ", subUserAccessKey=" + subUserAccessKey + ", subUserCountry=" + subUserCountry + "]";
	}
	
	
}
