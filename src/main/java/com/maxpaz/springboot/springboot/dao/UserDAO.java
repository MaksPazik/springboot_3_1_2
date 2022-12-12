package com.maxpaz.springboot.springboot.dao;



;

import com.maxpaz.springboot.springboot.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserDAO extends JpaRepository<User, Long> {
//    List<User> getAllUsers();
//    User getUserById(Long id);
//    void addUser(User user);
//    void removeUser(Long id);
//    void updateUser(User user);
}
