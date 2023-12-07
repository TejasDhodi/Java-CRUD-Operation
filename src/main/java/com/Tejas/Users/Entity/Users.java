package com.Tejas.Users.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="user")
public class Users {
	@Id
	int Id;
	String Name;
	String Type;
	String Password;
	
	public Users() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Users(int id, String name, String type, String password) {
		super();
		Id = id;
		Name = name;
		Type = type;
		Password = password;
	}

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getType() {
		return Type;
	}

	public void setType(String type) {
		Type = type;
	}

	public String getPassword() {
		return Password;
	}

	public void setPassword(String password) {
		Password = password;
	}
	
	
}
