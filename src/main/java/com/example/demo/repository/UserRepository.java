package com.example.demo.repository;

import org.springframework.data.jpa.repository.*;
import org.springframework.data.repository.query.Param;
import com.example.demo.model.User;

public interface UserRepository extends JpaRepository<User, Integer> {

    // Using your MySQL query directly
    @Query(value = "SELECT * FROM users WHERE username = :username AND password = :password", nativeQuery = true)
    User loginUser(@Param("username") String username,
                   @Param("password") String password);
}