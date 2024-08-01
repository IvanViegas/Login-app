package com.example.demo.login.SQLservice;

import java.util.List;

public interface IUserservice {
    public List<User> listarUsers();

    public List<User> validarUser(User user);

    public void crearUser(User user);
}
