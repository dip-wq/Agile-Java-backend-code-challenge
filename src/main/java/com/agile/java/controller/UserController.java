package com.agile.java.controller;

import com.agile.java.model.GetUserTreeResponse;
import com.agile.java.model.GetUsersResponse;
import com.agile.java.model.UserDTO;
import com.agile.java.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@RestController
@RequestMapping("/api")
public class UserController {
    private static final Logger LOGGER = LoggerFactory.getLogger(UserController.class);

    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/users")
    public ResponseEntity<GetUsersResponse> getUsers() {
        Collection<UserDTO> users = userService.getAllUsers();
        if(CollectionUtils.isEmpty(users)) {
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.ok(new GetUsersResponse(users));
    }


    @GetMapping("/users/{username}")
    public ResponseEntity<UserDTO> getUserByUsername(@PathVariable String username) {
        UserDTO userDTO = userService.getUserByUsername(username);
        if(Objects.nonNull(userDTO)){
            return ResponseEntity.ok().body(userDTO);
        }
        return ResponseEntity.noContent().build();
    }

    @GetMapping("/users/tree")
    public ResponseEntity<GetUserTreeResponse> getUserTree() {
        Map<String, Map<String, Map<String, List<UserDTO>>>> userTree = userService.getUserTree();
        if(CollectionUtils.isEmpty(userTree)){
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.ok(new GetUserTreeResponse(userTree));
    }

    @DeleteMapping("/users/{username}")
    public ResponseEntity<String> deleteUser(@PathVariable String username) {
        UserDTO userDTO = userService.deleteUser(username);
        if(Objects.nonNull(userDTO)){
            return ResponseEntity.ok().body(String.format("%s is successfully deleted",userDTO.getUserName()));
        }
        return ResponseEntity.noContent().build();
    }
}

