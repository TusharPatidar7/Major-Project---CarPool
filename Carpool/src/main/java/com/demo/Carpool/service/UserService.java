package com.demo.Carpool.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.Carpool.entity.User;
import com.demo.Carpool.repository.UserRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class UserService {

	@Autowired
	private UserRepository userRepository;
	
	public User registerUser(User user) {
//		User userExistance = userRepository.getByEmail(user.getEmail());
//		if(userExistance == null) {
//			return userRepository.save(user);
//		}
		return userRepository.save(user);
	}

	public User loginUser(User user) {
		User userExistance = userRepository.getByEmailAndPassword(user.getEmail(), user.getPassword());
		if(userExistance != null) {
			return user;
		}
		return null;
	}
	
	public List<User> allUsers(){
		return userRepository.findAll();
	}
	
	
}
