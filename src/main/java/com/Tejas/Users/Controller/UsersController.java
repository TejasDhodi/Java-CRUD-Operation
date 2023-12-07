package com.Tejas.Users.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Tejas.Users.Entity.Users;
import com.Tejas.Users.Service.UsersService;

@RestController
@RequestMapping("/Users")
public class UsersController {
	@Autowired
	UsersService usersService;

	public UsersService getUsersService() {
		return usersService;
	}

	public void setUsersService(UsersService usersService) {
		this.usersService = usersService;
	}
	
	@PostMapping()
	public Users addUsers(@RequestBody Users users) {
		return usersService.save(users);
	}
	
	@GetMapping(path="/{id}")
	public Users getUsers(@PathVariable int id) {
		return usersService.getUsers(id);
	}
	
	@PutMapping(path="/{id}")
	public Users updateUsers(@RequestBody Users users, @PathVariable int id) {
		return usersService.update(id, users);
	}
	
	@DeleteMapping(path="/{id}")
	public String deleteUsers(@PathVariable int id) {
		return usersService.delete(id);
	}
	
	@GetMapping
	public List<Users> getAllUsers() {
		return usersService.getEmptyList();
	}
	
}
