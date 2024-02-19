package com.devsuperior.bds04.dto;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.validation.constraints.Email;

import com.devsuperior.bds04.entities.User;

public class UserDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	private Long id;
	
	@Email(message="Favor entrar um e-mail válido")
	private String email;
	
	
	Set<RoleDTO> roles = new HashSet<>();
	
	public UserDTO() {
		
	}
	
	public UserDTO(Long _id, String _email) {
		id = _id;
		email = _email;
	}
	
	public UserDTO(User _entity) {
		id = _entity.getId();
		email = _entity.getEmail();
		_entity.getRoles().forEach(role -> roles.add(new RoleDTO(role)));
	}
	
	public Long getId() {
		return id;
	}
	
	public void setId(Long _id) {
		id = _id;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String _email) {
		email = _email;
	}
	
	public Set<RoleDTO> getRoles() {
		return roles;
	}
}