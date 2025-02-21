package org.example;

public enum Type {
    INT("int"),
    STRING("String");

    private final String value;

    Type(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}