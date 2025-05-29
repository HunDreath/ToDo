package com.Algiz.ToDoApp.Service;

import com.Algiz.ToDoApp.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public boolean findByUserNameAndMdp(String name, String mdp) {
        return userRepository.countUser(name, mdp) >= 1;
    }

}
