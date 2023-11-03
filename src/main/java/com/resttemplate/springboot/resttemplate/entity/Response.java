package com.resttemplate.springboot.resttemplate.entity;

public class Response {
	private String token;
	private String admin;
	private long mobileNumber;
	
	public Response(String token, String admin, long mobileNumber) {
		super();
		this.token = token;
		this.admin = admin;
		this.mobileNumber = mobileNumber;
	}

	public Response() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public String getAdmin() {
		return admin;
	}

	public void setAdmin(String admin) {
		this.admin = admin;
	}

	public long getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(long mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	@Override
	public String toString() {
		return "Response [token=" + token + ", admin=" + admin + ", mobileNumber=" + mobileNumber + "]";
	}
	
	
}
