package com.example.SpringRestproject.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.SpringRestproject.entity.User;
import com.example.SpringRestproject.entity.feedback;

public interface UserRepository extends JpaRepository<User, Long>{
 User findByEmail(String email);
 
 User findByEmailAndPassword(String email,String password);

 
}
