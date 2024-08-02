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
        return userRepository.findAll();
    }

    @Override
    public List<User> validarUser(User user) {
        return userRepository.findUserByUsernameAndUserpassword(user.getUsername(), user.getUserpassword());
    }


    @Override
    public void crearUser(User user) {
        userRepository.save(user);
    }

    @Override
    public void eliminarUser (User user){
        userRepository.delete(user);
    }
}
