package com.maxpaz.springboot.springboot.service;



import com.maxpaz.springboot.springboot.dao.UserDAO;
import com.maxpaz.springboot.springboot.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class UserService {
    private final UserDAO userDAO;

    public UserService(UserDAO userDAO) {
        this.userDAO = userDAO;
    }


    public List<User> getAllUsers() {
        return userDAO.findAll();
    }


    public User getUserById(Long id) {
        return userDAO.getOne(id);
    }


    public void addUser(User user) {
        userDAO.save(user);
    }


    public void removeUser(Long id) {
        userDAO.deleteById(id);

    }


    public void updateUser(User user) {
        userDAO.save(user);
    }
}
