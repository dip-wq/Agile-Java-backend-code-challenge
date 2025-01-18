package com.agile.java.repository;

import com.agile.java.model.UserDTO;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
@Repository
public class UserRepository {
    private final Map<String, UserDTO> users;

    public UserRepository() {
        this.users = new HashMap<>();
    }

    public Collection<UserDTO> getAllUsers() {
        return users.values();
    }

    public UserDTO getUserByUsername(String username) {
        return users.get(username);
    }

    public UserDTO deleteUser(String username) {
        return users.remove(username);
    }
}
