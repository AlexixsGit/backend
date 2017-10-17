package com.youtube.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.youtube.demo.dao.UserRepository;
import com.youtube.demo.model.User;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	protected UserRepository userRepository;

	@Override
	public User save(User user) {
		return this.userRepository.save(user);
	}

}
