package com.backend.finance.identify.user.domain;

public class PasswordHash {

    private final String value;

    public PasswordHash(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
