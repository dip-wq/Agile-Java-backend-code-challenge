package com.agile.java.model;

import java.util.Collection;
import java.util.List;
import java.util.Map;

public class GetUserTreeResponse {
  private Map<String, Map<String, Map<String, List<UserDTO>>>> userTree;
    public GetUserTreeResponse() {
    }
    public GetUserTreeResponse(Map<String, Map<String, Map<String, List<UserDTO>>>> userTree) {
        this.userTree = userTree;
    }

    public Map<String, Map<String, Map<String, List<UserDTO>>>> getUserTree() {
        return userTree;
    }

    public void setUserTree(Map<String, Map<String, Map<String, List<UserDTO>>>> userTree) {
        this.userTree = userTree;
    }
}
