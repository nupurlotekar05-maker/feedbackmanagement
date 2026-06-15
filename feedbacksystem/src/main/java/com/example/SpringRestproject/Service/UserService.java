package com.example.SpringRestproject.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.SpringRestproject.Repository.UserRepository;
import com.example.SpringRestproject.entity.User;
import com.example.SpringRestproject.entity.feedback;

@Service
public class UserService {
@Autowired
UserRepository userRepository;
public String Register(User user) {
	User exist=userRepository.findByEmail(user.getEmail());
	if(exist!= null) {
		return "Email Already Register";
	}
	userRepository.save(user);
	return "Register Successfully";
}
public User Login(String email,String password) {
	return userRepository.findByEmailAndPassword(email, password);
	
}
//public void addemp(feedback feedback) {
// userRepository.saveAll(feedback);
//}
}
