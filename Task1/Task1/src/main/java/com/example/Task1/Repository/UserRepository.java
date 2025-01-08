package com.example.Task1.Repository;


import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.Task1.Entity.User;



import java.util.Optional;

public interface UserRepository extends MongoRepository<User, String> {
    Optional<User> findByEmail(String email);
    Optional<User> findByUsername(String username);
}
