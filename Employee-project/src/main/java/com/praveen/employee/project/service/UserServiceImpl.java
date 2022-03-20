package com.praveen.employee.project.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.praveen.employee.project.model.AppUser;
import com.praveen.employee.project.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public AppUser saveUser(AppUser user) {
        return userRepository.save(user);
    }

}
