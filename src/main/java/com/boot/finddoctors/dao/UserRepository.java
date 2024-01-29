package com.boot.finddoctors.dao;

import com.boot.finddoctors.model.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<User , Integer> {
}
