package com.devsuperior.bds04.controllers.exceptions;

import java.io.Serializable;

public class FieldMessage implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private String fieldName;
	private String message;
	
	public FieldMessage() {
		
	}
	
	public FieldMessage(String _fieldName, String _message) {
		fieldName = _fieldName;
		message = _message;
	}
	
	public String getFieldName() {
		return fieldName;
	}
	
	public void setFieldName(String _fieldName) {
		fieldName = _fieldName;
	}
	
	public String getMessage() {
		return message;
	}
	
	public void setMessage(String _message) {
		message = _message;
	}
}