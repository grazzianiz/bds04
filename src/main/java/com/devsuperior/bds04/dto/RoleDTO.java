package com.devsuperior.bds04.dto;

import java.io.Serializable;

import com.devsuperior.bds04.entities.Role;

public class RoleDTO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private Long id;
	private String authority;
	
	public RoleDTO() {
		
	}
	
	public RoleDTO(Long _id, String _authority) {
		id = _id;
		authority = _authority;
	}
	
	public RoleDTO(Role _entity) {
		id = _entity.getId();
		authority = _entity.getAuthority();
	}
	
	public Long getId() {
		return id;
	}
	
	public void setId(Long _id) {
		id = _id;
	}
	
	public String getAuthority() {
		return authority;
	}
	
	public void setAuthority(String _authority) {
		authority = _authority;
	}
}