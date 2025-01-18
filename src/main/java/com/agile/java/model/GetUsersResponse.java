package com.agile.java.model;

import java.util.Collection;

public class GetUsersResponse {
    private Collection<UserDTO> users;
    public GetUsersResponse() {
    }
    public GetUsersResponse(Collection<UserDTO> users) {
    }

    public Collection<UserDTO> getUsers() {
        return users;
    }

    public void setUsers(Collection<UserDTO> users) {
        this.users = users;
    }
}
