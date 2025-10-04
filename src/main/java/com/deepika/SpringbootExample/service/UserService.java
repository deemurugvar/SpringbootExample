package com.deepika.SpringbootExample.service;

import com.deepika.SpringbootExample.models.User;
import com.deepika.SpringbootExample.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public User createUser(User User)
    {
        return UserRepository.save(User);
    }

    public User getUserById(Integer id)
    {
        return UserRepository.findById(id).orElseThrow(() -> new RuntimeException("User not found"));
    }
    
}
