package com.authapi.repository;

import com.authapi.model.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Integer> {

    public User findByUsername(String username);
}
