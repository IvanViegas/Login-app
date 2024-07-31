package com.example.demo.login.SQLservice;

import com.example.demo.login.SQLrepository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService implements IUserservice {

@Autowired
private UserRepository userRepository;

    @Override
    public List<User> listarUsers() {
        List<User> users = userRepository.findAll();
        return users;
    }

    @Override
    public void validarUser(User user) {
    }

    @Override
    public void crearUser(User user) {

    }
}
