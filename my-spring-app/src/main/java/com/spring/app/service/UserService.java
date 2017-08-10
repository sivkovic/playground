package com.spring.app.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.spring.app.bean.User;

@Service
public interface UserService {

  User createUser(User user);
  
  User getUserByUsername(String username);
  
  List<User> getUsers();
  
}
