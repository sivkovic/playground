package com.spring.app.repository;

import java.util.List;

import com.spring.app.bean.User;

public interface UserRepository {
  
  public User getUserByUsername(String username);
  
  public List<User> getAllUsers();
  
  public User create(User user);

}
