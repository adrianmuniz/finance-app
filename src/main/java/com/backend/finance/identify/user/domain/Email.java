package com.backend.finance.identify.user.domain;

public class Email {

    private final String value;

    public Email(String value) {

        if (!value.contains("@")) {
            throw new IllegalArgumentException("Invalid email");
        }

        this.value = value;
    }

    public String getValue() {
        return value;
    }
}