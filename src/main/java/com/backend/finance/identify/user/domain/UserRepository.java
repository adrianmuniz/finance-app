package com.backend.finance.identify.user.domain;

import java.util.Optional;

public interface UserRepository {

    Optional<User> findByEmail(Email email);

    Optional<User> findById(UserId id);

    void save(User user);
}
