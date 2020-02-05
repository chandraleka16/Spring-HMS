package global.coda.hms.jpa.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@ Entity
public class User {
  @ Id
  @ GeneratedValue(strategy = GenerationType.AUTO)
  int userId;
  String userName;
  String userPassword;
 
  public User() {
    super();
  }

  public User(String userName, String userPassword) {
    super();
    this.userName = userName;
    this.userPassword = userPassword;
  }

  public int getUserId() {
    return userId;
  }

  public void setUserId(int userId) {
    this.userId = userId;
  }

  public String getUserName() {
    return userName;
  }

  public void setUserName(String userName) {
    this.userName = userName;
  }

  public String getUserPassword() {
    return userPassword;
  }

  public void setUserPassword(String userPassword) {
    this.userPassword = userPassword;
  }

}
