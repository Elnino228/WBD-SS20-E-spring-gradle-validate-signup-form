package com.codegym.ums.service;

import com.codegym.ums.model.User;
import com.codegym.ums.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;

public interface UserService {
    Iterable<User> findAll();

    User findById(Long id);

    void save(User user);

    void remove(Long id);
}
