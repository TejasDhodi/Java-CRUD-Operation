package com.Tejas.Users.Service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Tejas.Users.Entity.Users;
import com.Tejas.Users.Repository.UsersRepository;

@Service
public class UsersService {
	@Autowired
	UsersRepository usersRepository;
	
	public Users save(Users user) {
		return usersRepository.save(user);
	}
	
	public Users getUsers(int id) {
		return usersRepository.findById(id).get();
	}
	
	public Users update(int id, Users users) {
		Users user = usersRepository.findById(id).get();
		try {
			user.setName(users.getName());
			user.setType(users.getType());
			user.setPassword(users.getPassword());
			return usersRepository.save(user);
		} catch (Exception e) {
			throw new RuntimeException("Error updating user: " + e.getMessage(), e);
		}
	}

	public String delete(int id) {
		usersRepository.deleteById(id);
		return "Entity Deleted" + id;
	}
	
	public List<Users> getEmptyList(){
		return usersRepository.findAll();
	}

	public UsersRepository getUsersRepository() {
		return usersRepository;
	}

	public void setUsersRepository(UsersRepository usersRepository) {
		this.usersRepository = usersRepository;
	}
	
	

}
