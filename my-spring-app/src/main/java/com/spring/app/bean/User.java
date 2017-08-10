package com.spring.app.bean;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

public final class User {

  @JsonProperty("name")
  public String name;
  @JsonProperty("surname")
  public String surname;
  @JsonProperty("username")
  public String username;
  @JsonIgnore
  @JsonProperty("password")
  public String password;

  @JsonCreator
  public User(@JsonProperty("name") String name, @JsonProperty("surname") String surname, @JsonProperty("username") String username, @JsonProperty("password") String password) {
    this.name = name;
    this.surname = surname;
    this.username = username;
    this.password = password;
  }

  public String getName() {
    return name;
  }

  public String getSurname() {
    return surname;
  }

  public String getUsername() {
    return username;
  }

  @JsonIgnore
  public String getPassword() {
    return password;
  }

}
