package com.mudhut.tophut.users;

import java.util.Optional;

import org.springframework.data.repository.ListCrudRepository;

public interface UserRepository extends ListCrudRepository<User, Long> {
    public Optional<User> findUserByEmail(String email);
}
