package com.spring.app.controler;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.spring.app.bean.User;
import com.spring.app.service.UserService;

@RestController
public class UserController {
  
  private final UserService userService;
  
  @Autowired
  public UserController(UserService userService) {
    this.userService = userService;
  }

  @RequestMapping(value="/user", method=RequestMethod.POST)
  public User createUser(@RequestParam(value = "name") String name, @RequestParam(value = "surname") String surname, @RequestParam(value = "username") String username, @RequestParam(value = "password") String password) {
    return userService.createUser(new User(name, surname, username, password));
  }
  
  @RequestMapping(value="/user", method=RequestMethod.GET)
  public User getUser(@RequestParam(value = "username") String username) {
    return userService.getUserByUsername(username);
  }
  
  @RequestMapping(value="/users", method=RequestMethod.GET)
  public List<User> getUser() {
    return userService.getUsers();
  }
  

}
