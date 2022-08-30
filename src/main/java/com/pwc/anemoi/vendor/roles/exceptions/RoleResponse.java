package com.pwc.anemoi.vendor.roles.exceptions;

public class RoleResponse {
	
	private String message;
	
	private boolean status;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "RoleResponse [message=" + message + ", status=" + status + "]";
	}

	public RoleResponse(String message, boolean status) {
		super();
		this.message = message;
		this.status = status;
	}
	
	

}
