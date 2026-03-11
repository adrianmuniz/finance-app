package com.backend.finance.identify.user.domain;

import java.time.Instant;
import java.time.LocalDateTime;

public class User {

    private UserId id;
    private Email email;
    private PasswordHash passwordHash;
    private String name;
    private Instant createdAt;
    private LocalDateTime updatedAt;
    private PlanType planType;

    public User(UserId id, Email email, PasswordHash passwordHash, String name, Instant createdAt, LocalDateTime updatedAt, PlanType planType) {
        this.id = id;
        this.email = email;
        this.passwordHash = passwordHash;
        this.name = name;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.planType = planType;
    }

    public UserId getId() {
        return id;
    }

    public Email getEmail() {
        return email;
    }
}
