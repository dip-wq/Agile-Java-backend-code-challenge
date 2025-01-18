package com.agile.java.service;

import com.agile.java.model.UserDTO;
import com.agile.java.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Service
public class UserService {
    private final UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public Collection<UserDTO> getAllUsers() {
        return userRepository.getAllUsers();
    }

    public UserDTO getUserByUsername(String username) {
        return userRepository.getUserByUsername(username);
    }

    public Map<String, Map<String, Map<String, List<UserDTO>>>> getUserTree() {
        Collection<UserDTO> users = getAllUsers();
        return users.stream().collect(Collectors.groupingBy(UserDTO::getCity,
                Collectors.groupingBy(UserDTO::getState,
                        Collectors.groupingBy(UserDTO::getCity))));
    }

    public UserDTO deleteUser(String username) {
        return userRepository.deleteUser(username);
    }
}
