package com.example.demo.login.SQLrepository;

import com.example.demo.login.SQLservice.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepository extends JpaRepository<User, Integer> {

    List<User> findUserByUsernameAndUserpassword(String user, String password);


}
