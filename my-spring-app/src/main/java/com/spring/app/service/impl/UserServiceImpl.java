package com.spring.app.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.app.bean.User;
import com.spring.app.repository.UserRepository;
import com.spring.app.service.UserService;

@Service
public class UserServiceImpl implements UserService {

  @Autowired
  private UserRepository userRepository;

  public User createUser(User user) {
    return userRepository.create(user);
  }

  public User getUserByUsername(String username) {
    return userRepository.getUserByUsername(username);
  }

  public List<User> getUsers() {
    return userRepository.getAllUsers();
  }
}
