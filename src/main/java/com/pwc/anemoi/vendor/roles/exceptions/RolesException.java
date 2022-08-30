package com.pwc.anemoi.vendor.roles.exceptions;

public class RolesException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	String name;
	String fieldName;
	int fieldValue;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getFieldName() {
		return fieldName;
	}

	public void setFieldName(String fieldName) {
		this.fieldName = fieldName;
	}

	public int getFieldValue() {
		return fieldValue;
	}

	public void setFieldValue(int fieldValue) {
		this.fieldValue = fieldValue;
	}

	public RolesException(String name, String fieldName, int fieldValue) {
		super(String.format("%s not found with %s : %s", name, fieldName, fieldValue));
		this.name = name;
		this.fieldName = fieldName;
		this.fieldValue = fieldValue;
	}

}
