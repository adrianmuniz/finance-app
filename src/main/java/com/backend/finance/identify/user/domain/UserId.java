package com.backend.finance.identify.user.domain;

import java.util.UUID;

public class UserId {

    private final UUID value;

    public UserId(UUID value) {
        this.value = value;
    }

    public UUID getValue() {
        return value;
    }
}