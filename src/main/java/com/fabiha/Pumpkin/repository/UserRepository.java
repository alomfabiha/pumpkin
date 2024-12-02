package com.fabiha.Pumpkin.repository;

import com.fabiha.Pumpkin.model.User;  // Import the User entity
import org.springframework.data.jpa.repository.JpaRepository;  // Import JpaRepository

// Interface for UserRepository
public interface UserRepository extends JpaRepository<User, Long> {
    // You don't need to write any methods manually
    // Spring Data JPA will automatically provide implementations for common methods like:
    // save(), findById(), findAll(), delete(), etc.
}