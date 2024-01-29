package com.boot.finddoctors.service;

import com.boot.finddoctors.dao.UserRepository;
import com.boot.finddoctors.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService{
    private UserRepository repository;

    public UserRepository getRepository() {
        return repository;
    }

    @Autowired
    public void setRepository(UserRepository repository) {
        this.repository = repository;
    }

    @Override
    public User save(User user) {
        return repository.save(user);
    }

}
