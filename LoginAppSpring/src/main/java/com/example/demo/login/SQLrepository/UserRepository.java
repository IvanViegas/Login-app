package com.example.demo.login.SQLrepository;

import com.example.demo.login.SQLservice.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
}
