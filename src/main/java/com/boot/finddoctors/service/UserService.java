package com.boot.finddoctors.service;

import com.boot.finddoctors.dao.UserRepository;
import com.boot.finddoctors.model.User;

import java.util.List;

public interface UserService {
    public User save(User user);
    List<User> findUserByEmail(String email);


}
