package com.Tejas.Users.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Tejas.Users.Entity.Users;

@Repository
public interface UsersRepository extends JpaRepository<Users, Integer>{

}
