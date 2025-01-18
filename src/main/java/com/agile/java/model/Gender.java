package com.agile.java.model;

public enum Gender {
    M("Male"), F("Female");
    private final String value;

    Gender(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
