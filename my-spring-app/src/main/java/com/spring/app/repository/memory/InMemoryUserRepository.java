package com.spring.app.repository.memory;

import java.util.LinkedList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.spring.app.bean.User;
import com.spring.app.repository.UserRepository;

@Service
public class InMemoryUserRepository implements UserRepository {

  private List<User> users;

  public InMemoryUserRepository() {
    users = new LinkedList<User>();
  }

  public User getUserByUsername(String username) {
    for (User user : users) {
      if (user.getUsername().equals(username)) {
        return user;
      }
    }
    return null;
  }

  public List<User> getAllUsers() {
    return users;
  }

  public User create(User user) {
    users.add(user);
    return user;
  }

}
